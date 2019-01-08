package desafiona;

/*INÍCIO DA CLASSE TICKET
    Essa classe é a representação dos tickets fornecidos em tickets.json um objeto java com o qual eu pudesse trabalhar.
    É um objeto simples, composto por métodos getters e setters, de acordo com as boas práticas da orientação a objetos.*/
public class Ticket {

    private int diaUpdt, mesUpdt, anoUpdt, diaCrt, mesCrt, anoCrt, pontuacao, desempateCrt, desempateUpdt, desempate;
    public String ticketID = new String(); //contém o ticket inteiro, não só o ID

    Ticket(){
        this.desempateCrt = 0;
        this.desempateUpdt = 0;
        this.pontuacao = 0;
        this.desempate = 0;
    }
    

    public void setDataUpdt(String dataUpdt) {
        String [] data = new String[3];
        data[0] = new String();
        data[1] = new String();
        data[2] = new String();
        
        data = dataUpdt.split("-");
        
        
        this.anoUpdt = Integer.parseInt(data[0]);
        this.mesUpdt = Integer.parseInt(data[1]);
        this.diaUpdt = Integer.parseInt(data[2]);
    }

    public void setDataCrt(String dataCrt) {
        String [] data = new String[3];
        data[0] = new String();
        data[1] = new String();
        data[2] = new String();
        
        data = dataCrt.split("-");
        
        //System.out.println("Criado: " + data[2] + "/" + data[1] + "/" + data[0]);
        this.anoCrt = Integer.parseInt(data[0]);
        this.mesCrt = Integer.parseInt(data[1]);
        this.diaCrt = Integer.parseInt(data[2]);
    }

    public int getDiaUpdt() {
        return diaUpdt;
    }

    public int getMesUpdt() {
        return mesUpdt;
    }

    public int getAnoUpdt() {
        return anoUpdt;
    }

    public int getDiaCrt() {
        return diaCrt;
    }

    public int getMesCrt() {
        return mesCrt;
    }

    public int getAnoCrt() {
        return anoCrt;
    }

    public void calculaPontuacao(int pontos) {
        pontuacao += pontos;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getDesempateCrt() {
        return desempateCrt;
    }
    
    public int getDesempateUpdt() {
        return desempateUpdt;
    }

    public void setDesempate() {
        this.desempateCrt = this.anoCrt + this.diaCrt + this.mesCrt;
        this.desempateUpdt = this.anoUpdt + this.diaUpdt + this.mesUpdt;
    }

    public int getDesempate() {
        return desempate;
    }

    public void setDesempate(int desempate) {
        this.desempate = desempate;
    }
    
    public String getTextoLegivel(){
        char [] palavras;
        String textoLegivel = "";
        int i;
        
        palavras = ticketID.toCharArray();
        //System.out.println(palavras.length);
        for(i=0; i<palavras.length; i++){
            textoLegivel += palavras[i] + "  ";
        }
        return textoLegivel;
    }
    
}
//FIM DA CLASSE TICKET