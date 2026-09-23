package First_Program.Student_Attendance_Tracker;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean value = true;

         int presentDays = 0;
         int absentDays = 0;
         int totalDays = 30;
         float percetage = 0f;

        while (value) {

            System.out.println("===== Attendance Tracker =====");
            System.out.println("1. Mark Present");
            System.out.println("2. Mark Absent");
            System.out.println("3. Show Attendance");
            System.out.println("4. Check Attendance Percentage");
            System.out.println("5. Exit");

            System.out.print("Enter Your Choice : ");
            int choice = input.nextInt();

           

            switch (choice){

                case 1 -> { if (presentDays + absentDays >= totalDays){
                            System.out.println("Attendance not mark successfully");

                         }else{
                            presentDays = presentDays + 1;
                            System.out.println("Attendance mark successfully");
                            }
                          }

                case 2 -> {if (presentDays + absentDays >= totalDays){
                            System.out.println("AbsentDays not mark successfully");

                         }else{
                            absentDays = absentDays + 1;
                            System.out.println("AbsentDays mark successfully");
                          }
                        }

                case 3 -> {

                        System.out.println("Total Working Days : " + totalDays);
                        System.out.println("Present Days : " + presentDays);
                        System.out.println("Absent Days : " + absentDays);

                        }          

                case 4 -> {

                    percetage = (presentDays * 100f)/ totalDays;

                    if (percetage >= 75.00) {

                        System.out.println("Attendance Percentage : " + percetage);
                        System.out.println("Attendance sufficient");
                        
                    }else {
                        
                        System.out.println("Attendance Percentage : " + percetage);
                        System.out.println("Attendance Low");

                    }    

               
                        
                }   
                
                 case 5 -> {

                        value = false;

                    }    

                 default -> {
                    System.out.println("Invalid choice");
                }   
                        
                

            }

            
            
        }
        
    }
    
}
