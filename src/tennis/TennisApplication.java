package tennis;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class TennisApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TennisGame game = new TennisGame();
        while (true) {
            try {
                System.out.println("Who scores? (P1 | P2): ");
                String player = sc.nextLine();
                if (player.equals("P1")) {
                    game.wonPoint(Player.ONE);
                } else if (player.equals("P2")) {
                    game.wonPoint(Player.TWO);
                } else {
                    throw new InvalidParameterException();
                }

                String score = game.getScore();
                System.out.println("Score: " + score);
                if (score.toLowerCase().contains("wins")) {
                    break;
                }
            } catch (InvalidParameterException e) {
                System.out.println("Error: invalid player.");
            }
        }
    }
}
