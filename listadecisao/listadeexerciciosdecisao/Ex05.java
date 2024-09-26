package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as duas notas: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        sc.close();
        double media = (nota1+nota2)/2;
        if (media==10) {
            System.out.println("Aprovado com Distinção!");
        } else if (media>7) {
            System.out.println("Aprovado!");
        } else if (media < 7){
            System.out.println("Reprovado!");
        }
    }
}