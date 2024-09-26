package listadeexercicio;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Informe o terceiro número: ");
        double n3 = sc.nextDouble();
        sc.close();
        System.out.println("O produto do dobro do primeiro com metade do segundo: " +  (n1*2) * (n2/2));
        System.out.println("A soma do triplo do primeiro com o terceiro: " + (n1*3+n3));
        System.out.println("O terceiro elevado ao cubo: " + Math.pow(n3,3));
    }
}
