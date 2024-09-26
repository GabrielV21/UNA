package Ex04;
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gubla", 18, 95, 185);
        int anos = 5;
        double quilos = 6;
        p1.envelhecer(anos);
        p1.engordar(2*quilos);
        p1.emagrecer(quilos);
        p1.crescer(5);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Peso: " + p1.getPeso());
        System.out.println("Altura: " + p1.getAltura());
    }
}