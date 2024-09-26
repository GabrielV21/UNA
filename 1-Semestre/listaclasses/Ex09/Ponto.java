package Ex09;
public class Ponto {
    public double x;
    public double y;

    public void imprimir() {
        System.out.println("X: " + x + " Y: " + y);
    }
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
}