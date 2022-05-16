package com.company;

import javax.swing.*;
import java.awt.*;

public class BMI extends JFrame {
    public View view;
    public static Left left;
    public static Center center;
    public static Right right;

    public BMI() {
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        this.setTitle("BMI");
        view = new View(0, 0, Def.WIDTH, Def.HEIGHT, Color.CYAN);
        view.setLayout(null);
        this.getContentPane().add(view);
        left = new Left(0, 0, 300, Def.HEIGHT,View.color);
        center = new Center(Def.WIDTH / 3, 0, 300, Def.HEIGHT,View.color);
        right = new Right((Def.WIDTH - (Def.WIDTH / 3)), 0, 300, Def.HEIGHT, View.color);

        view.add(left);
        view.add(center);
        view.add(right);

        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);

    }
}
