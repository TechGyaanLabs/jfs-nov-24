package com.careerit.cj.day7;

class StudentDetails{

    private String name;
    private String email;
    private double[] marks = new double[5];

    public StudentDetails(String name,String email,double score1,double score2,double score3){
        this.name = name;
        this.email = email;
        init(score1,score2,score3);
    }

    private void init(double score1,double score2,double score3){
        marks[0] = score1;
        marks[1] = score2;
        marks[2] = score3;
        // Calculate total and average and store in marks array
    }

    public void showInfo(){
        // Name
        // Email
        // Score Details
        // score1  score2  score3  total  average

        // Result : Pass or Fail
    }


}
public class AssignmentQuestion2 {

    public static void main(String[] args) {

            // Create 5 student objects and display each student details
    }

}
