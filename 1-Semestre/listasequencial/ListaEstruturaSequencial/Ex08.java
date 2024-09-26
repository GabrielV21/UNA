package listadeexercicio;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quanto você ganha por hora: ");
        double salario = sc.nextDouble();
        System.out.println("Informe quantas horas você trabalha por mês; ");
        double horas = sc.nextDouble();
        sc.close();
        System.out.println("Seu salário é: R$" + salario * horas);
    }
}
