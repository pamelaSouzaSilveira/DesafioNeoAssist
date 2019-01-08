package desafiona;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//INÍCIO DA CLASSE PRINCIPAL DESAFIO NEOASSIST:
public class DesafioNA {

    final static int QTD_TICKETS = 25;
    public static Ticket[] tickets = new Ticket[QTD_TICKETS];
    public static ComparadorDeInformacoes comp = new ComparadorDeInformacoes();

    /* INÍCIO DA CLASSE INTERNA COMPARADOR DE INFORMAÇÕES: 
    
        A classe a seguir vai identificar e lidar com os prazos de resolução dos tickets e pontuá-los de acordo, bem como
        com o número de iterações dos consumidores */
    
    public static class ComparadorDeInformacoes {

        /*Início do método leDatas que lê e identifica as datas de criação e de atualização 
        de um determinado ticket e as armazena nele*/
        
        public void leDatas(Ticket t) {

            char[] colunasTextoTicket;
            String dataCrt = "", dataUpdt = "";
            int i;

            int indiceComecoCrt = t.ticketID.indexOf("DATECREATE") + 10; 
                //acima: onde a data de criação começa, tirando o pedaço da string "DATECREATE"
            int indiceFinalCrt = t.ticketID.indexOf("DATEUPDATE") - 9; 
                //acima: onde a data de criação termina
                //ou seja, quando a data de atualização começa, porém sem o pedaço da string "DATEUPDATE"
            int indiceComecoUpdt = t.ticketID.indexOf("DATEUPDATE") + 10; 
                //onde a data começa, tirando o pedaço da string "DATEUPDATE"
            int indiceFinalUpdt = t.ticketID.indexOf("INTERACTIONS") - 9;
                //acima: onde a data de atualização termina
                //ou seja, quando a sessão Interactions começa, porém sem o pedaço da string "INTERACTIONS"
                
            if ((indiceComecoCrt > 0) && (indiceFinalCrt > 0) && (indiceComecoUpdt > 0) && (indiceFinalUpdt > 0)) {
                //transformando a string em um vetor char para acessar os índices:
                colunasTextoTicket = t.ticketID.toCharArray();
                
                //pegando a parte da string que contém a data de criação:
                for (i = indiceComecoCrt; i < indiceFinalCrt; i++) {
                    dataCrt += colunasTextoTicket[i];
                }
                //armazenando esses dados no ticket em questão:
                t.setDataCrt(dataCrt);
                
                //pegando a parte da string que contém a data de criação:
                for (i = indiceComecoUpdt; i < indiceFinalUpdt; i++) {
                    dataUpdt += colunasTextoTicket[i];
                }
                //armazenando esses dados no ticket em questão:
                t.setDataUpdt(dataUpdt);
            }

        }

        //Fim do método leDatas
        
        // -----------------------
        
        /*Início do método contaIterações, no qual são contadas quantas mensagens o cliente mandou ao longo
        do atendimento e pontua-se de acordo (a cada nova mensagem, soma-se um ponto)*/
        
        public void contaIteracoes(Ticket t) {
            int pontos = 0;
            Pattern palavra = Pattern.compile("SENDERCUSTOMER");
            Matcher buscadorPalavra = palavra.matcher(t.ticketID);
            while (buscadorPalavra.find()) {
                pontos++;
            }
            t.calculaPontuacao(pontos);
        }
        //Fim do método contaIterações
        
        //--------------------

        /*Início do método somaDatas, o qual, para todo ticket, vai chamar o método setDesempate, 
        que realiza a soma = ano + mes + dia para as datas de Criação e Atualização de cada ticket*/
        public void somaDatas(Ticket[] t) {
            int i;
            for (i = 0; i < QTD_TICKETS; i++) {
                t[i].setDesempate();
            }
        }
        //Fim do método somaDatas
        
        //---------------------
        
        /*Início do método subtraiDatas, responsável por chamar o método sobrecarregado setDesempate (subtração),
        passando como parâmetro a subtração entre a soma dos dígitos da data de Atualização 
        e a soma dos dígitos da data de Criação. 
        Por exemplo:
            Data de criação: 11/01/2016 -> 11+01+2016 = 2028; 
            Data de atualização: 12/03/2017 -> 12+03+2017 = 2032;
            Subtração = 2032 - 2028 = 4;
        A subtração é somada na pontuação posteriormente para fins de desempate, de modo que, 
        quanto maior a diferença entre essa soma (ou seja, mais tempo decorrido entre a solicitação e a resposta),
        maior será a pontuação do ticket;
        */
        
        public void subtraiDatas(Ticket[] t) {
            int i;
            for (i = 0; i < QTD_TICKETS; i++) {
                t[i].setDesempate(t[i].getDesempateUpdt() - t[i].getDesempateCrt());
            }
        }
        //Fim do método subtraiDatas
        
        //---------------------
        
        /*Início do método pontuaPorPrazo, que soma a subtração resultante do método acima na pontuação de cada ticket*/
        
        public void pontuaPorPrazo(Ticket[] t) {
            int i;
            for (i = 0; i < QTD_TICKETS; i++) {
                t[i].calculaPontuacao(t[i].getDesempate());
            }
        }
        //Fim do método pontuaPorPrazo
        
