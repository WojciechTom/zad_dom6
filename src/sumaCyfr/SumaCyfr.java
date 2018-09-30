package sumaCyfr;

import java.util.Scanner;

public class SumaCyfr {

    int suma(long liczba) {
        int suma = 0;
        int w = 4;
        int potega = ((Long)liczba).toString().length();





        for (int i = potega; i >= 0; i--) {
            int wynik = (int) (liczba / Math.pow(10, i));
            liczba = liczba - (long)(wynik * Math.pow(10,i));
            suma = suma + wynik;
        }

        return suma;
    }


}
