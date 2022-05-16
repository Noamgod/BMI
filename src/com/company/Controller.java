package com.company;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Objects;

public class Controller implements ActionListener, ChangeListener {
    public Model m;
    public static Object score;
    private boolean flag = true;

    @Override
    public void actionPerformed(ActionEvent e) {

        score=e.getSource();
        m = new Model();
        m.CalSlimness();

        if (e.getSource().equals(Right.submitB)) {
            String temp = Integer.toString(Left.ageBox.getSelectedIndex() + 1);

            String temp1 = Center.actualT.getText();

            if (Objects.equals(temp1, "") || Objects.equals(temp1, " I Need you man")) {
                if (flag) {
                    Center.actualT.setForeground(Color.red);
                } else {
                    Center.actualT.setForeground(new Color(0x101E4F));
                }
                Center.actualT.setText(" I Need you man");
                flag = !flag;

            }

            if (!Objects.equals(temp1, "") && !Objects.equals(temp1, " I Need you man")) {

                Data.age = Double.parseDouble(temp);
                Data.weight = Double.parseDouble(temp1);
                Data.bmi = Double.parseDouble(new DecimalFormat("##.##").format(Data.weight / Math.pow(Data.height, 2) * 10000));
                String text = Double.toString(Data.bmi);
                Right.bmiL.setText(text);
                System.out.println( "s:  " + Data.slimness);
                Data.ideal = Double.parseDouble(new DecimalFormat("##.##").format((Data.height - 100 + (Data.age / 10)) * 0.9 * Data.slimness));
                String temp2 = Double.toString(Data.ideal);
                Center.idealT.setText(temp2);
                Center.actualT.setText(temp1);
                m.PaintResults();
            }
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        String text = Integer.toString(Left.slider.getValue());
        Data.height = Left.slider.getValue();
        Left.heightScore.setText(text);

    }

}
