/**
 * Prindi konsooli 27x27 maatriks, kus on täidetud eesti tähestiku sudoku.
 * https://et.wikipedia.org/wiki/Eesti_t%C3%A4hestik
 */
public class StringSudokuNO {
    
    public static void main (String[] args) {
        
        
        int rida;
        int veerg;
//        int ch = 65;
//
//        for (rida = 1; rida <= 27; rida++) {
//            for (veerg=1; veerg<=27;veerg++){
//                System.out.print((char)(ch++));
//            }System.out.println();
//        }
        String s = "Aa, Bb, Dd, Ee, Ff, Gg, Hh, Ii, Jj, Kk, Ll, Mm, Nn, Oo, Pp, Rr, Ss, Šš, Zz, " +
                   "Žž, Tt, Uu, Vv, Õõ, Ää, Öö, Üü";
        
        for (rida = 1; rida <= 1; rida++) {
    
            for (veerg = 1; veerg <= 27; veerg++) {
                System.out.print(s);
                System.out.println();
            }System.out.println();
            
        }
    }
    
}
//for (veerg = 1; veerg <= 10; veerg++) {
//        System.out.print(num + " ");
//        num--;
//        }