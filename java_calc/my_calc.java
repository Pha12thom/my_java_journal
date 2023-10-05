
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator {

    public static void main(String[] args) {
        Frame f = new Frame("Calculator");
        f.setLayout(null);
        f.setSize(400, 400);

        Label l = new Label("First Number");
        l.setBounds(50, 50, 100, 30);
        f.add(l);

        TextField t = new TextField();
        t.setBounds(160, 50, 100, 30);
        f.add(t);

        Label l1 = new Label("Second Number");
        l1.setBounds(50, 100, 100, 30);
        f.add(l1);

        TextField t1 = new TextField();
        t1.setBounds(160, 100, 100, 30);
        f.add(t1);

        Button s = new Button("+");
        s.setBounds(80, 200, 100, 30);
        f.add(s);

        Button su = new Button("-");
        su.setBounds(80, 250, 100, 30);
        f.add(su);

        Button m = new Button("*");
        m.setBounds(160, 200, 100, 30);
        f.add(m);

        Button d = new Button("/");
        d.setBounds(160, 250, 100, 30);
        f.add(d);

        Button p = new Button("%");
        p.setBounds(80,300,100,30);
        f.add(p);


        Button clear = new Button("Clear"); // Added Clear button
        clear.setBounds(160, 300, 100, 30);
        f.add(clear);

        Label resultLabel = new Label("Result");
        resultLabel.setBounds(50, 150, 100, 30);
        f.add(resultLabel);

        TextField resultField = new TextField();
        resultField.setBounds(160, 150, 100, 30);
        resultField.setEditable(false);
        f.add(resultField);

        s.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(t.getText());
                double num2 = Double.parseDouble(t1.getText());
                double sum = num1 + num2;
                resultField.setText(String.valueOf(sum));
            }
        });

        su.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(t.getText());
                double num2 = Double.parseDouble(t1.getText());
                double subtract = num1 - num2;
                resultField.setText(String.valueOf(subtract));
            }
        });

        m.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(t.getText());
                double num2 = Double.parseDouble(t1.getText());
                double multiply = num1 * num2;
                resultField.setText(String.valueOf(multiply));
            }
        });

        d.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(t.getText());
                double num2 = Double.parseDouble(t1.getText());
                if (num2 == 0) {
                    resultField.setText("Cannot divide by zero");
                } else {
                    double division = num1 / num2;
                    resultField.setText(String.valueOf(division));
                }
            }
        });

        clear.addActionListener(new ActionListener() { // Clear button action
            public void actionPerformed(ActionEvent e) {
                t.setText("");
                t1.setText("");
                resultField.setText("");
            }
        });
        p.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentResult = resultField.getText();
                if (!currentResult.isEmpty()) {
                    double result = Double.parseDouble(currentResult);
                    double percentageValue = result * 100;
                    resultField.setText(String.valueOf(percentageValue));
                }
            }
        });


        f.setVisible(true);
    }
}
