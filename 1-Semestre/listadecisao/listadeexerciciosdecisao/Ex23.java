package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        double num = sc.nextDouble();
        sc.close();
        if (Math.floor(num) < num) {
            System.out.println("O número informado é decimal!");
        } else {
            System.out.println("O número informado é inteiro!");
        }
    }
}