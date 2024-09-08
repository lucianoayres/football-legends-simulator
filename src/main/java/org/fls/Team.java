package org.fls;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Team {
    String name;
    List<Player> players;
    int points;
    int goalsFor;
    int goalsAgainst;

    public Team(String name){
        this.name = name;
        this.players = new ArrayList<>();
        this.points = 0;
        this.goalsFor = 0;
        this.goalsAgainst = 0;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public int getTeamSkill() {
        int totalSkill = 0;
        for (Player player: players) {
            totalSkill += player.skill;
        }
        return !players.isEmpty() ? totalSkill / players.size() : 0;
    }

    public void updateStats(int goalsFor, int goalsAgainst) {
        this.goalsFor += goalsFor;
        this.goalsAgainst += goalsAgainst;
        if (goalsFor > goalsAgainst) {
            points += 3;
        } else if (goalsFor == goalsAgainst) {
            points += 1;
        }
    }

    @Override
    public String toString() {
        return name + " - Points: " + points + ", GF: " + goalsFor + ", GA: " + goalsAgainst;
    }
}
