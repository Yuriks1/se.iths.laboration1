import java.util.Scanner;

public class MainMenu{

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("1. Upp och Ner\n2. Min Max \n3. Sten Sax Påse");
            System.out.println("4. Ordning och reda\ne. Avsluta");

            String player = scanner.nextLine();

            switch (player) {
                case "1" -> UppOchNer.start();
                case "2" -> MinMax.start();
                case "3" -> StenSaxPase.start();
                case "4" -> OrdningOchReda.start();
                case "e", "E" -> System.exit(0);
            }
        }
    }
}