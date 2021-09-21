package sk.kasv.mizak.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

     //   BaseballCoach baseballCoach=new BaseballCoach();
     //   baseballCoach.getDailyWorkout();
        Coach theCoatch=context.getBean("baseball", Coach.class);
    }
}
