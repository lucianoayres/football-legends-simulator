package org.fls;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TeamTest {
    @Test
    public void testAddPlayer() {
        Team team = new Team("Team A");
        Player player = new Player("John Doe", 75);
        team.addPlayer(player);
        assertEquals(1, team.players.size());
        assertEquals("John Doe", team.players.get(0).name);
    }
}
