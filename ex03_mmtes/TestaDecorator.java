package ex03_mmtes;

public class TestaDecorator {
    public static void main(String[] args) {
        Adicional acaiSimples = new Acai();

        Adicional acaiMorango = new Morango(new Acai());

        Adicional acaiBolado = new LeiteCondensado(new Morango(new Banana(new Acai())));

        System.out.println(acaiSimples.getDescricao());
        System.out.println(acaiSimples.custo());

        System.out.println(acaiMorango.getDescricao());
        System.out.println(acaiMorango.custo());
        
        System.out.println(acaiBolado.getDescricao());
        System.out.println(acaiBolado.custo());
    }
}
