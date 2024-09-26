package Ex14;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Eduardo", 1800);
        f1.aumentarSalario(10);
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Novo salario: R$"+ f1.getSalario());
    }
}
