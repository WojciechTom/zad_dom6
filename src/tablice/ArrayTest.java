package tablice;

public class ArrayTest {
    public static void main(String[] args) {
        int[] t1 = new int[] {1 , 3, 5, 4};
        int[] t2 = new int[] {1 , 3, 4, 5};
        int[] t3 = new int[] {1 , 3, 4, 5};
        int[][] t4 = new int[3][2];
        t4[0][0] = 3;
        t4[0][1] = 4;
        t4[1][0] = 5;
        t4[1][1] = 37;
        t4[2][0] = 33;
        t4[2][1] = 32;


        int[][] t5 = new int[3][2];
        t5[0][0] = 3;
        t5[0][1] = 4;
        t5[1][0] = 5;
        t5[1][1] = 37;
        t5[2][0] = 13;
        t5[2][1] = 32;

        ArrayComparator maszyna = new ArrayComparator();
        System.out.println(maszyna.Compare(t1, t2));
        System.out.println(maszyna.Compare(t3, t2));
        System.out.println(maszyna.Compare(t4, t5));

    }
}
