package isp.lab3.exercise3;

import java.util.Random;

public class FootballPlayerTest { public static void main(String[] args) {
    FootballPlayer footballPlayer = new FootballPlayer("Cristiano Ronaldo","Juventus",'M');
        /*System.out.println(footballPlayer);
        System.out.println("Player name: "+footballPlayer.getName());
        System.out.println("Player gender: "+footballPlayer.getGender());
        footballPlayer.setTeam("PSG");
        System.out.println("Player team: "+footballPlayer.getTeam());
        System.out.println("Goals scored: "+footballPlayer.scoreAGoal(11));*/
    Random r = new Random();
    int nrOfGoalsScored = r.nextInt(30-15) + 15;
    footballPlayer.scoreAGoal(nrOfGoalsScored);
    System.out.println(footballPlayer.toString());
}
}
