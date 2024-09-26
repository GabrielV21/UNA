package listadeexerciciosrepeticao;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a população A: ");
        double popA = sc.nextDouble(); 
        System.out.println("Informe a população B: ");
        double popB = sc.nextDouble();
        System.out.println("Infome a taxa de crescimento da população A: ");
        double cA = sc.nextDouble();
        System.out.println("Infome a taxa de crescimento da população B: ");
        double cB = sc.nextDouble();
        int anos = 0;
        sc.close();
        while (popA<popB) {
            popA+=popA*cA;
            popB+=popB*cB;
            anos++;
        }
        System.out.println(anos + " anos");
    }
}