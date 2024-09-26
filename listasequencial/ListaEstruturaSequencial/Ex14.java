package listadeexercicio;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o peso da pesca: ");
        double pesopesca = sc.nextDouble();
        sc.close();
        if (pesopesca>50){
            double excesso = pesopesca-50;
            double multa = excesso*4;
            System.out.println("O peso em excesso é de: " + excesso);
            System.out.println("E o valor da multa é de: " + multa);
        } else {
            System.out.println("O peso da pesca está dentro do permitido!");
        }
    }
}
