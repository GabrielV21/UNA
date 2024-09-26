package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe dois números: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        sc.close();
        if (num1 > num2) {
            System.out.println("O primeiro número é maior: "+ num1);
        } else {
            System.out.println("O segundo número é maior: "+ num2);
        }
    }
}