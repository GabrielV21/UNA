package listadeexercicio;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celsius: ");
        double C = sc.nextDouble();
        double F = (C*1.8)+32;
        System.out.printf("A temperatura em Fahrenheit é: %.2f\n", F );
    }
}
