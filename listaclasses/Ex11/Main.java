package Ex11;

public class Main {
    public static void main(String[] args) {
        Carro civic = new Carro(10);
        civic.adicionarGasolina(20);
        civic.obterGasolina();
        civic.andar(200);
        civic.obterGasolina();
    }
}
