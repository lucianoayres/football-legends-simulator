package org.fls;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    public void testPlayerInitialization() {
        Player player = new Player("John Doe", 75);
        assertEquals("John Doe", player.name);
        assertEquals(75, player.skill);
    }
}
