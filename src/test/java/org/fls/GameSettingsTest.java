package org.fls;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class GameSettingsTest {

    @Test
    public void testLoadTeamNames() {
        // Expected team names
        List<String> expectedTeamNames = List.of(
                "Arsenal 2004",
                "Milan 1988-84",
                "Liverpool 1976-84",
                "Germany 1972-74",
                "France 1998-2000",
                "Real Madrid 1955-1960",
                "Manchester United 1999",
                "Barcelona 2009",
                "Brazil 1970",
                "Spain 2007-12"
        );

        // Actual team names from the method
        List<String> actualTeamNames = GameSettings.loadTeamNames();

        // Assert that the actual list matches the expected list
        assertIterableEquals(expectedTeamNames, actualTeamNames, "The team names loaded do not match the expected list.");
    }
}