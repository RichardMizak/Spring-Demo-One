package sk.kasv.mizak.springdemoone;

public class BaseballCoach implements Coach{
    private FortuneTeller fortuneTeller1;

    public String getDailyWorkout(){

        return "get workout";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    public BaseballCoach(FortuneTeller fortuneTeller2){
        fortuneTeller1=fortuneTeller2;
    }
}
