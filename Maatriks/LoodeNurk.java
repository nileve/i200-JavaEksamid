/**
 * Loo 9*9 suurune maatriks, millele tekib loode suunaline nurkade muster, nagu näites.
 * Tundub raske? Sul tuleb lihtsalt veeru ja rea indeksi seos leida.
 *
 * Näide
 * 1 1 1 1 1 1 1 1 1
 * 1 2 2 2 2 2 2 2 2
 * 1 2 3 3 3 3 3 3 3
 * 1 2 3 4 4 4 4 4 4
 * 1 2 3 4 5 5 5 5 5
 * 1 2 3 4 5 6 6 6 6
 * 1 2 3 4 5 6 7 7 7
 * 1 2 3 4 5 6 7 8 8
 * 1 2 3 4 5 6 7 8 9
 *
 * Tundub raske? Leia seoseid rea ja veeru indeksi numbritega.
 */
public class LoodeNurk {
    
    //    // Lihtsalt abiline meetod, et maatriksit välja printida
    //    private static void printMaatriks(int[][] laud) {
    //        for (int i = 0; i < laud.length; i++) {
    //            System.out.println(Arrays.toString(laud[i]));
    //        }
    //        System.out.println("");
    //    }
    
    public static void main (String[] args) {
        
        int row;
        int column;
        
        for (row = 1; row <= 9; row++) {
            
            for (column = 1; column <= 9; column++) {
                if (row == column || column > row) {
                    System.out.print(row + " ");
                } else if (row > column) {
                    System.out.print(column + " ");
                } else {
                    System.out.print("x");
                }
            }
            
            System.out.println();
            
        }
        
    }
    
}
