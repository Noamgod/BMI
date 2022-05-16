package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class View extends JPanel {
    public Controller control = new Controller();
    public static Color color = new Color(46, 166, 166, 255);


    public View(int x, int y, int w, int h, Color color) {
        this.setPreferredSize(new Dimension(Def.WIDTH, Def.HEIGHT));
        this.setBounds(x, y, w, h);
        this.setBackground(color);
    }

    public JLabel creatLabel(String text, int x, int y, int w, int h, int size, int style) {
        JLabel label = new JLabel();
        label.setFont(new Font("David", style, size));
        label.setText(text);
        label.setBounds(x, y, w, h);
        return label;
    }

    public JPanel creatPanel(int x, int y, int w, int h, Color color) {
        JPanel panel = new JPanel();
        panel.setBounds(x, y, w, h);
        panel.setBackground(color);
        panel.setLayout(null);
        return panel;
    }

    public JTextField creatJText(int x, int y, int w, int h) {
        JTextField field = new JTextField();
        field.setBounds(x, y, w, h);
        field.setBorder(null);
        return field;
    }

    public JRadioButton creatRadio(int x, int y, int w, int h, ActionListener listener) {
        JRadioButton r = new JRadioButton();
        r.addActionListener(listener);
        r.setBounds(x, y, w, h);
        r.setOpaque(false);
        return r;
    }

    public JRadioButton creatRadio(int x, int y, int w, int h) {
        JRadioButton r = new JRadioButton();
        r.setBounds(x, y, w, h);
        r.setOpaque(false);
        return r;
    }

    public JButton creatButton(String text, int x, int y, int w, int h, ActionListener listener) {
        JButton button = new JButton(text);
        button.addActionListener(listener);
        button.setBounds(x, y, w, h);
        button.setOpaque(false);
        return button;
    }

}

