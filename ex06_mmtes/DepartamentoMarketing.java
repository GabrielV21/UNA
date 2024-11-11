package ex06_mmtes;

public class DepartamentoMarketing implements Observer{

    @Override
    public void update(String updateMsg) {
        System.out.println("Informamos que o seguinte produto ja esta nas plateleiras: " + updateMsg);
    }

}
