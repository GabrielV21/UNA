package ex05_mmtes;

public class Principal {
    public static void main(String[] args) {
        
        ContextoDeOrdenacao contexto = new ContextoDeOrdenacao();
        contexto.setEstrategia(new OrdenacaoBubbleSort());
        int[] numeros = {23, 20, 12, 6, 87};
        System.out.println("-----USANDO BUBBLE SORT-----");
        System.out.println("Antes de ordenar:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        contexto.executarOrdenacao(numeros);
        System.out.println("\nDepois de ordenar:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        contexto.setEstrategia(new OrdenacaoInsertionSort());
        int[] numeros2 = {121, 5, 43, 76, 2, 15};
        System.out.println("\n\n-----USANDO INSERTION SORT-----");
        System.out.println("\nAntes de ordenar:");
        for (int num : numeros2) {
            System.out.print(num + " ");
        }
        contexto.executarOrdenacao(numeros2);
        System.out.println("\nDepois de ordenar:");
        for (int num : numeros2) {
            System.out.print(num + " ");
        }

        contexto.setEstrategia(new OrdenacaoSelectionSort());
        int[] numeros3 = {542, 21, 43, 38, 8, 15};
        System.out.println("\n\n-----USANDO SELECTION SORT-----");
        System.out.println("\nAntes de ordenar:");
        for (int num : numeros3) {
            System.out.print(num + " ");
        }
        contexto.executarOrdenacao(numeros3);
        System.out.println("\nDepois de ordenar:");
        for (int num : numeros3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
