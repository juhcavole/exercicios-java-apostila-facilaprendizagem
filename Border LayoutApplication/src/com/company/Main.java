package com.company;

import java.awt.BorderLayout;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Java GUI Application");

        JLabel labelNorth = new JLabel("North");
        labelNorth.setHorizontalAlignment(JLabel.CENTER);

        JLabel labelSouth = new JLabel("South");
        labelSouth.setHorizontalAlignment(JLabel.CENTER);

        JLabel labelWest = new JLabel("West");
        labelWest.setHorizontalAlignment(JLabel.CENTER);

        JLabel labelEast = new JLabel("East");
        labelEast.setHorizontalAlignment(JLabel.CENTER);

        JLabel labelCenter = new JLabel("Center");
        labelCenter.setHorizontalAlignment(JLabel.CENTER);

        frame.add(labelNorth,BorderLayout.NORTH);
        frame.add(labelSouth,BorderLayout.SOUTH);
        frame.add(labelWest,BorderLayout.WEST);
        frame.add(labelEast,BorderLayout.EAST);
        frame.add(labelCenter,BorderLayout.CENTER);

        frame.setSize(300,200);
        frame.setVisible(true);


    }
}
