package Ex10;
public class BombaCombustivel {

    private String tipoCombustivel;
    private double valorLitro;
    private double qtdCombustivel;

    public void setCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public void setValor(double valorLitro) {
        this.valorLitro = valorLitro;
    }
    public void setQtdCombustivel(double qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    public String getTipoCombustivel(){return tipoCombustivel;}
    public double getQtdCombustivel(){return qtdCombustivel;}
    public double getValorLitro(){return valorLitro;}

    public double abastercerPorValor(double valor){
        double litros = valor/valorLitro;
        if (qtdCombustivel > litros) {
            qtdCombustivel -= litros;
        } else {
            System.out.println("Quantidade de combustivel insuficiente na bomba!");
        }
        return litros;
    }
    public double abastercerPorLitro(double litros){
        double valor = litros*valorLitro;
        if (qtdCombustivel > litros) {
            qtdCombustivel -= litros;
        } else {
            System.out.println("Quantidade de combustivel insuficiente na bomba!");
        }
        return valor;
    }
    public BombaCombustivel(String tipoCombustivel, double valorLitro, double qtdCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.qtdCombustivel = qtdCombustivel;
    }
}