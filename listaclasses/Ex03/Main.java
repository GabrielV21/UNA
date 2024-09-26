package Ex03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo r = new Retangulo();
        System.out.println("Informe o valor do LadoA: ");
        r.setLadoA(sc.nextDouble());
        System.out.println("Informe o valor do LadoB: ");
        r.setLadoB(sc.nextDouble());
        sc.close();
        System.out.println("A area: " + r.calcArea());
        System.out.println("O perimetro: " + r.calcPerimeter());
    }
}