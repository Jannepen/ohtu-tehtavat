
package ohtu;

import java.util.ArrayList;

public class Player {
    private String name;
    private String nationality;
    private String team;
    private int games;
    private int goals;
    private int assists;
    private int penalties;

    public void setName(String name, String nationality, String team, int games, int goals, int assists, int penalties) {
        this.name = name;
        this.nationality = nationality;
        this.team = team;
        this.games = games;
        this.goals = goals;
        this.assists = assists;
        this.penalties = penalties;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getTeam() {
        return team;
    }

    public int getGames() {
        return games;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getPenalties() {
        return penalties;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void setPenalties(int penalties) {
        this.penalties = penalties;
    }

    @Override
    public String toString() {
        return name;
    }
      
}
