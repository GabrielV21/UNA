package listadeexercicio;
import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Infome a área a ser pintada em m²: ");
        double area = sc.nextDouble();
        sc.close();
        double qntTinta = area*0.3333;
        int qntLatas = (int) Math.ceil(qntTinta/18);
        System.out.println("A quantidade de latas necessárias é de: " + qntLatas);
        System.out.println("O preço total é de: R$"+ qntLatas*80);
    }
}
