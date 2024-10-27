package ex05_mmtes;

public class OrdenacaoInsertionSort implements EstrategiaOrdenacao{

    @Override
    public void ordenar(int[] numeros) {
        int n = numeros.length;
        for (int i = 1; i < n; i++) {
            int key = numeros[i];
            int j = i - 1;
            while (j >= 0 && numeros[j] > key) {
                numeros[j + 1] = numeros[j];
                j = j - 1;
            }
            numeros[j + 1] = key;
        }
    }
}
