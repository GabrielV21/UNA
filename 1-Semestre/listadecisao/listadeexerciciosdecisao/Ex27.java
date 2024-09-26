package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade (em Kg) de morangos e de maças, respectivamente: ");
        double kgMorango = sc.nextDouble();
        double kgMaca = sc.nextDouble();
        sc.close();
        double precoMorango = 0, precoMaca = 0, pesoTotal = 0, precoTotal = 0; 
        if (kgMorango <= 5){ 
            precoMorango = 2.5 * kgMorango;
        } else if (kgMorango > 5) {
            precoMorango = 2.2 * kgMorango;
        }
        if (kgMaca <= 5) {
            precoMaca = 1.8 * kgMaca;
        } else if (kgMaca > 5) {
            precoMaca = 1.5 * kgMaca;
        }
        pesoTotal = kgMorango + kgMaca;
        precoTotal = precoMaca + precoMorango;
        if (pesoTotal > 8 || precoTotal > 25) {
            precoTotal = precoTotal*0.9;
        }
        System.out.printf("Valor a ser pago: R$%.2f\n" , precoTotal);
    }
}