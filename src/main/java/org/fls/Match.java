package org.fls;

import java.util.Random;

public class Match {
    public static void playMatch(Team team1, Team team2) {
        Random random = new Random();
        int skillDifference = team1.getTeamSkill() - team2.getTeamSkill();

        // Determine the number of goals based on skill difference
        int team1Goals = random.nextInt(5) + Math.max(0, skillDifference / 10);
        int team2Goals = random.nextInt(5) - Math.max(0, skillDifference / 10);

        // Ensure goals are not negative
        team2Goals = Math.max(0, team2Goals);

        // Print match result
        System.out.println("Match Result: " + team1.name + " " + team1Goals + " - " + team2Goals + " " + team2.name);

        // Update stats for both teams
        team1.updateStats(team1Goals, team2Goals);
        team2.updateStats(team2Goals, team1Goals);
    }
}
