package org.fls;

import java.util.Random;

public class Match {
    public static void playMatch(Team team1, Team team2) {
        Random random = new Random();
        int skillDifference = team1.getTeamSkill() - team2.getTeamSkill();

        int team1Goals = random.nextInt(5)+ Math.max(0, skillDifference / 10);
        int team2Goals = random.nextInt(5)+ Math.max(0, skillDifference / 10);

        System.out.println("Match Result: " + team1.name + " " + team1Goals + " - " + team2Goals + " " + team2.name);

        team1.updateStats(team1Goals, team2Goals);
        team2.updateStats(team2Goals, team2Goals);

    }
}
