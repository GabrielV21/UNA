package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o salario: ");
        double salario = sc.nextDouble();
        sc.close();
        if (salario<=280){
            double nvSalario = salario+salario*0.2;
            System.out.println("Salario anterior: R$"+ salario);
            System.out.println("Percentual de aumento: 20%");
            System.out.println("O valor do aumento: R$" + (nvSalario-salario));
            System.out.println("Novo salario: R$"+ nvSalario);
        }
        if (salario>280 && salario<700){
            double nvSalario = salario+salario*0.15;
            System.out.println("Salario anterior: R$"+ salario);
            System.out.println("Percentual de aumento: 15%");
            System.out.println("O valor do aumento: R$" + (nvSalario-salario));
            System.out.println("Novo salario: R$"+ nvSalario);
        }
        if (salario>700 && salario<1500){
            double nvSalario = salario+salario*0.1;
            System.out.println("Salario anterior: R$"+ salario);
            System.out.println("Percentual de aumento: 10%");
            System.out.println("O valor do aumento: R$" + (nvSalario-salario));
            System.out.println("Novo salario: R$"+ nvSalario);
        }
        if (salario>=1500){
            double nvSalario = salario+salario*0.05;
            System.out.println("Salario anterior: R$"+ salario);
            System.out.println("Percentual de aumento: 5%");
            System.out.println("O valor do aumento: R$" + (nvSalario-salario));
            System.out.println("Novo salario: R$"+ nvSalario);
        }
    }
}