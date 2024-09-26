package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor do saque: ");
        int valorSaque = sc.nextInt();
        int nota100 = 0, nota50 = 0, nota10 = 0, nota5 = 0, nota1 = 0;
        sc.close();
        if (valorSaque >= 10 && valorSaque <= 600) {
            if (valorSaque >= 100){
                nota100 = valorSaque/100;
                valorSaque = valorSaque%100;
            }
            if (valorSaque>=50) {
                nota50 = valorSaque/50;
                valorSaque = valorSaque%50;
            }
            if (valorSaque>=10) {
                nota10 = valorSaque/10;
                valorSaque = valorSaque%10;
            }
            if (valorSaque>=5){
                nota5 = valorSaque/5;
                valorSaque = valorSaque%5;
            }
            if (valorSaque>=1){
                nota1 = valorSaque;
            }
            System.out.println(nota100 + " nota(s) de R$100!");
            System.out.println(nota50 + " nota(s) de R$50!");
            System.out.println(nota10 + " nota(s) de R$10!");
            System.out.println(nota5 + " nota(s) de R$5!");
            System.out.println(nota1 + " nota(s) de R$1!");
        } else {
            System.out.println("Valor inválido!");
            System.exit(0);
        }
    }
}