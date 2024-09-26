package Ex17;

public class Tamagushi_V4 {
    private String nome;
    private int idade;
    private int fome;
    private int saude;

    public void setNome(String nome) {this.nome = nome;}
    public void setSaude(int saude) {this.saude = saude;}
    public void setIdade(int idade) {this.idade = idade;}

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public int getFome() { return fome;}
    public int getSaude() { return saude; }

    public void comer(int qtdComida){
        if (qtdComida >=0 && qtdComida <=100) {
            fome -= qtdComida/2;
        }
    }
    public void brincar(int quantidade){
        if (quantidade >0 && quantidade <100) {
            saude += quantidade/10;
        }
    }

    public String getHumor() {
        String humor="";
        
        if (fome > 40 || saude<60){
            humor = "Mal-humorado";
        } else if(fome < 40 || saude >60) {
            humor = "Bem-humorado";
        }
        return humor;
    }
    public void status(){
        System.out.println("-------------STATUS-------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Saude: " + this.getSaude());
        System.out.println("Nivel de fome: " + this.getFome());
        System.out.println("Humor: " + this.getHumor());
        System.out.println("--------------------------------");

    }
    public Tamagushi_V4(String nome, int idade, int saude, int fome) {
        this.nome = nome;
        this.idade = idade;
        this.saude = saude;
        this.fome = fome;
    }
}