        //---------------------
        
        /*Início do método estaOrdenado que, como o nome já indica, verifica se o vetor de Tickets esta ordenado 
        de acordo com determinado critério*/
        
        public boolean estaOrdenado(Ticket[] t, String criterio) {
            int i;
            if (criterio.equalsIgnoreCase("Pnt")) {
                for (i = 0; i < QTD_TICKETS - 1; i++) {
                    //se existe algum ticket na posição i que tem pontuação [...]
                    //[...] menor que o da posição i+1, o vetor não esta ordenado
                    if (!(t[i].getPontuacao() >= t[i + 1].getPontuacao())) {
                        return false;
                    }
                }
            } else {
                if (criterio.equalsIgnoreCase("Crt")) {
                    for (i = 0; i < QTD_TICKETS - 1; i++) {
                        //se existe algum ticket na posição i que tem a soma da data de criação (DD+MM+AAAA) [...]
                        //[...] menor que o da posição i+1, o vetor não esta ordenado
                        if (!(t[i].getDesempateCrt() >= t[i + 1].getDesempateCrt())) {
                            return false;
                        }
                    }
                } else {
                    if (criterio.equalsIgnoreCase("Updt")) {
                        for (i = 0; i < QTD_TICKETS - 1; i++) {
                            //se o ano de i é maior que i+1, esta na posição correta
                            if (t[i].getAnoUpdt() > t[i + 1].getAnoUpdt()) {
                                continue;
                            } else {
                                //se não, caso o ano de i seja menor, o vetor não está ordenado
                                if (t[i].getAnoUpdt() < t[i + 1].getAnoUpdt()) {
                                    return false;
                                } else {
                                    //se não, caso os anos sejam iguais, verifique o mês
                                    if (t[i].getAnoUpdt() == t[i + 1].getAnoUpdt()) {
                                        //se o mes de i é maior, esta na posição correta
                                        if (t[i].getMesUpdt() > t[i + 1].getMesUpdt()) {
                                            continue;
                                        } else {
                                            //se não, caso o mes de i seja menor, o vetor não está ordenado
                                            if (t[i].getMesUpdt() < t[i + 1].getMesUpdt()) {
                                                return false;
                                            } else {
                                                //se não, caso os meses sejam iguais, verifique os dias
                                                if (t[i].getMesUpdt() == t[i + 1].getMesUpdt()) {
                                                    //se o dia de i for menor, o vetor não está ordenado
                                                    if (t[i].getDiaUpdt() < t[i + 1].getDiaUpdt()) {
                                                        return false;
                                                    } else {
                                                        //do contrário, esta ordenado 
                                                        //não foi considerado o horário caso os dias sejam iguais [...]
                                                        //[...] porque foi pedido como critério a DATA apenas
                                                        continue;
                                                    }

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (criterio.equalsIgnoreCase("PntInverso")) {
                            //PntInverso = Pontuação inversa (crescente) = menor prioridade primeiro
                            //se existe algum ticket na posição i que tem pontuação [...]
                            //[...] maior que o da posição i+1, o vetor não esta ordenado
                            for (i = 0; i < QTD_TICKETS - 1; i++) {
                                if (!(t[i].getPontuacao() <= t[i + 1].getPontuacao())) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        //Fim do método estaOrdenado
        
        //---------------------
        
        /*Início do método ordenaTickets que faz uma ordenação simples entre os elementos já que o tamanho de N é pequeno (25).
        Caso N fosse maior, poderia ser utilizada uma técnica mais sofisticada de ordenação como o Mergesort ou Quicksort, 
        já que neste caso o desempenho seria prejudicado pelo método atual de ordenação.*/
        public void ordenaTickets(Ticket[] t, String criterio) {
            int i;
            Ticket aux;
            if (criterio.equalsIgnoreCase("Pnt")) {
                //Pnt = Pontuação
                //enquanto o vetor não estiver ordenado, repita o processo de ordenação
                while (estaOrdenado(t, criterio) == false) {
                    for (i = 0; i < QTD_TICKETS - 1; i++) {
                        //se a pontuação de i for maior ou igual a de i+1, esta na posição correta, siga para a prox. posição
                        if (t[i].getPontuacao() >= t[i + 1].getPontuacao()) {
                            continue;
                        } else {
                            //se não, troque suas posições
                            aux = t[i];
                            t[i] = t[i + 1];
                            t[i + 1] = aux;
                        }

                    }
                }

            } else {
                if (criterio.equalsIgnoreCase("Crt")) {
                    //Crt = Create
                    //enquanto o vetor não estiver ordenado, repita o processo de ordenação
                    while (estaOrdenado(t, criterio) == false) {
                        for (i = 0; i < QTD_TICKETS - 1; i++) {
                            //se a soma da data de criação (DD+MM+AAAA) de i for maior que de i+1, siga para a prox. posição
                            if (t[i].getDesempateCrt() >= t[i + 1].getDesempateCrt()) {
                                continue;
                            } else {
                                //se não, troque suas posições
                                aux = t[i];
                                t[i] = t[i + 1];
                                t[i + 1] = aux;
                            }

                        }
                    }

                } else {
                    if (criterio.equalsIgnoreCase("Updt")) {
                        //Updt = Update
                        //enquanto o vetor não estiver ordenado, repita o processo de ordenação
                        while (estaOrdenado(t, criterio) == false) {
                            for (i = 0; i < QTD_TICKETS - 1; i++) {
                                //se o ano de i for maior que o de i+1, esta correto, siga para a prox. posição
                                if(t[i].getAnoUpdt() > t[i+1].getAnoUpdt()){
                                    continue;
                                }else{
                                    //se não, caso o ano de i seja menor, troque suas posições
                                    if(t[i].getAnoUpdt() < t[i+1].getAnoUpdt()){
                                        aux = t[i];
                                        t[i] = t[i + 1];
                                        t[i + 1] = aux;
                                    }else{
                                        //se não, caso os anos sejam iguais, verifique o mes
                                        if(t[i].getAnoUpdt() == t[i+1].getAnoUpdt()){
                                            //se o mes de i for maior, esta correto, siga para a prox. posição
                                            if (t[i].getMesUpdt() > t[i + 1].getMesUpdt()) {
                                                continue;
                                            } else {
                                                //se o mes de i for menor, troque suas posições
                                                if (t[i].getMesUpdt() < t[i + 1].getMesUpdt()) {
                                                    aux = t[i];
                                                    t[i] = t[i + 1];
                                                    t[i + 1] = aux;
                                                } else {
                                                    //se não, caso os meses sejam iguais, verifique o dia
                                                    if (t[i].getMesUpdt() == t[i + 1].getMesUpdt()) {
                                                        //se o dia de i for menor, troque suas posições
                                                        if (t[i].getDiaUpdt() < t[i + 1].getDiaUpdt()) {
                                                            aux = t[i];
                                                            t[i] = t[i + 1];
                                                            t[i + 1] = aux;
                                                        } else {
                                                            //se não, esta na posição correta, passe para a prox. posição
                                                            //não foi levado em conta o horário pois foi pedido como critério[...]
                                                            //[...] a DATA apenas
                                                            continue;
                                                        }

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    } else {
                        if (criterio.equalsIgnoreCase("PntInverso")) {
                            //PntInverso = Pontuação Inversa (crescente) = pontuação menor primeiro 
                            //enquanto o vetor não estiver ordenado, repita o processo de ordenação
                            while (estaOrdenado(t, criterio) == false) {
                                for (i = 0; i < QTD_TICKETS - 1; i++) {
                                    //se a pontuação de i for menor ou igual que a de i+1, esta correto, siga para a prox. posição
                                    if (t[i].getPontuacao() <= t[i + 1].getPontuacao()) {
                                        continue;
                                    } else {
                                        //do contrário, troque suas posições
                                        aux = t[i];
                                        t[i] = t[i + 1];
                                        t[i + 1] = aux;
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }

    }
    
    //FIM DA CLASSE INTERNA COMPARADOR DE INFORMAÇÕES

    //----------------------------------------------------
    
    //INÍCIO DO MAIN DA CLASSE DESAFIO NEOASSIST
    
    public static void main(String args[]) throws IOException {
        /*O arquivo tickets.json foi convertido para um arquivo .txt 
        utilizando a ferramenta online disponÍvel em https://onlinejsontools.com/convert-json-to-text*/

        String nomeArquivo1 = "tickets.txt", nomeArquivo2 = "dicionario.txt";
        Dicionario dicionario = new Dicionario();
        String ticketsTexto = "";
        //ComparadorDeInformacoes comp = new ComparadorDeInformacoes();
        int i = 0;

        LeituraEscritaArquivo.inicializa(nomeArquivo1);
        LeituraEscritaArquivo.le(nomeArquivo2, dicionario.dicionario);

        for (i = 0; i < QTD_TICKETS; i++) {
            ticketsTexto = LeituraEscritaArquivo.le(); //pega um ticket inteiro
            tickets[i] = new Ticket(); //instancia um ticket na determinada posição do vetor
            tickets[i].ticketID = ticketsTexto;
            comp.leDatas(tickets[i]);
            //PARTE 1: Verificar se o cliente está bravo:
            Dicionario.verificaIncidencia(dicionario.dicionario, tickets[i]);
            comp.contaIteracoes(tickets[i]);
        }

        //PARTE 2: Verificar quem reclamou mais vezes/primeiro
        comp.somaDatas(tickets);
        comp.subtraiDatas(tickets);
        comp.pontuaPorPrazo(tickets);
        comp.ordenaTickets(tickets, "Pnt"); //ordenação dos tickets para pôr no arquivo .txt

        //PARTE 3: Escrever resultados no arquivo 
        LeituraEscritaArquivo.escreve(tickets);
        
        
        //PARTE 4: Iniciar a interface do sistema 
        JanelaPesquisa sistema = new JanelaPesquisa();
        sistema.init();
    }

    //FIM DO MAIN DA CLASSE DESAFIO NEOASSIST
}

//FIM DA CLASSE PRINCIPAL DESAFIO NEOASSIST
