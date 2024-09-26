package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os lados: ");
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();
        sc.close();
        if (lado1 > 0 && lado2 > 0 && lado3 > 0) {
            if ((lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado2 + lado3) > lado1) {
                System.out.println("Os valores podem ser um triangulo!");
            }
        } else {
            System.out.println("Os valores nao podem ser um triangulo!");
        }
        if (lado1 > 0 && lado2 > 0 && lado3 > 0) {
            if ((lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado2 + lado3) > lado1) {
                if (lado1 == lado2 && lado1 == lado3) {
                    System.out.println("E formam um Triangulo Equilatero!");
                } else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2) {
                    System.out.println("E formam um Triangulo Isosceles!");
                } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
                    System.out.println("E formam um Triangulo Escaleno!");
                }
            }
        }    
    }
}