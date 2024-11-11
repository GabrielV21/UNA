package ex06_mmtes;

import java.util.ArrayList;
import java.util.List;

public class EstoqueProduto implements Estoque{

    private List<Observer> observadores = new ArrayList<>();
    private String estadoEstoque;

    @Override
    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores(String alertaProd) {
        for (Observer observador : observadores) {
            observador.update(alertaProd);
        }
    }

    public void setEstadoEstoque(String novoEstado){
        this.estadoEstoque = novoEstado;
        System.out.println("Recebendo novas unidades do produto: " + novoEstado);
        notificarObservadores(novoEstado);
    }
}
