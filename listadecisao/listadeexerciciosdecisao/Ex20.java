package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as tres notas: ");
        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();
        sc.close();
        float media = (nota1+nota2+nota3)/3;
        if (media<7) {
            System.out.println("Reprovado!"+ media);
        } else if (media>7 && media != 10) {
            System.out.println("Aprovado!"+ media);
        } else if (media == 10) {
            System.out.println("Aprovado com Distincao!"+media);
        }
    }
}