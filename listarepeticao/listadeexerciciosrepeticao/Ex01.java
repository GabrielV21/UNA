package listadeexerciciosrepeticao;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        do {
            System.out.println("Informe uma nota entre 0 e 10: ");
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida!");
            }
            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota válida!");
            }
        }
        while ((nota < 0 || nota > 10));
        sc.close();
    }
}