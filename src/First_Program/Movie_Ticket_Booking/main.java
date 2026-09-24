package First_Program.Movie_Ticket_Booking;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("--- Choose Movie Genre ---");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");

        System.out.print("Enter movie type number : ");
        int chooseMovie = input.nextInt();


        switch(chooseMovie){

            case 1 -> {
                System.out.println("--Action Movie Menu--");
                System.out.println("1. Movie A");
                System.out.println("2. Movie B");
                System.out.println("3. Movie C");


                System.out.print("Enter movie number : ");
                int movie = input.nextInt();

                switch(movie){


                    case 1 -> {
                        
                        System.out.println("--Seat type--");
                        System.out.println("1. Regular --> 150");
                        System.out.println("2. Premium --> 250");
                        System.out.println("3. VIP     --> 400");

                        System.out.print("Select Seat Type Number : ");
                        int seatype = input.nextInt();

                        switch(seatype){

                            case 1 -> System.out.println( " MovieName => Movie A & Seat => Regular (150) ");
                            case 2 -> System.out.println( " MovieName => Movie A & Seat => Premium (250) ");
                            case 3 -> System.out.println( " MovieName => Movie A & Seat => VIP (400) ");
                            default -> System.out.println("Invalid Value");
                        }


                    }


                     case 2 -> {
                        
                        System.out.println("--Seat type--");
                        System.out.println("1. Regular --> 150");
                        System.out.println("2. Premium --> 250");
                        System.out.println("3. VIP     --> 400");

                        System.out.print("Select Seat Type Number : ");
                        int seatype = input.nextInt();

                        switch(seatype){

                            case 1 -> System.out.println( " MovieName => Movie B & Seat => Regular (150) ");
                            case 2 -> System.out.println( " MovieName => Movie B & Seat => Premium (250) ");
                            case 3 -> System.out.println( " MovieName => Movie B & Seat => VIP (400) ");
                            default -> System.out.println("Invalid Value");
                        }


                    }

                     case 3 -> {
                        
                        System.out.println("--Seat type--");
                        System.out.println("1. Regular --> 150");
                        System.out.println("2. Premium --> 250");
                        System.out.println("3. VIP     --> 400");

                        System.out.print("Select Seat Type Number : ");
                        int seatype = input.nextInt();

                        switch(seatype){

                            case 1 -> System.out.println( " MovieName => Movie C & Seat => Regular (150) ");
                            case 2 -> System.out.println( " MovieName => Movie C & Seat => Premium (250) ");
                            case 3 -> System.out.println( " MovieName => Movie C & Seat => VIP (400) ");
                            default -> System.out.println("Invalid Value");
                        }


                    }

                  

                    default -> System.out.println("Invalid Value");
                }

                

            }

             case 2 -> {
                System.out.println("--Comedy Movie Menu--");
                System.out.println("1. Movie D");
                System.out.println("2. Movie E");
                System.out.println("3. Movie F");


                System.out.print("Enter movie number : ");
                int movie = input.nextInt();

                switch(movie){
                    case 1 -> {
                        
                        System.out.println("--Seat type--");
                        System.out.println("1. Regular --> 150");
                        System.out.println("2. Premium --> 250");
                        System.out.println("3. VIP     --> 400");

                        System.out.print("Select Seat Type Number : ");
                        int seatype = input.nextInt();

                        switch(seatype){

                            case 1 -> System.out.println( " MovieName => Movie D & Seat => Regular (150) ");
                            case 2 -> System.out.println( " MovieName => Movie D & Seat => Premium (250) ");
                            case 3 -> System.out.println( " MovieName => Movie D & Seat => VIP (400) ");
                            default -> System.out.println("Invalid Value");
                        }


                    }


                     case 2 -> {
                        
                        System.out.println("--Seat type--");
                        System.out.println("1. Regular --> 150");
                        System.out.println("2. Premium --> 250");
                        System.out.println("3. VIP     --> 400");

                        System.out.print("Select Seat Type Number : ");
                        int seatype = input.nextInt();

                        switch(seatype){

                            case 1 -> System.out.println( " MovieName => Movie E & Seat => Regular (150) ");
                            case 2 -> System.out.println( " MovieName => Movie E & Seat => Premium (250) ");
                            case 3 -> System.out.println( " MovieName => Movie E & Seat => VIP (400) ");
                            default -> System.out.println("Invalid Value");
                        }


                    }

                     case 3 -> {
                        
                        System.out.println("--Seat type--");
                        System.out.println("1. Regular --> 150");
                        System.out.println("2. Premium --> 250");
                        System.out.println("3. VIP     --> 400");

                        System.out.print("Select Seat Type Number : ");
                        int seatype = input.nextInt();

                        switch(seatype){

                            case 1 -> System.out.println( " MovieName => Movie F & Seat => Regular (150) ");
                            case 2 -> System.out.println( " MovieName => Movie F & Seat => Premium (250) ");
                            case 3 -> System.out.println( " MovieName => Movie F & Seat => VIP (400) ");
                            default -> System.out.println("Invalid Value");
                        }


                    }

                    

        }
    }

    case 3 -> {
                System.out.println("--Drama Movie Menu--");
                System.out.println("1. Movie G");
                System.out.println("2. Movie H");
                System.out.println("3. Movie I");


                System.out.print("Enter movie number : ");
                int movie = input.nextInt();

                switch(movie){
                    case 1 -> {
                        
                        System.out.println("--Seat type--");
                        System.out.println("1. Regular --> 150");
                        System.out.println("2. Premium --> 250");
                        System.out.println("3. VIP     --> 400");

                        System.out.print("Select Seat Type Number : ");
                        int seatype = input.nextInt();

                        switch(seatype){

                            case 1 -> System.out.println( " MovieName => Movie G & Seat => Regular (150) ");
                            case 2 -> System.out.println( " MovieName => Movie G & Seat => Premium (250) ");
                            case 3 -> System.out.println( " MovieName => Movie G & Seat => VIP (400) ");
                            default -> System.out.println("Invalid Value");
                        }


                    }


                     case 2 -> {
                        
                        System.out.println("--Seat type--");
                        System.out.println("1. Regular --> 150");
                        System.out.println("2. Premium --> 250");
                        System.out.println("3. VIP     --> 400");

                        System.out.print("Select Seat Type Number : ");
                        int seatype = input.nextInt();

                        switch(seatype){

                            case 1 -> System.out.println( " MovieName => Movie H & Seat => Regular (150) ");
                            case 2 -> System.out.println( " MovieName => Movie H & Seat => Premium (250) ");
                            case 3 -> System.out.println( " MovieName => Movie H & Seat => VIP (400) ");
                            default -> System.out.println("Invalid Value");
                        }


                    }

                     case 3 -> {
                        
                        System.out.println("--Seat type--");
                        System.out.println("1. Regular --> 150");
                        System.out.println("2. Premium --> 250");
                        System.out.println("3. VIP     --> 400");

                        System.out.print("Select Seat Type Number : ");
                        int seatype = input.nextInt();

                        switch(seatype){

                            case 1 -> System.out.println( " MovieName => Movie I & Seat => Regular (150) ");
                            case 2 -> System.out.println( " MovieName => Movie I & Seat => Premium (250) ");
                            case 3 -> System.out.println( " MovieName => Movie I & Seat => VIP (400) ");
                            default -> System.out.println("Invalid Value");
                        }


                    }

                    default -> System.out.println("Invalid Value");

                }
                
            }

            default -> System.out.println("Invalid Value");
    
}
}
}
