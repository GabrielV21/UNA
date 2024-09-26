package listadeexerciciosdecisao;
import java.util.Scanner;
public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tipo da carne(file_duplo, alcatra ou picanha): ");
        String tipo = sc.next();
        System.out.println("Informe a quantidade: "); 
        double qtd = sc.nextDouble();
        System.out.println("Informe a forma de pagamento(dinheiro, cartao ou cartao_tabajara): ");
        String payment = sc.next();
        sc.close();
        int i = 0;
        double preco = 0, disc = 0;
        switch(tipo) {
            case ("file_duplo") :
            if (qtd < 5 ){
                preco = qtd*4.9;
            } else if (qtd > 5 ){
                preco = qtd*5.8;
            }
            break;
            case ("alcatra") :
            if (qtd < 5 ){
                preco = qtd*5.9;
            } else if (qtd > 5 ){
                preco = qtd*6.8;
            }
            break;
            case ("picanha") :
            if (qtd < 5 ){
                preco = qtd*6.9;
            } else if (qtd > 5 ){
                preco = qtd*7.8;
            }
            break;
            default:  System.out.println("Tipo de carne inválido!");
            return;
        }
        if (payment.equals("cartao_tabajara")) {
            disc = preco*0.05;
            i = 1;
        }
        System.out.printf("\n");
        System.out.println("Tipo da carne: " + tipo);
        System.out.println("Quantidade de carne: " + qtd);
        System.out.println("Preço total: " + preco);
        System.out.println("Forma de pagamento: " + payment);
        if (i==1) {
            System.out.printf("Valor do desconto: R$%.2f\n" , disc);
        }
        System.out.printf("Preço a pagar: R$%.2f\n", (preco-disc)); 
    }
}
