package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uma letra: ");
        char letra = sc.next().charAt(0);
        sc.close();
        if (letra!= 'a' && letra!= 'e' && letra!= 'i' && letra!= 'o' && letra!= 'u' && letra!= 'y' && letra!= 'A' && letra!= 'E' && letra!= 'I' && letra!= 'O' && letra!= 'U' && letra!= 'Y' ){
            System.out.println("A letra informada e uma consoante!");
        } else {
            System.out.println("A letra informada e uma vogal!");
        }
    }
}