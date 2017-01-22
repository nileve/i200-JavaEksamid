import java.util.Arrays;

/**
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said alla keskmise iga grupi kohta?
 */
public class TudengidAllaKeskmiseNO {
    
    // Main klass on ainult sulle endale testimiseks
    public static void main (String[] args) {
        
        //        System.out.println(allaKeskmise(new int[]{19, 45, 55, 67, 89}));
        //        System.out.println(allaKeskmise(new int[]{55, 23, 88, 56, 43, 90, 34}));
        //        System.out.println(allaKeskmise(new int[]{21, 85, 45}));
        
        int[] hinded1 = {19, 45, 55, 67, 89};
        int[] hinded2 = {55, 23, 88, 56, 43, 90, 34};
        int[] hinded3 = {21, 85, 45};
        
        int[] newhinded1 = findMaxis(hinded1);
        int[] newhinded2 = findMaxis(hinded2);
        int[] newhinded3 = findMaxis(hinded3);
        
        printArray(newhinded1);
        System.out.println("hinded1 avg: " + getAverage(newhinded1));
        System.out.println("hinded1 < avg: " + countBelow(newhinded1));
        
        printArray(newhinded2);
        System.out.println("hinded2 avg: " + getAverage(newhinded2));
        System.out.println("hinded2 < avg: " + countBelow(newhinded2));
        
        
        printArray(newhinded3);
        System.out.println("hinded3 avg: " + getAverage(newhinded3));
        System.out.println("hinded3 < avg: " + countBelow(newhinded3));
        
    }
    
    public static void printArray (int[] printedArray) {
        //        for (int i = 0; i < printedArray.length; i++) {
        //            System.out.println("new values: " + printedArray[i]);
        //        }
        System.out.println("New Hinded: " + Arrays.toString(printedArray));
    }
    
    public static int[] findMaxis (int[] newArray) {
        int[] finalNumbers = Arrays.copyOf(newArray, newArray.length);
        for (int i = 0; i < finalNumbers.length; i++) {
            if (finalNumbers[i] > 60) {
                finalNumbers[i] = 60;
            }
        }
        return finalNumbers;
    }
    
    // calculate average for the numbers and return the value to main method
    public static double getAverage (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        //return Math.round((double) sum / (double) array.length);
        return (double) sum / (double) array.length;
    }
    
    public static int countBelow (int[] newArray) {
        int belowNumbers = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < getAverage(newArray)) {
                belowNumbers++;
            }
        }
        return belowNumbers;
    }
    
}
