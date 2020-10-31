package  com.naomysam;

public  class FieldVariables{
    private String FullName;
    private String ExamName;
    private String ExamScore;
    private String ExamGrade;

    FieldVariables (){
        FullName = "no name";
        ExamScore = "no score yet";
        ExamName = " unknown";
        ExamGrade = "You'll know later";
    }
    String fullName(String name){
        FullName =name;
        return  FullName;
    }
    String examName( String initials ){
       ExamName = "";
       if ( initials.equals("PH"))
          ExamName = ("PHP");
       else if ( initials.equals("JV"))
         ExamName = ("java");
       else if (initials.equals("OA"))
           ExamName = ("office automation");
       else
           ExamName = ("invalid initials");
       return  ExamName;
    }
    String examScore(String  score){
        ExamScore = score;
        return ExamScore;
    }
    String  examGrade (int score){
       ExamGrade ="";
       if ( score> 40)
           ExamGrade = "A";
       else if ( score >30 && score <41)
           ExamGrade = "B";
       else if( score > 20 && score < 31)
           ExamGrade = "C";
       else if ( score> 10 && score < 20)
           ExamGrade = "D";
       else
           ExamGrade= "E";
       return  ExamGrade;
    }

}


