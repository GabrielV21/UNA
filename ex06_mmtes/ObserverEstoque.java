package ex06_mmtes;

public class ObserverEstoque {

    public static void main(String[] args) {

        EstoqueProduto estoque = new EstoqueProduto();

        Observer vendas = new DepartamentoVendas();
        Observer marketing = new DepartamentoMarketing();
        Observer compras = new DepartamentoCompras();

        estoque.adicionarObservador(vendas);
        estoque.adicionarObservador(marketing);
        estoque.adicionarObservador(compras);

        estoque.setEstadoEstoque("IPHONE 14");
        System.out.println("----------");

        estoque.removerObservador(compras);
        estoque.setEstadoEstoque("SAMSUNG 24");
        
    }

}
