package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as duas notas: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        sc.close();
        double media = (nota1+nota2)/2;
        if (media>=0 && media<4) { 
            System.out.println("As notas: "+ nota1+"|"+ nota2);
            System.out.println("A media: "+ media);
            System.out.println("Conceito E");
            System.out.println("Reprovado!");
        }
        if (media>=4 && media<6) { 
            System.out.println("As notas: "+ nota1+"|"+ nota2);
            System.out.println("A media: "+ media);
            System.out.println("Conceito D");
            System.out.println("Reprovado!");
        }
        if (media>=6 && media<7.5) { 
            System.out.println("As notas: "+ nota1+"|"+ nota2);
            System.out.println("A media: "+ media);
            System.out.println("Conceito C");
            System.out.println("Aprovado!");
        }
        if (media>=7.5 && media<9) { 
            System.out.println("As notas: "+ nota1+"|"+ nota2);
            System.out.println("A media: "+ media);
            System.out.println("Conceito B");
            System.out.println("Aprovado!");
        }
        if (media>=9 && media<=10) { 
            System.out.println("As notas: "+ nota1+"|"+ nota2);
            System.out.println("A media: "+ media);
            System.out.println("Conceito A");
            System.out.println("Aprovado!");
        }
    }
}