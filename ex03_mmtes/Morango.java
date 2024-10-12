package ex03_mmtes;

public class Morango extends BaseDecorator{

    public Morango(Adicional wrappe) {
        super(wrappe);
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", mais adicional de Morango";
    }
    @Override
    public double custo(){
        return wrappee.custo();
    }
}
