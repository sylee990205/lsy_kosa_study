package day3.exercise.exam3;

import org.springframework.stereotype.Component;

@Component("morningGreet")
public class MorningGreetingImpl implements Greeting {
    @Override
    public void greet() {
        System.out.println("상쾌한 아침입니다.");
    }
}
