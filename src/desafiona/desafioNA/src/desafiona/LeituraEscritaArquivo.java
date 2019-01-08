package desafiona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/*INÍCIO DA CLASSE LeituraEscritaArquivo
    A classe a seguir manipula os arquivos de entrada e saída*/

public class LeituraEscritaArquivo implements Closeable{
    static int contador = 0;
    static boolean parada = false;
    static BufferedReader leitor;
    static PrintWriter escritor; 
    
    /*Início do método verificaParada, que verifica se o ticket chegou ao fim*/
    
    private static void verificaParada(String linha) {
        if(linha.contains("-*-")) parada = true;
    }
    //Fim do método verificaParada
    
    //------------------
    
    /*Início do método inicializa, que inicializa o leitor de arquivos que continua a leitura pausada*/
    
    public static void inicializa(String nomeArq) throws UnsupportedEncodingException, FileNotFoundException{
        leitor = new BufferedReader(new InputStreamReader(new FileInputStream(nomeArq), "UTF-8"));
    }
    //Fim do método inicializa
    
    //------------------
    
    /*Início do método inicializaEscritor que inicializa o escritor de arquivos*/
    
    public static void inicializaEscritor(String nomeArquivo) throws FileNotFoundException, UnsupportedEncodingException{
        escritor = new PrintWriter(nomeArquivo, "UTF-8");
    }
    //Fim do método inicializaEscritor
    
    //------------------
    
    /*Início do método le. Este método continua lendo de onde parou antes; utlizado pra pegar ticket por ticket INTEIRO;*/
    
    public static String le() throws IOException {
        String linha;
        String textoArq = "";
        int j = contador;
        
        //enquanto o ticket não tiver acabado
        while(parada == false){
            //leia a proxima linha
            linha = leitor.readLine();
            //veja se essa linha é a linha final
            if (j!=contador) verificaParada(linha);
            //se sim, pause a leitura
            if (parada == true) break; //redundante, mas por precaução
            //se não, some a linha à string do texto total do ticket
            textoArq += linha + "\n";
            j++;
        }
        contador++;
        parada = false;
        textoArq = textoArq.toUpperCase();
        return textoArq;
    }
    //Fim do método le
    
    //------------------
    
    /*Início do método le sobrecarregado, responsável por ler as palavras do dicionário.txt e colocar em maiúsculo no vetor*/
    public static void le(String nomeArquivo, String [] texto) throws IOException {
        
        BufferedReader leitor1 = new BufferedReader(new InputStreamReader(new FileInputStream(nomeArquivo), "UTF-8"));
        String linha = "";
        int i;

        for(i=0; i<19; i++){
            linha = leitor1.readLine();
            texto[i] = linha.toUpperCase();
        }
        leitor1.close();
    }
    //Fim do método le sobrecarregado
    
    //-----------------
    
    /*Início do método escreve, o qual escreve os resultados dos procedimentos nos arquivos de saída*/
    public static void escreve(Ticket [] t) throws IOException {
        String nomeArquivo = "ticketsOrdenados.json", nomeArquivo2 = "ticketsOrdenados.txt";
        int i;
        inicializaEscritor(nomeArquivo);
        for(i=0; i<25; i++){
            escritor.println("{");
            escritor.println("PONTUAÇÃO: " + t[i].getPontuacao());
            if(t[i].getPontuacao() < 20) escritor.println("PRIORIDADE: NORMAL");
            else escritor.println("PRIORIDADE: ALTA");
            escritor.println("-----------------");
            escritor.println(t[i].ticketID);
            escritor.println("}");
            escritor.println();
        }
        
        escritor.close();
        
        inicializaEscritor(nomeArquivo2);
        for(i=0; i<25; i++){
            escritor.println("{");
            escritor.println("PONTUAÇÃO: " + t[i].getPontuacao());
            if(t[i].getPontuacao() < 20) escritor.println("PRIORIDADE: NORMAL");
            else escritor.println("PRIORIDADE: ALTA");
            escritor.println("-----------------");
            escritor.println(t[i].ticketID);
            escritor.println("}");
            escritor.println();
        }
        
        escritor.close();
    }
    //Fim do método escreve
    
    //-----------------
    
    @Override
    public void close() throws IOException {
        leitor.close();
    }
}
//FIM DA CLASSE LeituraEscritaArquivo