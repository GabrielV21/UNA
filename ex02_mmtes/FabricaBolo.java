package ex02_mmtes;

public abstract class FabricaBolo {
    abstract Bolo criarBolo();

    void fazerBolo(){
        Bolo bolo = criarBolo();
        bolo.preparar();
    }
}
