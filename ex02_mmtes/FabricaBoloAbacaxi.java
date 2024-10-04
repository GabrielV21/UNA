package ex02_mmtes;

public class FabricaBoloAbacaxi extends FabricaBolo{
    @Override
    public Bolo criarBolo() {
        return new BoloAbacaxi();
    }
}
