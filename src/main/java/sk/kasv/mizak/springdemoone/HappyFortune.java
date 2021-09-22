package sk.kasv.mizak.springdemoone;

public class HappyFortune implements FortuneTeller{
    @Override
    public String getFortune() {
        return "You will have a good day";
    }
}
