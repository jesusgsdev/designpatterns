package patterns.behavioral.observer;


import java.util.LinkedList;
import java.util.List;

public class Student {

    private List<InputObserver> observers = new LinkedList<>();
    private List<Integer> inputs = new LinkedList<>();

    public Student(List<Integer> inputs) {
        this.inputs = inputs;
    }

    public void addInput(Integer number){
        System.out.println("\nAdded the number: " + number);
        inputs.add(number);
        doTheMaths();
    }

    public void addObserver(InputObserver o){
        observers.add(o);
    }

    public void removeObserver(InputObserver o){
        observers.remove(o);
    }

    private void doTheMaths(){
        observers.stream().forEach(o -> o.calculations());
    }

}
