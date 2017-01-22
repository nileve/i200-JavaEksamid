/**
 * Loo 9*9 maatriks, millel on kujutatud liivakella. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 0 0 0 0 0 0 0 0
 * . 0 0 0 0 0 0 0 .
 * . . 0 0 0 0 0 . .
 * . . . 0 0 0 . . .
 * . . . . 0 . . . .
 * . . . 0 0 0 . . .
 * . . 0 0 0 0 0 . .
 * . 0 0 0 0 0 0 0 .
 * 0 0 0 0 0 0 0 0 0
 */
public class Liivakell {
    // http://javaconceptoftheday.com/number-pattern-programs-in-java/
    // Lihtsalt abiline meetod, et maatriksit välja printida
    public static void main (String[] args) {
    
        int rida;
        int veerg;
        //Printing upper half of the pattern
        for (rida = 1; rida <= 9; rida++) {
            //Printing i spaces at the beginning of each row
            for (veerg= 1; veerg < rida; veerg++) {
                System.out.print(" ");
            }
            //Printing i to rows value at the end of each row
            for (veerg = rida; veerg <= 9; veerg++) {
                System.out.print(veerg );
            }
            System.out.println();
        }
    
        //Printing lower half of the pattern
        for (rida = 9-1; rida >= 1; rida--) {
            //Printing i spaces at the beginning of each row
            for (veerg = 1; veerg < 9; veerg++) {
                System.out.print(" ");
            }
            //Printing i to rows value at the end of each row
            for (veerg= rida; veerg <= 9; veerg++) {
                System.out.print(veerg);
            }
            System.out.println();
        }
        System.out.println("=====================");
    
        //Printing upper half of the pattern
        for (int i = 1; i <= 9; i++) {
            //Printing i spaces at the beginning of each row
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            //Printing i to rows value at the end of each row
            for (int j = i; j <= 9; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //Printing lower half of the pattern
        for (int i = 9-1; i >= 1; i--) {
            //Printing i spaces at the beginning of each row
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            //Printing i to rows value at the end of each row
            for (int j = i; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("=====================");
    
        //Printing upper half of the pattern
        for (rida = 1; rida <= 9; rida++) {
            //Printing i spaces at the beginning of each row
            for (veerg = 1; veerg < rida; veerg++) {
                System.out.print("o");
            }
            //Printing i to rows value at the end of each row
            for (veerg = rida; veerg <= 9; veerg++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        //Printing lower half of the pattern
        for (rida = 10-1; rida >= 1; rida--) {
            //Printing i spaces at the beginning of each row
            for (veerg = 1; veerg < rida; veerg++) {
                System.out.print(" ");
            }
            //Printing i to rows value at the end of each row
            for (veerg = rida; veerg < 9; veerg++) {
                System.out.print("o");
            }
            System.out.println();
        }
        System.out.println("=====================");
    
        //Printing upper half of the pattern
        for (int i = 1; i <= 5; i++) {
            //Printing i spaces at the beginning of each row
            for (int j = 1; j < i; j++) {
                System.out.print(".");
            }
            //Printing i to rows value at the end of each row
            for (int j = i; j <= 5; j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
        //Printing lower half of the pattern
        for (int i = 5-1; i >= 1; i--) {
            //Printing i spaces at the beginning of each row
            for (int j = 1; j < i; j++) {
                System.out.print(".");
            }
            //Printing i to rows value at the end of each row
            for (int j = i; j <= 5; j++) {
                System.out.print("");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("");
    }
}
