import java.util.ArrayList;
import java.util.Scanner;

public class UppOchNer{

    static Scanner scanner = new Scanner(System.in);

    public static void start() {

        System.out.println("Välkommen till \"Upp och Ner\"! ");
        System.out.println("Skriv in ett antal ord och tryck ENTER mellan varje ord.");
        System.out.println("Avsluta med END");

        play();
    }

    public static void play() {
        var words = new ArrayList<String>();
        boolean afterWord = true;

        while (afterWord) {
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "END" -> afterWord = false;
                default -> words.add(userInput);
            }
        }
        wordsInReverse(words);
    }

    public static void wordsInReverse(ArrayList<String> words) {
        for (int i = words.size(); i > 0; i--)
            System.out.println(words.get(i - 1));
    }
}