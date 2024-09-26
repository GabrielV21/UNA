package Ex02;
public class Quadrado {
    private double lado;
    public double getLado(){
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double calcArea(){
        return lado*lado;
    }
}