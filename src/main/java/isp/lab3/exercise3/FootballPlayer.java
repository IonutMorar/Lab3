package isp.lab3.exercise3;

public class FootballPlayer {
    private String name;
    private String team;
    private int goalsScored;
    private char gender;

    public FootballPlayer(String name, String team, char gender) {
        this.name = name;
        this.team = team;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public char getGender() {
        return gender;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int scoreAGoal(int goalsScored){
        this.goalsScored = goalsScored;
        return goalsScored;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                " scored" +
                ", goalsScored=" + goalsScored +
                " goals at" +
                ", team='" + team + '\'' +
                '}';
    }
}
