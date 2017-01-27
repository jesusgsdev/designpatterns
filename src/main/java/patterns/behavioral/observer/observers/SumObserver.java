package patterns.behavioral.observer.observers;

import patterns.behavioral.observer.InputObserver;

import java.util.List;

public class SumObserver extends InputObserver {

    private List<Integer> numbers;

    public SumObserver(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void calculations() {
        System.out.println("The sum is: " + numbers.stream().mapToInt(n -> n).sum());
    }
}
