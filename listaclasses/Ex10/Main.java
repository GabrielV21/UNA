package Ex10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BombaCombustivel b1 = new BombaCombustivel("Gasolina", 4.9, 100);
        System.out.println("Informe a quantidade de litros a abastecer: ");
        double litros = sc.nextDouble();
        System.out.println("Informe o valor a abastecer: ");
        double valor = sc.nextDouble();
        sc.close();
        System.out.printf("Custo por %.2f litros: R$%.2f\n", litros, b1.abastercerPorLitro(litros));
        System.out.printf("Litros por R$%.2f: %.2f litros\n", valor, b1.abastercerPorValor(valor));
    }
}