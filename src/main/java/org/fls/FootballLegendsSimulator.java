package org.fls;

import java.util.ArrayList;
import java.util.List;

public class FootballLegendsSimulator {

    public static void main(String[] args) {

        // Load team names from settings
        List<String> teamNames = GameSettings.loadTeamNames();

        // Create teams based on settings
        List<Team> teams = new ArrayList<>();
        for (String teamName : teamNames) {
            Team team = createTeam(teamName, 50 + (int) (Math.random() * 50));
            teams.add(team);
        }

        League league = new League(teams);

        // Start the league
        System.out.println("Starting the league...\n");
        league.startLeague();

        // Show final standings
        league.showStandings();
    }

    // Helper method to create a team with random players
    private static Team createTeam(String teamName, int baseSkill) {
        Team team = new Team(teamName);
        for (int i = 1; i <= 11; i++) {
            team.addPlayer(new Player(teamName + " Player " + i, baseSkill + (int) (Math.random() * 50)));
        }
        return team;
    }
}