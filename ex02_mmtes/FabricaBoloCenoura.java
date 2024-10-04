package ex02_mmtes;

public class FabricaBoloCenoura extends FabricaBolo{
    @Override
    public Bolo criarBolo() {
        return new BoloCenoura();
    }
}
