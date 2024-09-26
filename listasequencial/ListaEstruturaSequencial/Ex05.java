package listadeexercicio;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a medida em metros: ");
        float num = sc.nextFloat();
        sc.close();
        System.out.println("A medida em centímetros é: " + num*100);
    }
}
