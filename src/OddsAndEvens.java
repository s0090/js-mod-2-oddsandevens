import java.lang.reflect.Array;
import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {
        line1();
    }
    public static void line1() {
      //  List<String> allowedValues = new ArrayList<>(Arrays.asList("o", "O", "E", "e"));
        Scanner input = new Scanner(System.in);
        System.out.println("Let’s play a game called \"Odds and Evens\"");
        System.out.print("What's your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", Which do you choose? (O)dds or (E)vens? ");
        String bet = input.next();

        while (!bet.equalsIgnoreCase("o") && !bet.equalsIgnoreCase("e")) {
            System.out.print("Enter O for odds or E for evens: ");
            bet = input.next();
        }
        if (bet.equalsIgnoreCase("o")) {
            System.out.println("you have chosen Odds, Computer will be Evens.");
        } if (bet.equalsIgnoreCase("e")) {
            System.out.println("you have chosen Evens, Computer will be Odds");
        }
        System.out.println("------------------------------------------");

        System.out.print("How many \"fingers\" do you put out? ");
        Integer fingers = input.nextInt();
        Random rand = new Random();
        Integer computer = rand.nextInt(10);
        System.out.println("The computer plays " + computer + " fingers.");

        System.out.println("------------------------------------------");

        Integer sum = (fingers+computer);
        String fstring = fingers.toString();
        String fcomputer = computer.toString();
        String fsum = sum.toString();
        System.out.println(fstring + " + " + fcomputer + " = " + fsum);
        boolean oddoreven = (sum % 2 == 0);
        if (oddoreven = true) {
            System.out.println(fsum + " is ... Odd!");
        } else {
            System.out.println(fsum + " is ... Even!");
        }
        if ((bet.equalsIgnoreCase("o") && (oddoreven = true)) || (bet.equalsIgnoreCase("e") && (oddoreven = false))) {
            System.out.println("That means " + name + " wins!! Congrats");
        } else {
            System.out.println("That means the Computer wins, Unlucky..");
        }

        System.out.println("------------------------------------------");

    }
}
