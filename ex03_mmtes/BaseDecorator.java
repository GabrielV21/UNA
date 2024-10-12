package ex03_mmtes;

public class BaseDecorator implements Adicional{
    
    protected Adicional wrappee;

    public BaseDecorator(Adicional wrappe){
        this.wrappee = wrappe;
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao();
    }

    @Override
    public double custo() {
        return wrappee.custo();
    }

}
