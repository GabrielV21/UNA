package ex02_mmtes;

public class FabricaBoloMorango extends FabricaBolo{
    @Override
    public Bolo criarBolo() {
        return new BoloMorango();
    }
}
