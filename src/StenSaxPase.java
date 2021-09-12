import java.util.Random;
import java.util.Scanner;

public class StenSaxPase{
    static Scanner scanner = new Scanner(System.in);
    private static int userScore;
    private static int computerScore;

    public static void start() {

        System.out.println("Välkommen till \"Sten, Sax, Påse\"");
        System.out.println("Du spelar mot datorn och först till 3 vinster vinner!");

        while (userScore < 3 && computerScore < 3) {
            String[] RockPapperScissor = {"sten", "påse", "sax"};
            String playerMove = userMove();
            String computersMove = RockPapperScissor[new Random().nextInt(RockPapperScissor.length)];

            if (playerMove.equals(computersMove))
                System.out.println("Det är oavgjort! ");

            System.out.println("Datorn spelade: " + computersMove);
            switch (playerMove) {
                case "sten" -> rock(computersMove);
                case "påse" -> paper(computersMove);
                case "sax" -> scissor(computersMove);
            }
        }
        printWinnerMessage();
    }

    public static String userMove() {
        String playerMove;
        while (true) {
            System.out.println("Välj sten, sax eller påse!");
            playerMove = scanner.nextLine();

            if (playerMove.equals("sten") || playerMove.equals("sax") || playerMove.equals("påse")) {
                break;
            }
            System.out.println(playerMove + " är inte ett giltigt drag");
        }
        return playerMove;
    }

    public static void rock(String computersMove) {
        if (computersMove.equals("påse")) {
            computerScore += 1;
            System.out.println("Ditt resultat är: " + userScore);
            System.out.println("Datorn resultat är: " + computerScore);
        } else if (computersMove.equals("sax")) {
            userScore += 1;
            System.out.println("Ditt resultat är: " + userScore);
            System.out.println("Datorn resultat är: " + computerScore);
        }
    }

    public static void scissor(String computersMove) {
        if (computersMove.equals("påse")) {
            userScore += 1;
            System.out.println("Ditt resultat är: " + userScore);
            System.out.println("Datorn resultat är: " + computerScore);
        } else if (computersMove.equals("sten")) {
            computerScore += 1;
            System.out.println("Ditt resultat är: " + userScore);
            System.out.println("Datorn resultat är: " + computerScore);
        }
    }

    public static void paper(String computersMove) {
        if (computersMove.equals("sax")) {
            computerScore += 1;
            System.out.println("Ditt resultat är: " + userScore);
            System.out.println("Datorn resultat är: " + computerScore);
        } else if (computersMove.equals("sten")) {
            userScore += 1;
            System.out.println("Ditt resultat är: " + userScore);
            System.out.println("Datorn resultat är: " + computerScore);
        }
    }

    public static void printWinnerMessage() {
        if (userScore > computerScore) System.out.println("Grattis du vann!");
        if (userScore < computerScore) System.out.println("Datorn har vunnit spelet!");
        System.out.println();
    }
}