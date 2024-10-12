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
    public double custo() {
        double adicional = 0.0;
        switch (wrappee.getTamanho()) {
            case PEQUENO:
                adicional = 1.00;
                break;
            case MEDIO:
                adicional = 1.50;
                break;
            case GRANDE:
                adicional = 2.00;
                break;
        }
        return wrappee.custo() + adicional;
    }
}
