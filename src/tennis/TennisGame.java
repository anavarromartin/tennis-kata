package tennis;

/*
1. A game is won by the first player to have won at least 4
points in total and at least 2 points more than the opponent.
The score is then "Win for player1" or "Win for player2"

2. The running score of each game is described in a manner
peculiar to Tennis. Scores are described as:

 0: "Love"
 1: "Fifteen"
 2: "Thirty"
 3: "Forty"

3. If at least three points have been scored by
each player and the scores are equal,
the score is "Deuce".

4. If at least three points have been scored
by each side, and a player has more points than
his or her opponent the score of the game is
"Advantage player1" or "Advantage player2"

 */
public class TennisGame {

    private int p1Score, p2Score;

    public String getScore() {
        if (isGameWon()) {
            if (p1Score > p2Score) {
                return "Player 1 Wins!";
            }
            return "Player 2 Wins!";
        }

        if (eachPlayerHasAtLeastThreePoints()) {
            if (p1Score == p2Score) {
                return "Deuce";
            }

            if (p1Score > p2Score) {
                return "Advantage player 1";
            }
            return "Advantage player 2";
        }

        return getScoreDescription(p1Score) +
                ", " + getScoreDescription(p2Score);
    }

    private boolean eachPlayerHasAtLeastThreePoints() {
        return (p1Score >= 3 && p2Score >= 3);
    }

    private boolean isGameWon() {
        return (p1Score >= 4 || p2Score >= 4) &&
                Math.abs(p1Score - p2Score) >= 2;
    }

    private String getScoreDescription(int score) {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return null;
        }
    }

    public void wonPoint(Player player) {
        switch (player) {
            case ONE:
                p1Score++;
                break;
            case TWO:
                p2Score++;
                break;
        }
    }
}

