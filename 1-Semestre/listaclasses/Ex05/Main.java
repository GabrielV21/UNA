package Ex05;
public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(12, "Vitu");
        c1.depositar(20500);
        c1.sacar(500);
        System.out.println("Saldo: R$"+c1.getSaldo());
    }
}