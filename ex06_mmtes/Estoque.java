package ex06_mmtes;

public interface Estoque {
    
    void adicionarObservador(Observer observador);

    void removerObservador(Observer observador);

    void notificarObservadores(String produto);

}
