package listadeexercicio;
import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho do arquivo em MB: ");
        double tmhmb = sc.nextDouble();
        System.out.println("Informe a velocidade da Internet em Mbps: ");
        double netvlc = sc.nextDouble();
        sc.close();
        double tempo = ((tmhmb*8)/netvlc)/60;
        System.out.printf("O tempo aproximado de download é de: %.2f minutos\n", tempo);
    }
}
