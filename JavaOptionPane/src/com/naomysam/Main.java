package com.naomysam;

import javax.swing.*;

public class Main {

    public static void main(String[] args){
        String grade;
    String unitName = JOptionPane.showInputDialog("enter unit name");
    String score = JOptionPane.showInputDialog("enter unit score");
    int unitScore = Integer.parseInt(score);
    System.out.println(unitScore);
     if (score.equals(40)){
        grade = "D";
     }else if (score.equals(50)){
        grade = "C";
     }else if (score.equals(60)){
        grade = "B";
     }else if (score.equals(70)){
        grade = "A";
     }else
        grade = "score out o bounds";
    String outputResult = JOptionPane.showMessageDialog(null,"unit name is :" ,"grade",);
    }
}
