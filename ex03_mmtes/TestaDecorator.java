package ex03_mmtes;

public class TestaDecorator {
    public static void main(String[] args) {
        Adicional acaiSimples = new Acai(Tamanho.PEQUENO);

        Adicional acaiMorango = new Morango(new Acai(Tamanho.MEDIO));

        Adicional acaiBolado = new LeiteCondensado(new Morango(new Banana(new Acai(Tamanho.GRANDE))));

        System.out.println(acaiSimples.getDescricao() + ". De tamanho: " + acaiSimples.getTamanho());
        System.out.println(acaiSimples.custo());

        System.out.println(acaiMorango.getDescricao() + ". De tamanho: " + acaiMorango.getTamanho());
        System.out.println(acaiMorango.custo());

        System.out.println(acaiBolado.getDescricao() + ". De tamanho: " + acaiBolado.getTamanho());
        System.out.println(acaiBolado.custo());
    }
}
