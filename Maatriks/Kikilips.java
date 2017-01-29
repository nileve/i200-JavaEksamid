/**
 * Loo 9*9 maatriks, millel on kujutatud kikilipsu. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 . . . . . . . 0
 * 0 0 . . . . . 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 . . . . . 0 0
 * 0 . . . . . . . 0
 */
public class Kikilips {
    
    // Lihtsalt abiline meetod, et maatriksit välja printida
    public static void main (String[] args) {
        // koordinaadid ekraanile
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(" " + i + "-" + j + " ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
//                if (i >= j || i + j == 8 || (i > j && i +j < 9)) {
                if ((i >= j && i + j < 9 )|| (i <= j && i + j >= 8)) {
                    System.out.print(" 0 ");
                } else {
                    System.out.print(" - ");
                }
            } System.out.println();
        }
    }
    
}
