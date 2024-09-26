package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero de ate tres digitos: ");
        int num = sc.nextInt();
        sc.close();
        int centenas = num/100;
        int dezenas = (num%100)/10;
        int unidades = ((num%100)%10);
        System.out.println(+centenas+" centenas");
        System.out.println(+dezenas+" dezenas");
        System.out.println(+unidades+" unidades");
    }
}