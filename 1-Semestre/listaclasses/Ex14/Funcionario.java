package Ex14;

public class Funcionario {
    private String nome;
    private double salario;
    public String getNome(){ return nome; }
    public double getSalario(){ return salario; }

    public void aumentarSalario(double porcentagemAumento){
        salario += salario * (porcentagemAumento/100);
    }

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
}
