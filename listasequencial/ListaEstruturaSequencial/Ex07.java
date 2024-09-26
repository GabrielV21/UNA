package listadeexercicio;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho do lado do quadrado: ");
        double l = sc.nextDouble();
        sc.close();
        System.out.println("O dobro da area desse quadrado é: " + 2*(Math.pow(l,2)));
    }
}
