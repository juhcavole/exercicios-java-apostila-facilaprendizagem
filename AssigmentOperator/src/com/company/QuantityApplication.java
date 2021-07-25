package com.company;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class QuantityApplication {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java GUI Application");

        final JLabel quantityLabel = new JLabel("Quantity:");
        final JTextField quantityTextField = new JTextField();
        quantityTextField.setText("1");

        JButton incremmentButton = new JButton("+");
        incremmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int quantity = Integer.parseInt(quantityTextField.getText());
                quantity++;
                quantityTextField.setText(Integer.toString(quantity));

            }
        });
        JButton decreaseButton = new JButton("-");
        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int quantity = Integer.parseInt(quantityTextField.getText());
                quantity--;
                quantityTextField.setText(Integer.toString(quantity));
            }
        });

        frame.setLayout(new GridLayout(1,4));
        frame.add(quantityLabel);
        frame.add(quantityTextField);
        frame.add(incremmentButton);
        frame.add(decreaseButton);

        frame.setSize(300,100);
        frame.setVisible(true);
    }

}
