package patterns.behavioral.observer.observers;

import patterns.behavioral.observer.InputObserver;

import java.util.List;

public class MultiplyObserver extends InputObserver {

    private List<Integer> numbers;

    public MultiplyObserver(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void calculations() {
        System.out.println("The product is: " + numbers.stream().reduce(1, (n1,n2) -> n1*n2).intValue());
    }
}
