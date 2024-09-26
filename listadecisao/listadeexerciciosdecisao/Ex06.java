package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe tres numeros: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        sc.close();
        if (num1>num2 && num1>num3) { 
            System.out.println("O maior numero digitado foi o primeiro: " + num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("O maior numero digitado foi o segundo: " + num2);
        } else if (num3>num1 && num3>num2) {
            System.out.println("O maior numero digitado foi o terceiro: " + num3);
        }
    }
}