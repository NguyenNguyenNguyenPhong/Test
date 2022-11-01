package View;

import Controler.CounterListener;
import Model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView  extends JFrame {
    private CounterModel counterModel;
    private JButton jButton_up;
    private JButton jButton_down;
    private JLabel jLabel_value;
    public CounterView(){
        this.counterModel = new CounterModel();
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Counter");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener actionListener = new CounterListener(this);

        jButton_up = new JButton("Up");
        jButton_up.addActionListener(actionListener);
        jButton_down = new JButton("Down");
        jButton_down.addActionListener(actionListener);
        jLabel_value = new JLabel(this.counterModel.getValue()+"",JLabel.CENTER);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jButton_up,BorderLayout.WEST);
        jPanel.add(jLabel_value,BorderLayout.CENTER);
        jPanel.add(jButton_down,BorderLayout.EAST);

        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);

    }

    public void increment(){
        this.counterModel.increment();
        this.jLabel_value.setText(this.counterModel.getValue()+"");

    }
    public void decrement(){
        this.counterModel.decrement();
        this.jLabel_value.setText(this.counterModel.getValue()+"");

    }

}
