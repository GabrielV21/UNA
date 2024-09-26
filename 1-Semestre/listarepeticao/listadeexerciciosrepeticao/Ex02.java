package listadeexerciciosrepeticao;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        String senha = "";
        do {
            System.out.println("SUA SENHA NÃO PODE SER IGUAL AO SEU NOME DE USUÁRIO!");
            System.out.println("Informe seu nome: ");
            nome = sc.next();
            System.out.println("Informe senha: ");
            senha = sc.next();
            if (nome.equals(senha)) {
                System.out.println("Senha inválida!");
            } else {
                System.out.println("Senha válida!");
            }
        }
        while ((nome.equals(senha)));
        sc.close();
    }
}