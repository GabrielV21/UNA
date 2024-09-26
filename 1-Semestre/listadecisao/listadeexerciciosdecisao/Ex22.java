package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int num = sc.nextInt();
        sc.close();
        if (num%2 == 0) {
            System.out.println("O número informado é par!");
        } else { 
            System.out.println("O número informado é ímpar!");
        }
    }
}