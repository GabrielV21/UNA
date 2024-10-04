package ex02_mmtes;

public class Principal {
    public static void main(String[] args) {
        FabricaBolo fabricaChoco = new FabricaBoloChocolate();
        fabricaChoco.fazerBolo();

        FabricaBolo fabricaMoran = new FabricaBoloMorango();
        fabricaMoran.fazerBolo();

        FabricaBolo fabricaCenou = new FabricaBoloCenoura();
        fabricaCenou.fazerBolo();

        FabricaBolo fabricaAbaca = new FabricaBoloAbacaxi();
        fabricaAbaca.fazerBolo();
    }
}
