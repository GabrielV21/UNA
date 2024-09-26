package Ex08;
public class Main {
    public static void main(String[] args) {
        Macaco maco1 = new Macaco();
        maco1.comer("Apple");
        maco1.verBucho();
        System.out.println();

        maco1.comer("Watermelon");
        maco1.verBucho();
        System.out.println();

        maco1.comer("Orange");
        maco1.verBucho();
        System.out.println();

        maco1.digerir();
        maco1.verBucho();

        Macaco maco2 = new Macaco();
        maco2.comer("Banana");
        maco2.verBucho();
        System.out.println();

        maco2.comer("Melon");
        maco2.verBucho();
        System.out.println();

        maco2.comer("Blueberry");
        maco2.verBucho();
        System.out.println();

        maco2.digerir();
        maco2.verBucho();
    }
}