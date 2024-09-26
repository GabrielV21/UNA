package listadeexerciciosrepeticao;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Informe o segundo numero: ");
        int num2 = sc.nextInt();
        int nmr = num1;
        int soma = 0;
        sc.close();
        while (num1 < num2) {
            nmr += 1;
            soma += nmr;
            System.out.println(nmr);
            num1++;
        }
        System.out.println("A soma dos algarismos: " + soma);
    }
}