package Ex07;
public class Tamagushi {
    private String nome;
    private int idade;
    private int fome;
    private int saude;

    public void setNome(String nome) {this.nome = nome;}
    public void setFome(int fome) {this.fome = fome;}
    public void setSaude(int saude) {this.saude = saude;}
    public void setIdade(int idade) {this.idade = idade;}

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public int getFome() { return fome;}
    public int getSaude() { return saude; }

    public int getHumor() {
        int humor = saude * fome;
        return humor;
    }
    public Tamagushi(String nome, int idade, int fome, int saude) {
        this.nome = nome;
        this.idade = idade;
        this.fome = fome;
        this.saude = saude;
    }
}