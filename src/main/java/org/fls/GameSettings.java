package org.fls;

import java.util.ArrayList;
import java.util.List;

class GameSettings {
    public static List<String> loadTeamNames() {
        // Here, you can load the names from a file, database, or configuration.
        // For simplicity, we'll return a hardcoded list of team names.
        List<String> teamNames = new ArrayList<>();
        teamNames.add("Arsenal 2004");
        teamNames.add("Milan 1988-84");
        teamNames.add("Liverpool 1976-84");
        teamNames.add("Germany 1972-74");
        teamNames.add("France 1998-2000");
        teamNames.add("Real Madrid 1955-1960");
        teamNames.add("Manchester United 1999");
        teamNames.add("Barcelona 2009");
        teamNames.add("Brazil 1970");
        teamNames.add("Spain 2007-12");
        return teamNames;
    }
}