package ex03_mmtes;

public class LeiteCondensado extends BaseDecorator{

    public LeiteCondensado(Adicional wrappe) {
        super(wrappe);
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", mais adicional de LeiteCondensado";
    }
    @Override
    public double custo(){
        return wrappee.custo();
    }
}
