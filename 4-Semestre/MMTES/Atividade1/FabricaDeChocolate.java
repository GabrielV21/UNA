public class FabricaDeChocolate {
    public static void main(String[] args) {
        CaldeiraChocolate caldeira = CaldeiraChocolate.getInstancia();
        caldeira.encher();
        caldeira.ferver();
        caldeira.drenar();

        CaldeiraChocolate caldeira2 = CaldeiraChocolate.getInstancia();
        caldeira2.drenar();
        //Aqui printa a mensagem de caldeira vazia, logo retorna o mesmo objeto com sucesso.
    }
}
