package Ex06;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TV tv = new TV();
        System.out.println("Informe o numero do canal: ");
        tv.setNmrCanal(sc.nextInt());
        System.out.println(tv.getNmrCanal());
        System.out.println("Você está controlando o volume agora!");
        System.out.println("Digite '+'' para aumentar, e '-'' para diminuir!");
        System.out.println("Digite '=' para sair!");
        while (true) {
            char vlm = sc.next().charAt(0);
            if (vlm == '+') {
                tv.aumentarVolume();
            }
            if (vlm == '-') {
                tv.diminuirVolume();
            }
            if (vlm == '=') {
                sc.close();
                System.exit(0);
            }
            System.out.println("Volume atual: " + tv.getVolume());
        }
    }
}