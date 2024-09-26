package Ex05;
public class ContaCorrente {
    private final int nmrConta;
    private String nome;
    private double saldo=0;

    public void setNome(String nome) {this.nome= nome;}
    public String getNome() {return nome;}
    public double getSaldo() {return saldo;}
    public int getNmrConta() {return nmrConta;}

    public void depositar(double valorDeposito){
        saldo += valorDeposito;
    }
    public void sacar(double valorSaque){
        saldo -= valorSaque;
    }
    public ContaCorrente(int nmrConta, String nome) {
        this.nmrConta = nmrConta; 
        this.nome = nome;
    }
}