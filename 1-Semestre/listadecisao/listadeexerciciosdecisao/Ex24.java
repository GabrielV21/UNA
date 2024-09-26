package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        double num1 = sc.nextDouble();
        System.out.println("Informe outro número: ");
        double num2 = sc.nextDouble();
        System.out.println("Informe a operação desejada ( + , - , * , / )");
        double opNum = 0;
        char oper;
        oper = sc.next().charAt(0);
        sc.close();
        if (oper == '+') {
            opNum = num1 + num2;
        }
        if (oper == '-') {
            opNum = num1 - num2;
        }
        if (oper == '*') {
            opNum = num1 * num2;
        }
        if (oper == '/') {
            opNum = num1 / num2;
        }
        System.out.println("O resultado é: " + opNum);
        if (opNum%2 == 0) {
            System.out.println("Par!");
        } else {
            System.out.println("Ímpar!");
        }
        if (opNum == 0) {
            System.out.println("Neutro!");  
        }
        if (opNum > 0) {
            System.out.println("Positivo!");
        }
        if (opNum < 0) {
            System.out.println("Negativo!");
        }
        if (Math.floor(opNum) == opNum) {
            System.out.println("Inteiro!");
        } else {
            System.out.println("Decimal!");
        }
    }
}