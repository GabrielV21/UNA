package Ex11;

public class Carro {
    double consumo, nivelCombustivel = 0;

    public void andar(double distancia) {
        nivelCombustivel -= distancia / consumo;
    }

    public void obterGasolina() {
        System.out.println(nivelCombustivel);
    }

    public void adicionarGasolina(double litros) {
        nivelCombustivel += litros;
    }

    public Carro(double consumo) {
        this.consumo = consumo;
    }
}
