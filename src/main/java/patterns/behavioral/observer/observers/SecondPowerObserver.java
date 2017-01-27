package patterns.behavioral.observer.observers;

import patterns.behavioral.observer.InputObserver;

import java.util.List;

public class SecondPowerObserver extends InputObserver {

    private List<Integer> numbers;

    public SecondPowerObserver(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void calculations() {
        System.out.println("The sum of the second power is: " + numbers.stream().map(n -> Math.pow(n, 2)).mapToInt(n -> n.intValue()).sum());
    }
}
