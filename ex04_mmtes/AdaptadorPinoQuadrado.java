package ex04_mmtes;

public class AdaptadorPinoQuadrado implements PinoRedondo{

    private final PinoQuadrado pinoQuadrado;

    public AdaptadorPinoQuadrado(PinoQuadrado pinoQuadrado){
        this.pinoQuadrado = pinoQuadrado;
    }

    @Override
    public double getRaio() {
        return ((this.pinoQuadrado.getLargura()*Math.sqrt(2))/2);
    }
    
}
