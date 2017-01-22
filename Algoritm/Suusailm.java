import java.util.Arrays;

/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.
 */
public class Suusailm {
    
    public static void main (String[] args) {
        
        int[] kraadid1 = {11, 10, 5, 1, -3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};
        
        int newKraadid1 = countPosAndNeg(kraadid1);
        int newKraadid2 = countPosAndNeg(kraadid2);
        System.out.println("kraadid1 count (pos > neg): " + newKraadid1);
        System.out.println("kraadid2 count (pos > neg): " + newKraadid2);
        
    }
    
    public static int countPosAndNeg (int[] newArray) {
        // filter out neg numbers
        int neg = (int) Arrays.stream(newArray).filter(number -> number < 0).count();
        // filter out pos numbers
        int pos = (int) Arrays.stream(newArray).filter(number -> number >= 0).count();
        int posMoreThen = pos - neg;
        if (pos < neg) {
            System.out.println("pos count is less then neg (neg count is more then pos by): " + Math
                    .abs(posMoreThen));
        } else if (pos == neg) {
            System.out.println(
                    "pos and neg count is equal: pos count is " + pos + " and neg count is " + neg);
        } else {
            System.out.println(posMoreThen + " pos values more then neg values");
        }
        return posMoreThen;
    }
    
}
    