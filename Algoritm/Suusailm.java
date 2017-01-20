import java.util.Arrays;

/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.
 */
public class Suusailm {
    
    public static void main (String[] args) {
        
        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};
        
        int negCount = (int) Arrays.stream(kraadid1).filter(number -> number < 0).count();
        int posCount = (int) Arrays.stream(kraadid1).filter(number -> number >= 0).count();
        int posMore = posCount - negCount;
        System.out.println("kraadid1: pos " + posMore + " more then neg ");
        
        int negCount2 = (int) Arrays.stream(kraadid2).filter(number -> number < 0).count();
        int posCount2 = (int) Arrays.stream(kraadid2).filter(number -> number >= 0).count();
        int posMore2 = posCount2 - negCount2;
        if (posCount2 < negCount2) {
            System.out.println("kraadid2: pos is less then neg. " + posMore2);
        } else {
            System.out.println("kraadid2: pos " + posMore2 + " more then neg ");
        }
        
    }
    
}
    