package patterns.behavioral.observer;


import patterns.behavioral.observer.observers.MultiplyObserver;
import patterns.behavioral.observer.observers.SecondPowerObserver;
import patterns.behavioral.observer.observers.SumObserver;

import java.util.LinkedList;
import java.util.List;

public class ObserverMain {

    public static void main(String args[]){
        //I am creating a Student
        List<Integer> numbers = new LinkedList<>();

        //I am creating the observers
        SumObserver sumObserver = new SumObserver(numbers);
        MultiplyObserver multiplyObserver = new MultiplyObserver(numbers);
        SecondPowerObserver secondPowerObserver = new SecondPowerObserver(numbers);

        //I am adding all the observers
        Student student = new Student(numbers);
        student.addObserver(sumObserver);
        student.addObserver(multiplyObserver);
        student.addObserver(secondPowerObserver);

        //Adding numbers to the current student
        student.addInput(1);
        student.addInput(3);

        //Removing the Sum observer
        student.removeObserver(sumObserver);

        //Adding numbers to the current student
        student.addInput(2);
    }

}
