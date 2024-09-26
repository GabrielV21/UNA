package listadeexerciciosrepeticao;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0;
        double[] num = new double[5];
        while (i<5) {
            num[i] = sc.nextDouble();
            i++;
        }
        double maior = num[0];
        while (j<5) {
            if (num[j]>maior) {
                maior = num[j];
            }
            j++;
        }
        sc.close();
        System.out.println("O maior número: " + maior);
    }
}