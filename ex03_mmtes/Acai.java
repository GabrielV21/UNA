package ex03_mmtes;

public class Acai implements Adicional{

    @Override
    public String getDescricao() {
        return "Acai normal.";
    }

    @Override
    public double custo() {
        return 9.50;
    }
    
}
