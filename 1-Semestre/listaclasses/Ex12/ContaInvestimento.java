package Ex12;

public class ContaInvestimento {
    private final int nmrConta;
    private String nome;
    private double saldo=0;
    private double taxaJuros;

    public void setNome(String nome) {this.nome= nome;}
    public double getTaxaJuros() {return taxaJuros;}
    public String getNome() {return nome;}
    public double getSaldo() {return saldo;}
    public int getNmrConta() {return nmrConta;}

    public void depositar(double valorDeposito){
        saldo += valorDeposito;
    }
    public void sacar(double valorSaque){
        saldo -= valorSaque;
    }
    public void adicionarJuros(){
        saldo += saldo*(taxaJuros/100);
    }
    public ContaInvestimento(int nmrConta, String nome, double saldo, double taxaJuros) {
        this.nmrConta = nmrConta; 
        this.nome = nome;
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }
}
