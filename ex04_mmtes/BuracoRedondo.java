package ex04_mmtes;

public class BuracoRedondo {

    private double Raio;

    public BuracoRedondo(double raio){
        this.Raio = raio;
    }

    void verificaPino(PinoRedondo pinoRedondo){
        if (pinoRedondo.getRaio()<this.Raio){
            System.out.println("Pino encaixou!");
        } else {
            System.out.println("Pino nao encaixa!");
        }
    }
    
}
