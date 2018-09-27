package liczbyTablica;

import java.util.Random;

public class LiczbyTablica {

    public static void main(String[] args) {
        int wielkoscTab = 12;
        int[] tablica = new int[wielkoscTab];
        Random rand = new Random();

        for(int i = 0 ; i <wielkoscTab ; i++){
            tablica[i] = rand.nextInt(100);
        }

        for(int i = 0 ; i < (2*wielkoscTab) ; i++){
            if (i<=wielkoscTab-1) {
                System.out.print(tablica[i] + " ");
            } else {
                System.out.print(tablica[2*wielkoscTab-1-i] + " ");
            }

        }

   }
}
