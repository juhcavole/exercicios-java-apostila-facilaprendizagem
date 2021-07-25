package com.company;



import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Java GUI application");

        JTextField textField = new JTextField();

        frame.add(textField,BorderLayout.NORTH);

        frame.setSize(300,200);
        frame.setVisible(true);



    }
}
