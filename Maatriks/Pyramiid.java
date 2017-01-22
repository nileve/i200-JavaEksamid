/**
 * Nüüd paneme loode ja kagu nurga kokku ja loome pealtvaates püramiidi:
 *
 * 0 0 0 0 0 0 0 0 0
 * 0 1 1 1 1 1 1 1 0
 * 0 1 2 2 2 2 2 1 0
 * 0 1 2 3 3 3 2 1 0
 * 0 1 2 3 4 3 2 1 0
 * 0 1 2 3 3 3 2 1 0
 * 0 1 2 2 2 2 2 1 0
 * 0 1 1 1 1 1 1 1 0
 * 0 0 0 0 0 0 0 0 0
 *
 * Kui tuletad meelde kuidas loode ja kagu nurka lahendada ning
 * kuidas kirdest edelasse diagonaali joonistada, siis tead ka
 * kuidas seda ülesannet lahendada.
 *
 * Massiivi ei ole vaja panna, lihtsalt prindi välja. Ära üle
 * mõtle - lahendada on võimalik kahe tsükli ja ühe if lausega.
 */
public class Pyramiid {
    
    public static void main (String[] args) {
    
        int dim = 9;
        int level = 1;
        for (int i = 0; i < dim; i++) {
            int l = 0;
            for (int j = 0; j < dim; j++) {
                if (j < (dim / 2)+1) {
                    l++;
                    if (l > level) {
                        System.out.print(level);
                    } else {
                        System.out.print(l);
                    }
                } else {
                    l--;
                    if (l >= level) {
                        System.out.print(level);
                    } else {
                        System.out.print(l);
                    }
                }
            }
            System.out.println("");
        
            if (i<dim/2)
                level++;
            else level--;
        }
        
            System.out.println();
        System.out.println("============================");
        
        
        for(int rida = 0; rida < 9; rida++){
            for(int veerg = 0; veerg < 9; veerg++){
                // The distance to the left, right, top and bottom border:
                int vasak = veerg;
                int parem = 9 - (veerg+1);
                int ylemine = rida;
                int alumine = 9 - (rida+1);
            
                // The distance to the closest border:
                int lahim = Math.min(Math.min(vasak, parem), Math.min(ylemine, alumine));
            
                // Print according number
                System.out.print(lahim+1 + " ");
            }
            System.out.println();
        }
        
    }
}
// || column == 1 || row == 1
    
            ////                if (rida == veerg || veerg > rida) {
            //                    System.out.print(num+1);
            //                } //else {
            //                    System.out.print("x");
            //                }
            //
            ////                if (rida == veerg || veerg > rida) {
            ////                    System.out.print(rida);
            ////                } else if (rida > veerg) {
            ////                    System.out.print(veerg);
            ////                } else {
            ////                    System.out.print("x");
            ////                }
            //
            ////                if (rida == veerg || veerg > rida) {
            ////                    System.out.print(10 - veerg);
            ////                } else if (rida > veerg) {
            ////                    System.out.print(10 - rida);
            ////                } else {
            ////                    System.out.print("x");
            ////                }
            //        //System.out.println();
            //            }
            //            System.out.println();