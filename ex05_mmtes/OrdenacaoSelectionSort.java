package ex05_mmtes;

public class OrdenacaoSelectionSort implements EstrategiaOrdenacao{

    @Override
    public void ordenar(int[] numeros) {
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numeros[j] < numeros[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numeros[minIndex];
            numeros[minIndex] = numeros[i];
            numeros[i] = temp;
        }
    }

}
