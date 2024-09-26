package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o ano desejado: ");
        int ano = sc.nextInt();
        sc.close();
        if (ano%4==0 && ano%100!=0 || ano%400==0) {
            System.out.println("Ano bissexto!");
        } else {
            System.out.println("Ano nao bissexto!");
        }
    }
}