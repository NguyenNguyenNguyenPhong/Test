package Controler;

import View.CounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListener implements ActionListener {
    private CounterView counterView ;
    public CounterListener(CounterView counterView ){
        this.counterView = counterView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
     //   System.out.println("Ban da nhan nut!");
        String src = e.getActionCommand();
        System.out.println("Ban da nhan nut "+ src);

        if(src.equals("Up")){
            this.counterView.increment();
        }else if(src.equals("Down")){
            this.counterView.decrement();
        }
    }
}
