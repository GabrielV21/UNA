package Ex06;
public class TV {
    private int nmrCanal;
    private int volume;

    public int getNmrCanal() {return nmrCanal;}
    public int getVolume() {return volume;}

    public void setNmrCanal(int nmrCanal) {
        if (nmrCanal>0 && nmrCanal<1000) {
            this.nmrCanal = nmrCanal;
        } else {
            System.out.println("Numero de canal invalido!");
        }
    }
    public void aumentarVolume() {
        if (volume<100) {
            volume += 10;
        }
        if (volume==100) {
            System.out.println("Volume máximo atingido!");
        }
    }
    public void diminuirVolume() {
        if (volume>0) {
            volume -= 10;
        }
        if (volume==0) {
            System.out.println("Volume máximo atingido!");
        }
    }
}
