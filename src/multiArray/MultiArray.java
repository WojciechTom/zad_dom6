package multiArray;

import java.util.Random;

public class MultiArray {

    int[][] pole;


    public MultiArray(int n, int m) {
        pole = new int[n][m];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pole[i][j] = rand.nextInt(100);
            }
        }
    }


    void randomize() {
        Random rand = new Random();

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[1].length; j++) {
                pole[i][j] = rand.nextInt(100);
            }
        }

    }


    int findMin() {
        int min = pole[1][1];

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[1].length; j++) {
                if (pole[i][j] < min) {
                    min = pole[i][j];
                }
            }
        }
        return min;
    }

    int findMax() {
        int max = pole[1][1];

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[1].length; j++) {
                if (pole[i][j] > max) {
                    max = pole[i][j];
                }
            }
        }
        return max;
    }

    void print(){
        for (int i = 0; i < pole.length; i++) {
            System.out.println();
            for (int j = 0; j < pole[1].length; j++) {
                if (pole[i][j] < 10) {
                    System.out.print("0" + pole[i][j] + "|");
                } else {
                    System.out.print(pole[i][j] + "|");
                }
            }
        }
        System.out.println();
    }


}
