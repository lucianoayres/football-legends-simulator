package org.fls;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class MatchTest {
    @Test
    public void testPlayMatch() {
        Team team1 = new Team("Team 1");
        Team team2 = new Team("Team 2");

        for (int i = 0; i < 11; i++) {
            team1.addPlayer(new Player("Player 1-" + i, 50 + i));
            team2.addPlayer(new Player("Player 2-" + i, 50 + i));
        }
        Match.playMatch(team1, team2);

        assertTrue(team1.goalsFor >= 0);
        assertTrue(team2.goalsFor >= 0);
    }
}