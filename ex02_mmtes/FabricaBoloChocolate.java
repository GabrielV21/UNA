package ex02_mmtes;

public class FabricaBoloChocolate extends FabricaBolo{
    @Override
    public Bolo criarBolo() {
        return new BoloChocolate();
    }
}
