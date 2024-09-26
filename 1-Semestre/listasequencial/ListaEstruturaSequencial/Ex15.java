package listadeexercicio;
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora? ");
        double salariohora = sc.nextDouble();
        System.out.println("Quantas horas você trabalha no mês? ");
        double horas = sc.nextDouble();
        sc.close();
        double bruto = salariohora*horas;
        double IR =  bruto*0.11;
        double INSS = bruto*0.08;
        double Sind = bruto*0.05;
        double liqui = bruto - IR - INSS - Sind;
        System.out.println("+ Salário Bruto   : R$" + bruto);
        System.out.println("- IR (11%)        : R$" + IR);
        System.out.println("- INSS (8%)       : R$" + INSS);
        System.out.println("- Sindicato (5%)  : R$" + Sind);
        System.out.println("= Salário Liquido : R$" + liqui);
    }
}
