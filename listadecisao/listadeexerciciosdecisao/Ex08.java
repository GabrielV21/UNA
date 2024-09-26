package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o preço de três produtos: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        sc.close();
        if (num1<num2 && num1<num3) { 
            System.out.println("O primeiro é o mais barato: R$" + num1);
        } else if (num2<num1 && num2<num3) {
            System.out.println("O segundo é o mais barato: R$" + num2);
        } else if (num3<num1 && num3<num2) {
            System.out.println("O terceiro é o mais barato: R$" + num3);
        } else if (num1==num2 && num1<num3) {
            System.out.println("O 1º e o 2º são os mais baratos e possuem o mesmo preço: R$" + num1);
        } else if (num1==num3 && num1<num2) {
            System.out.println("O 1º e o 3º são os mais baratos e possuem o mesmo preço: R$" + num1);
        } else if (num2==num3 && num2<num1) {
            System.out.println("O 2º e o 3º são os mais baratos e possuem o mesmo preço: R$" + num1);
        } else if (num1==num2 && num1==num3) {
            System.out.println("Os produtos possuem preços iguais!");
        }
    }
}