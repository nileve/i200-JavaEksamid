/**
 * Prindi konsooli 9x9 maatriks sudoku numbritega.
 */
public class NumSudokuNO {
    
    public static void main (String[] args) {
        
        int rida;
        int veerg;
        int num = 1;
        
        for (rida = 1; rida <= 9; rida++) {
            
            for (veerg = 1; veerg <= 9; veerg++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println("");
        }
    }
    
}
