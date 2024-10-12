package ex03_mmtes;

public class Banana extends BaseDecorator{

    public Banana(Adicional wrappe) {
        super(wrappe);
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", mais adicional de Banana";
    }
    @Override
    public double custo(){
        return wrappee.custo();
    }
}
