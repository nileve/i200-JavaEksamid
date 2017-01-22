/**
 * Prindi konsooli 9x9 maatriks selliselt, et
 * joonistub suur X üle laua, nagu bingo diagonaalid.
 *
 * Näide:
 *
 * x       x
 *  x     x
 *   x   x
 *    x x
 *     x
 *    x x
 *   x   x
 *  x     x
 * x       x
 *
 * Kasuta mis iganes tähiseid soovid ülesande lahendamiseks.
*/
public class IksNO {
    
    public static void main (String[] args) {
        
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < (9 - i); j++) {
                System.out.print(".");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("1");
            }
            for (int k = 0; k < (9 - i); k++) {
                System.out.print("o");
            }
            System.out.println();
        }
        
        System.out.println("==========================");
        
        int rida;
        int veerg;
        
        for (rida = 1; rida <= 9; rida++) {
            
            for (veerg = 1; veerg <= 9; veerg++) {
                if ((rida == veerg) || ((rida - 1) == (9 - veerg))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            
            System.out.println();
        }
        
    }
    
}
    

    

