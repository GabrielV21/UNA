package ex03_mmtes;

public class Acai implements Adicional{
    Tamanho tamanho;

    public Acai(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return "Acai";
    }

    @Override
    public double custo() {
        switch (tamanho) {
            case PEQUENO:
                return 7.00;
            case MEDIO:
                return 9.00;
            case GRANDE:
                return 12.00;
            default:
                return 7.00;
        }
    }

    @Override
    public Tamanho getTamanho() {  
        return this.tamanho;
    }
    
}
