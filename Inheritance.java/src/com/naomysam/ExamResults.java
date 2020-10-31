package com.naomysam;

public class ExamResults {
    private String registrationNumber;
    private String  fullName;
   private String  examName;
    private int  examScore;
    private String  examGrade;

    public ExamResults(){
        registrationNumber = "scii/01345/2018";
        fullName = " naomy kerubo oongoro";
        examScore = 30;
        examName = "visual basic.net";
        examGrade = "D";
    }

    public String  studentNumber( String number){
        registrationNumber = number;
        return  registrationNumber;
    }
    public String studentName ( String name){
        fullName = name;
        return name;
    }
    public String exam (String initials){
        examName = "";
        if ( initials.equals("vb"))
            examName="visual basic";
        else if (initials.equals("jv"))
            examName=("java version");
        else if (initials.equals("aw"))
            examName=("advanced web");
        else if (initials.equals("ooad"))
            examName=("object oriented programming");
        else
            examName=("no exam chosen");
        return examName;
    }
    public int score (int score){
        examScore= score;
        return  examScore;
    }
    public String grade (int score){
        examScore = this.score(30);
        if ( score> 40)
            examGrade = "A";
        else if (score >30 && score<40)
            examGrade = "B";
        else  if ( score >20 && score < 30)
            examGrade = "C";
        else if ( score>10 && score <20)
            examGrade = "D";
        else if (score >0 && score<10)
            examGrade = "E";
        return  examGrade;
        }

}
class Certificates extends ExamResults {
    String  certificate;
    public String getCertificate(String grade){
        if (grade =="A") {
            certificate = "certificate of excellence awarded";
            return  certificate;
        }else if (grade =="B" || grade=="C"){
            certificate="certificate of achievement awarded";
            return  certificate;
        }else
            certificate="no certificate awarded";
        return certificate;
    }

    Certificates(){
        super();
        System.out.println("did not graduate");
    }

}
