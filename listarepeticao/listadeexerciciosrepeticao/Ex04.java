package listadeexerciciosrepeticao;
public class Ex04 {
    public static void main(String[] args) {
        double popA = 80000, popB = 200000;
        int anos = 0;
        while (popA<popB) {
            popA+=popA*0.03;
            popB+=popB*0.015;
            anos++;
        }
        System.out.println(anos + " anos");
    }
}