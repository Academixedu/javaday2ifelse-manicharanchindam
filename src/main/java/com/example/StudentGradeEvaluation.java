package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out .println("Enter your age: ");
        int age = scanner.nextInt();
        System.out .println("Enter your exam score: ");
        int examScore = scanner.nextInt();
        String grade;
        if(examScore >= 90)
        {
            grade="A";
        }
        else if(examScore >=80 && examScore <90)
        {
            grade="B";
        }
        else if(examScore >=70 && examScore <80)
        {
            grade="C";
        }
        else if(examScore >=60 && examScore <70)
        {
            grade="D";
        }
        else
        {
            grade="F";
        }
           
            
        
           System.out.println("Name:"+name);
           System.out.println("Age:"+age);
           System.out.println("Examscore:"+examScore);
           System.out.println("Grade:"+grade);

           if(age<25 && examScore>=80)
           {
               System.out.println("The student is eligible for a scholarship.");

           }
           else
           {
            
               System.out.println("The student is not eligible for a scholarship.");
           }
        
        

       
    }
}
