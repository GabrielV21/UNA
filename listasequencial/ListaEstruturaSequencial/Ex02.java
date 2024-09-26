package listadeexercicio;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Informe o numero: ");
        num = sc.nextDouble();
        sc.close();
        System.out.println("O numero informado foi: " + num);
    
    }
}
