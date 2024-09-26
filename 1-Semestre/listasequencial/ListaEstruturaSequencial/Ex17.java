package listadeexercicio;
import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a área a ser pintada em m²: ");
        double area = sc.nextDouble();
        sc.close();
        double qntTinta = area/6;
        double galoes = Math.ceil(qntTinta/3.6);
        double latas = Math.ceil(qntTinta/18);
        System.out.println("Comprando apenas galões: R$"+ galoes*25);
        System.out.println("Comprando apenas latas: R$"+ latas*80);
        if (qntTinta*1.1>18){
            int qntlatas = (int)Math.floor(qntTinta*1.1/18);
            double a = qntTinta*1.1-(qntlatas*18);
            int qntgaloes = (int) Math.ceil(a/3.6);
            System.out.println("Misturando latas e galões: R$"+ qntlatas*80+" em latas e R$"+ qntgaloes*25+" em galões");
        } 
    }
}
