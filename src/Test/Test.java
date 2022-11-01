package Test;

import Model.CounterModel;
import View.CounterView;

public class Test {
    public static void main(String[] args) {
        CounterModel counterModel = new CounterModel();
        counterModel.increment();
        counterModel.increment();
        counterModel.increment();

        System.out.println(counterModel.getValue());

        CounterView counterView = new CounterView();
    }
}
