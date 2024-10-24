package ex04_mmtes;

public class PinoRedondoConcreto implements PinoRedondo{

    double Raio;

    public PinoRedondoConcreto(double raio){
        this.Raio = raio;
    }

    @Override
    public double getRaio() {
        return this.Raio;
    }

}
