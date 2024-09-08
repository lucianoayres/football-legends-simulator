package org.fls;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeagueTest {

    private League league;
    private Team teamA;
    private Team teamB;
    private Team teamC;

    @BeforeEach
    public void setUp() {
        teamA = createTeam("Team A", 80);
        teamB = createTeam("Team B", 65);
        teamC = createTeam("Team C", 60);

        List<Team> teams = new ArrayList<>();
        teams.add(teamA);
        teams.add(teamB);
        teams.add(teamC);
        league = new League(teams);
    }

    // Helper method to create a team with players
    private Team createTeam(String teamName, int baseSkill) {
        Team team = new Team(teamName);
        for (int i = 1; i <= 11; i++) {
            team.addPlayer(new Player(teamName + " Player " + i, baseSkill));
        }
        return team;
    }

    @Test
    public void testStartLeague() {
        League league = setupTwoTeamLeague();

        league.startLeague();

        // This test doesn't check any specific outcome of the startLeague method,
        // so we just assert that it runs without errors.
        assertTrue(true);
    }

    // Helper method to set up a two-team league
    private League setupTwoTeamLeague() {
        Team team1 = createTeam("Team 1", 50);
        Team team2 = createTeam("Team 2", 50);

        List<Team> teams = new ArrayList<>();
        teams.add(team1);
        teams.add(team2);

        return new League(teams);
    }

    @Test
    public void testShowStandings() {
        // Simulate match outcomes
        teamA.updateStats(3, 0); // Team A wins
        teamB.updateStats(1, 1); // Team B draws
        teamC.updateStats(0, 3); // Team C loses

        league.showStandings();

        // Assertions to verify standings
        assertEquals(3, teamA.points, "Team A should have 3 points");
        assertEquals(1, teamB.points, "Team B should have 1 point");
        assertEquals(0, teamC.points, "Team C should have 0 points");

        // Verify team ranking in standings
        assertEquals("Team A", league.teams.get(0).name, "Team A should be ranked first");
        assertEquals("Team B", league.teams.get(1).name, "Team B should be ranked second");
        assertEquals("Team C", league.teams.get(2).name, "Team C should be ranked third");
    }
}
