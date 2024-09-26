package Ex09;
public class Retangulo {
    public double largura;
    public double altura;

    public void centro() {
        double larguraCentro = largura/2;
        double alturaCentro = altura/2;
        System.out.println("Largura do Centro: " + larguraCentro + " Altura do Centro: " + alturaCentro); 
    }
    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }
}