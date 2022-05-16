package com.company;

import java.awt.*;

public class Model {

    public Model() {
        CalSlimness();
        PaintResults();
    }

    private void PaintResults() {
        if (Data.bmi < 15) {
            Right.statusL.setText("Anorexic");
            Setbackground(Color.red);
        } else if (Data.bmi < 18.5) {
            Right.statusL.setText("Underweight ");
            Setbackground(Color.yellow);
        } else if (Data.bmi < 24.9) {
            Right.statusL.setText("Normal");
            Setbackground(new Color(50, 233, 132));
        } else if (Data.bmi < 29.9) {
            Right.statusL.setText("Overweight");
            Setbackground(Color.yellow);
        } else if (Data.bmi < 35) {
            Right.statusL.setText("Obese");
            Setbackground(Color.orange);
        } else {
            Right.statusL.setText("Extreme Obese");
            Setbackground(Color.red);
        }
    }

    private void CalSlimness() {
        if (Controller.score == Center.smaleR) {
            Data.slimness = 0.9;
        } else if (Controller.score == Center.mediumR) {
            Data.slimness = 1;
        } else {
            Data.slimness = 1.1;
        }
    }


    private void Setbackground(Color color) {

        BMI.left.setBackground(color);
        BMI.center.setBackground(color);
        BMI.right.setBackground(color);
        Left.heightP.setBackground(color);
        Left.detailsP.setBackground(color);
        Center.genderP.setBackground(color);
        Center.bodyP.setBackground(color);
        Center.weightP.setBackground(color);
        Right.resultP.setBackground(color);
    }
}

