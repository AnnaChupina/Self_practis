package day15;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer = "";
        String room;

        System.out.println("Do you want to reserve a room? yes/no");
        answer = input.next().toLowerCase();

    while(true)    {

        while (!( answer.equals("yes") || answer.equals("no") )){
            System.err.println("Invalid answer, Do you want to reserve a room? yes/no");
            answer = input.next().toLowerCase();
        }
        if(answer.equals("no")){
            System.out.println("have a nice day");
            break;
        }else{

            System.out.println("What type of room you wants to reserve?\n1/2/3" +
                    "\n\t1. King Bed ==> 120$\n\t2. Queen Bed ==> 100$\n\t3. single Bed ==> 80$" );
             room = input.next().toLowerCase();

            while (!(room.equals("1")|| room.equals("2")|| room.equals("3"))){
                System.err.println("Invalid answer, you need to choosing type of room. 1/2/3");
                room = input.next().toLowerCase();
            }

            if(room.equals("1")){
                System.out.println("You reserve King bed for 120$");
            } else if(room.equals("2")){
                System.out.println("You reserve Queen bed for 100$");
            }else{
                System.out.println("You reserve single bed for 80$");
            }

        System.out.println("Do you want reserve another room?  Yes/No");
            answer = input.next().toLowerCase();
            while (!( answer.equals("yes") || answer.equals("no") )) {
                System.err.println("Invalid answer, Do you want to reserve a room? yes/no");
                answer = input.next().toLowerCase();
            }
        }





    }
    input.close();
    }
}
/*
8. Create a class called RoomReservation, write a program for the room reservation, your program asks
the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no,
    	print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user
    			 provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides
            a valid entry)

 */