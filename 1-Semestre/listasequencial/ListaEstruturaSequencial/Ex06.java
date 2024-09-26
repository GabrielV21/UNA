package listadeexercicio;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o raio do circulo: ");
        double raio = sc.nextDouble();
        sc.close();
        double area = (3.14*(raio*raio)); 
        System.out.println("A area do circulo é: " + area);
    }
}
