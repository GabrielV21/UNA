package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da sua hora: ");
        double valorHora = sc.nextDouble();
        System.out.println("Informe a quantidade de horas ao mes: " );
        double horas = sc.nextDouble();
        sc.close();
        double salario = horas * valorHora;
        if (salario <= 900) {
            System.out.println("Salario bruto: "+valorHora+"*"+horas);
            System.out.println(": R$"+ salario);
            System.out.println("Isento de IR");
            System.out.println("(-) INSS (10%)");
            System.out.println(": R$"+ (0.1*salario));
            System.out.println("(-) FGTS (11%)");
            System.out.println(": R$"+ (0.11*salario));
            System.out.println("(-) SNDCT (3%)");
            System.out.println(": R$"+ (0.03*salario));
            System.out.println("Total de descontos");
            System.out.println(": R$"+ (0.1*salario+0.03*salario));
            System.out.println("Salario Liquido");
            System.out.println(": R$"+ (salario-(0.1*salario+0.03*salario)));
        }
        if (salario>900 && salario<=1500) {
            System.out.println("Salario bruto: "+valorHora+"*"+horas);
            System.out.println(": R$"+ salario);
            System.out.println("(-) IR (5%)");
            System.out.println(": R$"+ (0.05*salario));
            System.out.println("(-) INSS (10%)");
            System.out.println(": R$"+ (0.1*salario));
            System.out.println("(-) FGTS (11%)");
            System.out.println(": R$"+ (0.11*salario));
            System.out.println("(-) SNDCT (3%)");
            System.out.println(": R$"+ (0.03*salario));
            System.out.println("Total de descontos");
            System.out.println(": R$"+ (0.1*salario+0.05*salario+0.03*salario));
            System.out.println("Salario Liquido");
            System.out.println(": R$"+ (salario-(0.1*salario+0.05*salario+0.03*salario)));
        }
        if (salario>900 && salario<=1500) {
            System.out.println("Salario bruto: "+valorHora+"*"+horas);
            System.out.println(": R$"+ salario);
            System.out.println("(-) IR (5%)");
            System.out.println(": R$"+ (0.05*salario));
            System.out.println("(-) INSS (10%)");
            System.out.println(": R$"+ (0.1*salario));
            System.out.println("(-) FGTS (11%)");
            System.out.println(": R$"+ (0.11*salario));
            System.out.println("(-) SNDCT (3%)");
            System.out.println(": R$"+ (0.03*salario));
            System.out.println("Total de descontos");
            System.out.println(": R$"+ (0.1*salario+0.05*salario+0.03*salario));
            System.out.println("Salario Liquido");
            System.out.println(": R$"+ (salario-(0.1*salario+0.05*salario+0.03*salario)));
        }
        if (salario>1500 && salario<=2500) {
            System.out.println("Salario bruto: "+valorHora+"*"+horas);
            System.out.println(": R$"+ salario);
            System.out.println("(-) IR (10%)");
            System.out.println(": R$"+ (0.1*salario));
            System.out.println("(-) INSS (10%)");
            System.out.println(": R$"+ (0.1*salario));
            System.out.println("(-) FGTS (11%)");
            System.out.println(": R$"+ (0.11*salario));
            System.out.println("(-) SNDCT (3%)");
            System.out.println(": R$"+ (0.03*salario));
            System.out.println("Total de descontos");
            System.out.println(": R$"+ (0.1*salario+0.1*salario+0.03*salario));
            System.out.println("Salario Liquido");
            System.out.println(": R$"+ (salario-(0.1*salario+0.1*salario+0.03*salario)));
        }
        if (salario>2500) {
            System.out.println("Salario bruto: "+valorHora+"*"+horas);
            System.out.println(": R$"+ salario);
            System.out.println("(-) IR (20%)");
            System.out.println(": R$"+ (0.2*salario));
            System.out.println("(-) INSS (10%)");
            System.out.println(": R$"+ (0.1*salario));
            System.out.println("(-) FGTS (11%)");
            System.out.println(": R$"+ (0.11*salario));
            System.out.println("(-) SNDCT (3%)");
            System.out.println(": R$"+ (0.03*salario));
            System.out.println("Total de descontos");
            System.out.println(": R$"+ (0.1*salario+0.2*salario+0.03*salario));
            System.out.println("Salario Liquido");
            System.out.println(": R$"+ (salario-(0.1*salario+0.2*salario+0.03*salario)));
        }
    }
}