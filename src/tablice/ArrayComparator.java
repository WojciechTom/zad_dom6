package tablice;

public class ArrayComparator {

    boolean compare(int[] tab1, int[] tab2) {
        int x = tab1.length;
        int y = tab2.length;

        if (x != y) {
            return false;
        } else {

            for (int i = 0; i < x; i++) {
                if (tab1[i] != tab2[i]) {
                    return false;
                }
            }
            return true;
        }
    }



    boolean compare(int[][] tab1, int[][] tab2) {
        int x1 = tab1.length;
        int y1 = tab2.length;


        if (x1 != y1) {
            return false;
        } else {
            for (int i = 0; i < x1; i++) {

                int x2 = tab1[i].length;
                int y2 = tab2[i].length;

                if (x2 != y2) {
                    return false;
                } else {
                    for (int j = 0; j < x2; x2++) {
                        if(tab1[i][j] != tab2[i][j]){
                            return false;
                        }
                    }
                }

            }

            return true;
        }
    }

}

