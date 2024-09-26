package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu sexo: ");
        char sexo = sc.next().charAt(0);
        sc.close();
        if (sexo == 'F'){
            System.out.println("Sexo feminino!");
        } else if (sexo == 'M') {
            System.out.println("Sexo Masculino!");
        } else {
            System.out.println("Sexo Inválido!");
        }
    }
}