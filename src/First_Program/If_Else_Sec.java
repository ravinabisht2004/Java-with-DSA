package First_Program;

import java.util.Scanner;

public class If_Else_Sec {
    public static void main(String[] args) {

    //Taking user input    

    Scanner input = new Scanner(System.in);

    // Grade Calculator
    // System.out.print("Please Enter Your Marks :- ");
    // float marks = input.nextFloat();
        
    // if (marks < 0 || marks > 100) {
    //     System.out.println("Invalid Marks");
    // }
    // else if (marks >= 90) {
    //     System.out.println("A Grade");
    // }
    // else if (marks >= 75) {
    //     System.out.println("B Grade");
    // }
    // else if (marks >= 60) {
    //     System.out.println("C Grade");
    // }
    // else if (marks >= 40) {
    //     System.out.println("D Grade");
    // }
    // else {
    //     System.out.println("Fail");
    // }


    //-- Largest of Three Numbers

    // System.out.print("Write First Number => ");
    // float number = input.nextFloat();

    // System.out.print("Write Second Number => ");
    // float secnum = input.nextFloat();

    // System.out.print("Write Third Number => ");
    // float thrnum = input.nextFloat();

    // if (number >= secnum && number >= thrnum) {
    //  System.out.println("First/ Largest Number: " + number);
    // }
    // else if (secnum >= number && secnum >= thrnum) {
    //     System.out.println("Second/ Largest Number: " + secnum);
    // }
    // else {
    //     System.out.println("Third/ Largest Number: " + thrnum);
    // }

    //-- Small Number

    //  if (number <= secnum && number <= thrnum) {
    //  System.out.println("First Smallest Number: " + number);
    // }
    // else if (secnum <= number && secnum <= thrnum) {
    //     System.out.println("Second Smallest Number: " + secnum);
    // }
    // else {
    //     System.out.println("Third Smallest Number: " + thrnum);
    // }

    //-- Temperature Check

    System.out.println("Enter Temperature");
    float temp = input.nextFloat();

    if (temp > 30){
        System.out.println("Hot");
    }
    else if (temp > 20){
        System.out.println("Normal");
    }
    else{
        System.out.println("Cold");
    }

    }
}
