package sumaCyfr;

import java.util.Scanner;

public class SumaCyfr_v2 {
    int suma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę podać liczbę całkowitą");
        long liczba = scan.nextLong();
        String liczbaS = ((Long)liczba).toString();
        int dlugosc = liczbaS.length();
        int suma = 0;

        for (int i = 0; i < dlugosc; i++) {
            char cyfra = liczbaS.charAt(i);
            suma = suma + Character.getNumericValue(cyfra);
        }

        return suma;
    }
}
