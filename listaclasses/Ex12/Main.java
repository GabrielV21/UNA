package Ex12;

public class Main {
    public static void main(String[] args) {
        ContaInvestimento c1 = new ContaInvestimento(1,"Poupança",1000,10);
        c1.adicionarJuros();
        c1.adicionarJuros();
        c1.adicionarJuros();
        c1.adicionarJuros();
        c1.adicionarJuros();
        System.out.println("Saldo de: R$"+c1.getSaldo());
    }
}
