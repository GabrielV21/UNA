package listadeexercicio;
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a sua altura: ");
        double h = sc.nextDouble();
        sc.close();
        double pi1 = (72.7*h)-58;
        System.out.printf("Seu peso ideal é: %.2f\n", pi1);
    }
}
    
