package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o turno que você estuda: ");
        System.out.println("M-matutino ou V-Vespertino ou N- Noturno");
        char turno = sc.next().charAt(0);
        sc.close();
        switch (turno) {
            case 'M': System.out.println("Bom Dia!");
                break;
            case 'V': System.out.println("Boa Tarde!");  
                break;
            case 'N': System.out.println("Boa Noite!");
                break;
            default: System.out.println("Valor Invalido!");
        }
    }
}