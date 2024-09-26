package listadeexerciciosrepeticao;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe 5 números: ");
        int i = 0, j = 0;
        double[] num = new double[5];
        while (i<5) {
            num[i] = sc.nextDouble();
            i++;
        }
        double soma = 0 , media = 0;
        while (j<5) {
            soma += num[j];
            j++;
        }
        media = soma/5;
        sc.close();
        System.out.println("A soma dos números: " +soma);
        System.out.println("A media dos números: " +media);
    }
}