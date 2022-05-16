
package com.company;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Center extends View {
    public static JPanel bodyP, genderP, weightP;
    public static JLabel bmiL, actualL, idealL;
    public static JRadioButton smaleR, mediumR, largeR;
    public JRadioButton male;
    public JRadioButton female;
    public JLabel maleL, femaleL, height, smaleL, mediumL, largeL;
    public static JTextField actualT, idealT;


    public Center(int x, int y, int w, int h, Color color) {
        super(x, y, w, h, color);
        this.setLayout(null);
        ButtonGroup groupGender = new ButtonGroup();
        ButtonGroup groupBodyFrame = new ButtonGroup();

        bmiL = creatLabel("BMI", Def.WIDTH / 3 / 2 - 60, 20, 120, 30, 40, Def.bold);


        bodyP = creatPanel(5, 100, Def.WIDTH / 3 - 10, Def.HEIGHT / 4, color);
        genderP = creatPanel(5, 225, Def.WIDTH / 3 - 10, Def.HEIGHT / 4, color);
        weightP = creatPanel(5, 350, Def.WIDTH / 3 - 10, Def.HEIGHT / 4, color);


        bodyP.setBorder(new TitledBorder("Body frame"));
        smaleL = creatLabel("Smale", 20, 30, 60, 20, 20, Def.italy);
        mediumL = creatLabel("Medium", 100, 30, 70, 20, 20, Def.italy);
        largeL = creatLabel("Large", 200, 30, 60, 20, 20, Def.italy);
        smaleR = creatRadio(30, 60, 30, 20, control);
        mediumR = creatRadio(120, 60, 30, 20, control);
        largeR = creatRadio(210, 60, 30, 20, control);


        genderP.setBorder(new TitledBorder("Gender"));
        maleL = creatLabel("Male", 20, 20, 50, 30, 20, Def.italy);
        male = creatRadio(30, 60, 20, 20, control);
        femaleL = creatLabel("Female", 100, 20, 80, 30, 20, Def.italy);
        female = creatRadio(110, 60, 20, 20, control);

        weightP.setBorder(new TitledBorder("Weight"));
        actualL = creatLabel("Actual Weight", 10, 30, 120, 30, 20, Def.italy);
        idealL = creatLabel("Ideal Weight", 160, 30, 120, 30, 20, Def.italy);
        actualT = creatJText(20, 70, 100, 20);
        idealT = creatJText(170, 70, 100, 20);
        idealT.setEditable(false);
        idealT.setText(" Waiting for input ");

        groupBodyFrame.add(male);
        groupBodyFrame.add(female);
        groupGender.add(smaleR);
        groupGender.add(mediumR);
        groupGender.add(largeR);

        genderP.add(male);
        genderP.add(female);
        genderP.add(maleL);
        genderP.add(femaleL);

        bodyP.add(smaleL);
        bodyP.add(mediumL);
        bodyP.add(largeL);
        bodyP.add(smaleR);
        bodyP.add(mediumR);
        bodyP.add(largeR);

        weightP.add(actualL);
        weightP.add(idealL);
        weightP.add(actualT);
        weightP.add(idealT);

        this.add(bmiL);
        this.add(genderP);
        this.add(bodyP);
        this.add(weightP);


    }
}


