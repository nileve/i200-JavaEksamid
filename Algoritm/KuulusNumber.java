import java.util.Arrays;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis
 * rohkem? Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {
    
    public static void main (String[] args) {
        
        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
        int i, j;
        for (i = j = 0; j < naide.length; j++) {
            if (3 != (naide[j])) {
                naide[i++] = naide[j];
            }
        }
        naide = Arrays.copyOf(naide, i);
        System.out.println("kuulus number on " + leiaKuulusNumber(naide));
        
    }
    
    public static int leiaKuulusNumber (int[] minuMassiiv) {
        Arrays.sort(minuMassiiv);
        int eelmine = minuMassiiv[0];
        int kuulus = minuMassiiv[0];
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < minuMassiiv.length; i++) {
            if (minuMassiiv[i] == eelmine) {
                count++;
            } else {
                if (count > maxCount) {
                    kuulus = minuMassiiv[i - 1];
                    maxCount = count;
                }
                eelmine = minuMassiiv[i];
                count = 1;
            }
        }
        if (count > maxCount) {
            return minuMassiiv[minuMassiiv.length - 1];
        } else {
            return kuulus;
        }
    }
    
}
