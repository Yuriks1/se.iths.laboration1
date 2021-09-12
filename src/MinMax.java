import java.util.Scanner;

public class MinMax{
    static Scanner scanner = new Scanner(System.in);
    private static int maxValue = Integer.MIN_VALUE;
    private static int minValue = Integer.MAX_VALUE;
    private static final int[] userInput = new int[5];

    public static void start() {

        System.out.println("Välkommen till spelet Min Max ! ");
        System.out.println("Skriv in 5 tal, tryck ENTER efter varje tal: ");

        for (int i = 0; i < 5; i++)
            userInput[i] = Integer.parseInt(scanner.nextLine());

        for (int value : userInput) {
            if (value > maxValue)
                maxValue = value;
            if (value < minValue)
                minValue = value;
        }
        System.out.println("Största värdet är " + maxValue + " och minsta värdet är " + minValue);
    }
}