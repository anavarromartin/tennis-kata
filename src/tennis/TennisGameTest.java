package tennis;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TennisGameTest {

    TennisGame game = new TennisGame();

    @Test
    @DisplayName("when p1 scores, returns {Fifteen, Love}")
    void P1Scores() {
        game.wonPoint(Player.ONE);

        assertEquals("Fifteen, Love", game.getScore());
    }

    @Test
    @DisplayName("when p2 scores, returns {Love, Fifteen}")
    void P2Scores() {
        game.wonPoint(Player.TWO);

        assertEquals("Love, Fifteen", game.getScore());
    }

    @Test
    void P1ScoresTwice() {
        game.wonPoint(Player.ONE);
        game.wonPoint(Player.ONE);

        assertEquals("Thirty, Love", game.getScore());
    }

    @Test
    void P2ScoresTwice() {
        game.wonPoint(Player.TWO);
        game.wonPoint(Player.TWO);

        assertEquals("Love, Thirty", game.getScore());
    }

    @Test
    void P1ScoresThreeTimes() {
        game.wonPoint(Player.ONE);
        game.wonPoint(Player.ONE);
        game.wonPoint(Player.ONE);

        assertEquals("Forty, Love", game.getScore());
    }

    @Test
    void P1Wins_byScoringFourPointsInARow() {
        game.wonPoint(Player.ONE);
        game.wonPoint(Player.ONE);
        game.wonPoint(Player.ONE);
        game.wonPoint(Player.ONE);

        assertEquals("Player 1 Wins!", game.getScore());
    }

    @Test
    void P2Wins_byScoringFourPointsInARow() {
        game.wonPoint(Player.TWO);
        game.wonPoint(Player.TWO);
        game.wonPoint(Player.TWO);
        game.wonPoint(Player.TWO);

        assertEquals("Player 2 Wins!", game.getScore());
    }

    @Test
    void deuce() {
        getToDeuce();

        assertEquals("Deuce", game.getScore());
    }

    private void getToDeuce() {
        game.wonPoint(Player.ONE);
        game.wonPoint(Player.ONE);
        game.wonPoint(Player.ONE);
        game.wonPoint(Player.TWO);
        game.wonPoint(Player.TWO);
        game.wonPoint(Player.TWO);
    }

    @Test
    void advantagePlayer1() {
        getToDeuce();
        game.wonPoint(Player.ONE);

        assertEquals("Advantage player 1", game.getScore());
    }

    @Test
    void advantagePlayer2() {
        getToDeuce();
        game.wonPoint(Player.TWO);

        assertEquals("Advantage player 2", game.getScore());
    }
}
