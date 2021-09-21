package sk.kasv.mizak.springdemoone;

public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "kick to ball 5 times";
    }
}
