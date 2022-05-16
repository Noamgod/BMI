package com.company;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Right extends View {
    public static JButton submitB, resetB;
    public static JLabel bmiL, statusL;
    public static JPanel resultP;
    public JLabel textL, text1L;

    public Right(int x, int y, int w, int h, Color color) {
        super(x, y, w, h, color);
        this.setLayout(null);

        submitB = creatButton("Submit", 90, 430, 90, 40, control);
        resetB = creatButton("Reset", 190, 430, 90, 40, control);


        resultP = creatPanel(0, 100, 300, 125, color);
        textL = creatLabel("Your BMI is: ", 0, 25, 180, 30, 25, Def.bold);
        bmiL = creatLabel("", 165, 25, 100, 30, 20, Def.regular);
        text1L = creatLabel("Your status is:", 0, 70, 180, 30, 25, Def.bold);
        statusL = creatLabel("", 165, 70, 200, 30, 20, Def.regular);

        resultP.setBorder(new TitledBorder("Results"));

        resultP.add(textL);
        resultP.add(text1L);
        resultP.add(bmiL);
        resultP.add(statusL);

        this.add(resultP);
        this.add(submitB);
        this.add(resetB);
    }
}