public class CaldeiraChocolate {
    private boolean vazia;
    private boolean fervida;
    private static CaldeiraChocolate instancia;
    
    private CaldeiraChocolate(){
        this.vazia = true;
        this.fervida = false;
    }

    public static CaldeiraChocolate getInstancia(){
        if (instancia == null){ 
            instancia = new CaldeiraChocolate();
        }
        return instancia;
    }

    public void encher(){
        if (vazia == true) {
            System.out.println("Caldeira enchida com Chocolate e Leite.");
            vazia = false;
        } else {
            System.out.println("Caldeira ja esta cheia.");
        }
    }

    public void ferver(){
        if (vazia == false && fervida == false){
            System.out.println("Fervendo a mistura.");
            fervida = true;
        } else if (vazia == true) {
            System.out.println("Caldeira vazia.");
        } else if (fervida == true){
            System.out.println("Mistura ja esta fervida.");
        }
    }

    public void drenar(){
        if (vazia == false && fervida == true){
            System.out.println("Caldeira esvaziada com sucesso.");
            vazia = true;
            fervida = false;
        } else if (vazia == true) {
            System.out.println("Caldeira vazia.");
        } else if (fervida == false){
            System.out.println("Mistura nao esta fervida.");
        }
    }
}
