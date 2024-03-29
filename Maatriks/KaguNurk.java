/**
 * Loo 9*9 suurune maatriks, millele tekib kagu suunaline nurkade muster, nagu näites.
 * Tundub raske? Sul tuleb lihtsalt veeru ja rea indeksi seos leida.
 *
 * Näide
 * 9 8 7 6 5 4 3 2 1
 * 8 8 7 6 5 4 3 2 1
 * 7 7 7 6 5 4 3 2 1
 * 6 6 6 6 5 4 3 2 1
 * 5 5 5 5 5 4 3 2 1
 * 4 4 4 4 4 4 3 2 1
 * 3 3 3 3 3 3 3 2 1
 * 2 2 2 2 2 2 2 2 1
 * 1 1 1 1 1 1 1 1 1
 *
 * Tundub raske? Leia seoseid rea ja veeru indeksi numbritega.
 */
public class KaguNurk {
    
    //    // Lihtsalt abiline meetod, et maatriksit välja printida
    //    private static void printMaatriks(int[][] laud) {
    //        for (int i = 0; i < laud.length; i++) {
    //            System.out.println(Arrays.toString(laud[i]));
    //        }
    //        System.out.println("");
    //    }
    
    public static void main (String[] args) {
        
        int rida;
        int veerg;
        
        for (rida = 1; rida <= 9; rida++) {
            
            for (veerg = 1; veerg <= 9; veerg++) {
                if (rida == veerg || veerg > rida) {
                    System.out.print(10 - veerg + " ");
                } else if (rida > veerg) {
                    System.out.print(10 - rida + " ");
                } else {
                    System.out.print("x");
                }
            }
            
            System.out.println();
            
        }
        
    }
    
}
// int middleColumn = noOfColumn/2+1
//  || veerg == 1 >=