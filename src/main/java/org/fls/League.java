package org.fls;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class League {
    List<Team> teams;

    public League(List<Team> teams) {
        this.teams = teams;
    }

    public void startLeague() {
        for (int i =0; i < teams.size(); i++) {
            for (int j= i + 1; j < teams.size(); j++) {
                Match.playMatch(teams.get(i), teams.get(j));
            }
        }
    }

    public void showStandings() {
        Collections.sort(teams, new Comparator<Team>() {
           @Override
           public int compare(Team t1, Team t2){
               if (t1.points == t2.points) {
                   return (t2.goalsFor - t2.goalsAgainst) - (t1.goalsFor - t1.goalsAgainst);
               }
               return t2.points - t1.points;
           }
        });

        System.out.println("\nLeague Standings:");
        for (Team team: teams) {
            System.out.println(team);
        }
    }
}
