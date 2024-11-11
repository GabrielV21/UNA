package ex06_mmtes;

public class DepartamentoVendas implements Observer{

    @Override
    public void update(String updateMsg) {
        System.out.println("O produto " + updateMsg + " esta disponivel para venda!");
    }

}
