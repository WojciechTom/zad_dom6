package multiArray;

public class MultiArrayTest {
    public static void main(String[] args) {
        MultiArray mA = new MultiArray(13,13);

        System.out.println("tablica1 ma postać");
        mA.print();
        System.out.println("największy element to: " + mA.findMax());
        System.out.println("a najmniejszy to: " + mA.findMin() +"\n");

        System.out.println("teraz zmianiamy tablicę i otrzymujemy:");
        mA.randomize();
        mA.print();
        System.out.println("dla której maksymalna wartość to: " + mA.findMax());
        System.out.println("a minimalna to: " +mA.findMin());

    }
}
