package desafiona;

import java.io.IOException;

/* INÍCIO DA CLASSE DICIONÁRIO
    A classe a seguir é um dicionário de palavras negativas, as quais podem indicar que o cliente está insatisfeito e, portanto,
é de alta prioridade. A classe é responsável pela leitura das palavras no arquivo txt e no ticket, fazer a comparação e pontuar de acordo. */

public class Dicionario {
    String nomeArq = "dicionario.txt";
    String [] dicionario = new String[19];
    static int j = 0;
    
    /* O método a seguir verifica se existe alguma das palavras do dicionário no ticket em questão,
    indicando que o consumidor esta irritado ou insatisfeito. A partir disso, somam-se 10 pontos por meio do método
    calculaPontuacao() por palavra encontrada, caso contrário não soma-se apenas 1. */
    
    public static void verificaIncidencia(String [] dicionario, Ticket t) throws IOException{
        int i;
        int normal = 1, alta = 10;
        
        for(i=0; i<19; i++){ //comparando as 19 palavras do dicionário com as contidas no ticket
            
            if(t.ticketID.contains(dicionario[i]) == true){ //comparação
                
                t.calculaPontuacao(alta); //prioridade alta
                
            }else{
                t.calculaPontuacao(normal); //prioridade normal
            }
        }
    } 
}
//FIM DA CLASSE DICIONÁRIO