package Ex08;
public class Macaco {
    private String nome;
    private int i = 0;
    private String[] bucho = new String[3];

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome=nome;}
    
    public void comer(String comida) {
        this.bucho[i] = comida;
        i++;
    }
    public void verBucho() {
        for (int j = 0; j<i; j++) {
            System.out.println(bucho[j]);
        }
    }
    public void digerir() {
        for (int l = 0; l < i; l++) {
            bucho[l] = "";
        }
    }
}