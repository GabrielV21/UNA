package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        double num = sc.nextDouble();
        sc.close();
        if (num>0) {
            System.out.println("O número é positivo!");
        }
        if (num<0) { 
            System.out.println("O número é negativo!");
        }
    }
}
