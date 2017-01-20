import java.util.Arrays;

/**
 * Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.
 */
public class MaagilineSeitse {
    
    public static void main (String[] args) {
        
        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};
        int[] uusNaide = findSeven(naide);
        printArray(uusNaide);
        System.out.println("The average is " + getAverage(uusNaide));
        
    }
    
    public static void printArray (int[] printedArray) {
        for (int i = 0; i < printedArray.length; i++) {
            System.out.println("New array element " + i + " value: " + printedArray[i]);
        }
    }
    
    // create new array, multiply 7 by 2, return to main method
    public static int[] findSeven (int[] newArray) {
        int[] finalNumbers = Arrays.copyOf(newArray, newArray.length);
        for (int i = 0; i < finalNumbers.length; i++) {
            if (finalNumbers[i] == 7) {
                finalNumbers[i] = finalNumbers[i] * 2;
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
        return (double) sum / (double) array.length;
    }
    
}
