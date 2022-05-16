package com.company;

import java.awt.*;

public class Model {



    public void PaintResults() {
        if (Data.bmi < 15) {
            Right.statusL.setText("Anorexic");
            SetBackground(Color.red);
        } else if (Data.bmi < 18.5) {
            Right.statusL.setText("Underweight ");
            SetBackground(Color.yellow);
        } else if (Data.bmi < 24.9) {
            Right.statusL.setText("Normal");
            SetBackground(new Color(50, 233, 132));
        } else if (Data.bmi < 29.9) {
            Right.statusL.setText("Overweight");
            SetBackground(Color.yellow);
        } else if (Data.bmi < 35) {
            Right.statusL.setText("Obese");
            SetBackground(Color.orange);
        } else {
            Right.statusL.setText("Extreme Obese");
            SetBackground(Color.red);
        }
    }

    public void CalSlimness() {
        if (Controller.score==Center.smaleR) {
            Data.slimness = 0.9;
        } else if (Controller.score==Center.mediumR) {
            Data.slimness = 1;
        } else if (Controller.score==Center.largeR){
            Data.slimness = 1.1;
        }
    }


    private void SetBackground(Color color) {

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

