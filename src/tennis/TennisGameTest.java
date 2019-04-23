package tennis;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

/*
    CHEAT SHEET

        - To create a new test:
            type 'test', and press enter

        - Assertions guide:
            assertTrue( <x> ): will fail if <x> is false
            assertFalse( <x> ): will fail if <x> is true
            assertEquals(<expected>, <actual>): will fail if <expected> != <actual>

        - TDD flow:
            1. Write the minimal amount of test that will fail
            2. Write the minimal amount of code that will pass the test
            3. Refactor
            4. Go back to (1)
*/

class TennisGameTest {

    @Test
    @DisplayName("when p1 scores, returns {Fifteen, Love}")
    void P1Scores() {
        fail();
    }
}
