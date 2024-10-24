package ex04_mmtes;

public class Main {
    public static void main(String[] args) {

        PinoRedondo pinoRedondo = new PinoRedondoConcreto(2.5);

        PinoQuadrado pinoQuadrado = new PinoQuadrado(4);

        PinoRedondo pinoQuadradoAdaptado = new AdaptadorPinoQuadrado(pinoQuadrado);

        BuracoRedondo buracoRedondo = new BuracoRedondo(3);

        buracoRedondo.verificaPino(pinoRedondo);

        buracoRedondo.verificaPino(pinoQuadradoAdaptado);

    }
}
