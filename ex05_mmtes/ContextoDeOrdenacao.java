package ex05_mmtes;

public class ContextoDeOrdenacao {

    private EstrategiaOrdenacao estrategiaOrdenacao;

    void setEstrategia(EstrategiaOrdenacao estrategia){
        this.estrategiaOrdenacao = estrategia;
    }

    void executarOrdenacao(int[] numeros){
        this.estrategiaOrdenacao.ordenar(numeros);
    }
}
