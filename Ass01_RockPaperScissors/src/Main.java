import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String play1 = "";
        String play2 = "";
        String again = "";
        boolean done2 = false;
        boolean done1 = false;
        boolean done3 = false;

        do {
            done1 = false;
            done2 = false;

            do {
                System.out.print("Player 1 make your move, P, S or R: ");
                play1 = in.nextLine();
                if (Objects.equals(play1, "P") || Objects.equals(play1, "R") || Objects.equals(play1, "S")) {
                    done1 = true;  // because we got a valid number we can end the loop. Move is not stated to not give Player 2 any hints
                } else {
                    System.out.println("\nYou entered: " + play1);
                    System.out.println("You have to enter a valid move!");
                }
            } while (!done1);

            do {
                System.out.print("Player 2 make your move, P, S or R: ");
                play2 = in.nextLine();
                if (Objects.equals(play2, "P") || Objects.equals(play2, "R") || Objects.equals(play2, "S")) {
                    done2 = true;  // because we got a valid number we can end the loop. Move is not stated to not give Player 2 any hints
                } else {
                    System.out.println("\nYou entered: " + play2);
                    System.out.println("You have to enter a valid move!");
                }
            } while (!done2);

            if (Objects.equals(play1, "P")) {
                switch (play2) {
                    case "R" -> System.out.println("Player 1's Paper covered Player 2's Rock!");
                    case "S" -> System.out.println("Player 2's Scissors cut Player 1's Paper!");
                    case "P" -> System.out.println("It's a tie!");
                }
            }
            if (Objects.equals(play1, "R")) {
                switch (play2) {
                    case "P" -> System.out.println("Player 2's Paper covered Player 1's Rock!");
                    case "S" -> System.out.println("Player 1's Rock crushed Player 2's Scissors!");
                    case "R" -> System.out.println("It's a tie!");
                }
            }
            if (Objects.equals(play1, "S")) {
                switch (play2) {
                    case "P" -> System.out.println("Player 1's Scissors cut Player 2's Paper!");
                    case "R" -> System.out.println("Player 2's Rock crushed Player 1's Scissors!");
                    case "S" -> System.out.println("It's a tie!");
                }
            }
            System.out.print("Play Again? (Y/N): ");
            again = in.nextLine();
            if (!Objects.equals(again, "Y")) {
                done3 = true;  // end the loop if the answer is not Y
            }
        } while (!done3);
    }
}
