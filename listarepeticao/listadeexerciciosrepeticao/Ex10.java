package listadeexerciciosrepeticao;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Informe o segundo numero: ");
        int num2 = sc.nextInt();
        int nmr = num1;
        sc.close();
        while (num1 < num2) {
            nmr += 1;
            System.out.println(nmr);
            num1++;
        }
    }
}