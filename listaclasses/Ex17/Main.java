package Ex17;

public class Main {
    public static void main(String[] args) {
        Tamagushi_V4 fznd[] = new Tamagushi_V4[3];
        fznd[0] = new Tamagushi_V4("Tupac",7,54,60);
        fznd[1] = new Tamagushi_V4("Biggie",5,90,70);
        fznd[2] = new Tamagushi_V4("Ice",12,80,30);
        for (int i = 0; i < 3; i++) {
            fznd[i].brincar(20);
            fznd[i].comer(50);
        }
        for(int j = 0; j < 3; j++) {
            fznd[j].status();
        }
    }
}
