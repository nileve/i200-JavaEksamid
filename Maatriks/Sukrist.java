/**
 * Loo 10*10 maatriks tagurpidi Tsirkuse lauamänguga. Ehk numbrid ühest sajani
 * alustavad ülevalt paremalt ja jõuavad alla paremale (või kui kaugele iganes).
 *
 * Näide 5*5 laual:
 *  5  4  3  2  1
 *  6  7  8  9 10
 * 15 14 13 12 11
 * 16 17 18 19 20
 * 25 24 23 22 21
 * 26 27 28 29 30
 */
public class Sukrist {

    // Lihtsalt abiline meetod, et maatriksit välja printida
    public static void main (String[] args) {
        
        int rida;
        int veerg;
        int num = 100;
        
        for (rida = 1; rida <= 10; rida++) {
            
            for (veerg = 1; veerg <= 10; veerg++) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println("");
        }
    }
}
