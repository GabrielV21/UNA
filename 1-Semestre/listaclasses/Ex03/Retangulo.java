package Ex03;
public class Retangulo {
    private double ladoA;
    private double ladoB;
    public double getLadoA() {
        return ladoA;
    }
    public double getLadoB() {
        return ladoB;
    }
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    public double calcArea() {
        return ladoA * ladoB;
    }
    public double calcPerimeter() {
        return (2*ladoA + 2*ladoB);
    }
}