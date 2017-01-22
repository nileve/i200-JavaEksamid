/**
 * Prindi konsooli 10x100 maatriks, kus läheb joon sikk-sakk ülevalt alla.
 *
 * Näide:
 * x
 *  x
 *   x
 *    x
 *     x
 *      x
 *       x
 *        x
 *         x
 *          x
 *         x
 *        x
 *       x
 *      x
 *     x
 *    x
 *   x
 *  x
 * x
 *  x
 *   x
 *    x
 *     x
 *      jne.
 *
 * Kasuta mis iganes tähiseid soovid ülesande lahendamiseks.
 */
public class SikkSakkNO {
    
    public static void main (String[] args) {
    
        int rida;
        int veerg;
    
        for (rida = 1; rida <= 100; rida++) {
        
            for (veerg = 1; veerg <= 10; veerg++) {

                if (rida == veerg) {
                    System.out.print("x");
                } else {
                    System.out.print(".");
                }
                    
            }
            System.out.println();
            
            for (veerg = 10; veerg >= 1; veerg--) {
                if ((rida - 1) == (9 - veerg)) {
                    System.out.print("1");
                }
                else {
                    System.out.print("2");
                }
            }
            
            System.out.println();
        }
    }
}
    

