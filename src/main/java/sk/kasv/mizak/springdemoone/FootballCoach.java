package sk.kasv.mizak.springdemoone;

public class FootballCoach implements Coach{
    private FortuneTeller fortuneTeller1;

    @Override
    public String getDailyWorkout() {
        return "kick to ball 5 times";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    public FootballCoach(FortuneTeller fortuneTeller2){
        fortuneTeller1=fortuneTeller2;
    }
}
