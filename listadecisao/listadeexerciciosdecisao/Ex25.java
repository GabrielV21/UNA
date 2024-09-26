package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd = 0;
        System.out.println("Responda as seguintes perguntas com Sim ou Não!");
        System.out.println("Telefonou para a vítima?");
        String answ = sc.next();
        if (answ.equals("Sim")){
            qtd += 1;
        }
        System.out.println("Esteve no local do crime?");
        answ = sc.next();
        if (answ.equals("Sim")){
            qtd += 1;
        }
        System.out.println("Mora perto da vítima?");
        answ = sc.next();
        if (answ.equals("Sim")){
            qtd += 1;
        }
        System.out.println("Devia para a vítima?");
        answ = sc.next();
        if (answ.equals("Sim")){
            qtd += 1;
        }
        System.out.println("Já trabalhou com a vítima?");
        answ = sc.next();
        if (answ.equals("Sim")){
            qtd += 1;
        }
        if (qtd == 0 || qtd == 1) {
            System.out.println("Classificação: INOCENTE");
        }  
        if (qtd == 2) {
            System.out.println("Classificação: SUSPEITA");
        } 
        if (qtd == 3 || qtd == 4) {
            System.out.println("Classificação: CÚMPLICE");
        } 
        if (qtd == 5) {
            System.out.println("Classificação: ASSASSINO");
        }
        sc.close();
    }
}