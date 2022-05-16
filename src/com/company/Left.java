package com.company;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.stream.IntStream;

public class Left extends View {
    public static JLabel name, lastName, age, heightL, heightScore;
    public static JTextField nameT, lastT, ageT;
    public static JSlider slider;
    public static JPanel heightP, detailsP;
    public static JComboBox ageBox;


    public Left(int x, int y, int w, int h, Color color) {
        super(x, y, w, h, color);
        this.setLayout(null);

        detailsP = creatPanel(10, 100, 120, 380, color);
        detailsP.setBorder(new TitledBorder("Details"));

        name = creatLabel("First name: ", 10, 15, 200, 30, 20, Def.italy);
        nameT = creatJText(10, 50, 100, 20);
        lastName = creatLabel("Last name: ", 10, 80, 120, 30, 20, Def.italy);
        lastT = creatJText(10, 120, 100, 20);
        age = creatLabel("Age: ", 10, 150, 50, 30, 20, Def.italy);


        int[] range = IntStream.rangeClosed(1, 120).toArray();
        String[] arr = new String[120];
        for (int i = 0; i < range.length; i++) {
            arr[i] = Integer.toString(range[i]);
        }

        ageBox = new JComboBox(arr);
        ageBox.addActionListener(control);

        ageBox.setBounds(60, 150, 50, 30);


        heightP = creatPanel(140, 100, 158, 380, color);
        heightP.setBorder(new TitledBorder("Height"));
        heightL = creatLabel("Height", 80, 120, 80, 30, 22, Def.bold);
        heightScore = creatLabel("", 90, 160, 80, 30, 22, Def.regular);
        slider = new JSlider(1, 140, 190, 140);
        slider.setBounds(10, 20, 50, 350);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setPaintLabels(true);
        slider.setSnapToTicks(true);
        slider.setOpaque(false);
        slider.addChangeListener(control);
        heightP.add(slider);
        heightP.add(heightL);
        heightP.add(heightScore);


        detailsP.add(name);
        detailsP.add(nameT);
        detailsP.add(lastName);
        detailsP.add(lastT);
        detailsP.add(age);
        detailsP.add(ageBox);

        this.add(detailsP);
        this.add(heightP);

    }

}