import java.util.Scanner;

public class OrdningOchReda{
    static Scanner scanner = new Scanner(System.in);
    private static final int AMOUNT_OF_NUMBERS = 5;
    private static final int[] input = new int[AMOUNT_OF_NUMBERS];

    public static void start() {

        System.out.println("Välkommen till spelet \"Ordning och reda\"! ");
        System.out.println("Skriv 5 tal, separerade med mellanslag: ");

        for (int i = 0; i < input.length; i++) {
            try{
                input[i] = Integer.parseInt(scanner.next());

            }catch(NumberFormatException ignore){
                System.out.println("Vänligen skriv in ENDAST 5 heltal");
                i--;
            }
        }
        printValues();
    }

    public static int sumNumbers() {
        int sumNumbers = 0;
        for (int userNumber : input) sumNumbers = sumNumbers + userNumber;
        return sumNumbers;
    }

    public static int getHighestValue() {
        int highestValue = Integer.MIN_VALUE;
        for (int i : input) {
            if (i > highestValue)
                highestValue = i;
        }
        return highestValue;
    }
    public static int getLowestValue() {
        int smallestValue = Integer.MAX_VALUE;
        for (int i : input) {
            if (i < smallestValue)
                smallestValue = i;
        }
        return smallestValue;
    }
    public static int getSecondHighestValue() {
        int highestValue = Integer.MIN_VALUE;
        int secondHighestValue = Integer.MIN_VALUE;
        for (int i : input) {
            if (i > highestValue) {
                secondHighestValue = highestValue;
                highestValue = i;
            } else if (i != highestValue && i > secondHighestValue)
                secondHighestValue = i;
        }
        return secondHighestValue;
    }

    public static int getSecondLowestValue() {
        int smallestValue = Integer.MAX_VALUE;
        int secondSmallestValue = Integer.MAX_VALUE;
        for (int i : input) {
            if (i < smallestValue) {
                secondSmallestValue = smallestValue;
                smallestValue = i;
            } else if (i != smallestValue && i < secondSmallestValue)
                secondSmallestValue = i;
        }
        return secondSmallestValue;
    }

    public static boolean isInputSorted() {
        boolean sorter = true;
        for (int i = 0; i < input.length - 1; i++)
            if (input[i] > input[i + 1]) {
                sorter = false;
                break;
            }
        return sorter;
    }
    public static void printValues() {
        System.out.println("Min value: " + getLowestValue());
        System.out.println("2Min value:: " + getSecondLowestValue());
        System.out.println("Max value:: " + getHighestValue());
        System.out.println("2Max value:: " + getSecondHighestValue());
        System.out.println("I ordning: " + isInputSorted());
        System.out.println("Summa: " + sumNumbers());
    }
}
