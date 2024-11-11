package ex06_mmtes;

public class DepartamentoCompras implements Observer{

    @Override
    public void update(String updateMsg) {
        System.out.println("Monitorando estoque do produto: " + updateMsg);
    }

}
