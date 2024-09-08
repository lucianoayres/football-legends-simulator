package org.fls;

import java.util.ArrayList;
import java.util.List;

public class FootballLegendsSimulator {

    public static void main(String[] args) {

        // Create 10 teams
        List<Team> teams = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Team team = createTeam("Team " + i, 50 + (int) (Math.random() * 50));
            teams.add(team);
        }

        League league = new League(teams);

        // Start league
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
