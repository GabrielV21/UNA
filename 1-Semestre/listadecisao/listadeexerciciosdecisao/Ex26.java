package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tipo de combustível da seguinte maneira: A-álcool, G-gasolina.");
        char tipo;
        tipo = sc.next().charAt(0);
        System.out.println("Informe a quantidade de litros: ");
        double qtd = sc.nextDouble();
        double preco = 0;
        double pago = 0;
        sc.close();
        double valor = 0;
        if (tipo == 'A') {
            if (qtd <= 20) {
                preco = qtd*1.843;
            }
            if (qtd > 20) {
                valor = (qtd-20)*1.805;
                preco = 36.86;
            }
            pago = valor + preco;
        }
        if (tipo == 'G') {
            if (qtd <= 20) {
                preco = qtd*2.4;
            }
            if (qtd > 20) {
                valor = (qtd-20)*2.35;
                preco = 48;
            }
            pago = valor + preco;
        }
        System.out.println("Valor a ser pago: R$" + pago);
    }
}