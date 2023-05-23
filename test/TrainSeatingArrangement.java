package test;
import java.util.Scanner;


	public class TrainSeatingArrangement {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter the number of test cases: ");
	        int testCases = input.nextInt();
	        for (int i = 0; i < testCases; i++) {
	            System.out.print("Enter the seat number: ");
	            int seatNumber = input.nextInt();
	            int oppositeSeatNumber = getOppositeSeatNumber(seatNumber);
	            String seatType = getSeatType(seatNumber);
	            System.out.println("Seat " + seatNumber + " is a " + seatType + " seat and is opposite seat " + oppositeSeatNumber);
	        }
	        input.close();
	    }
	    
	    public static int getOppositeSeatNumber(int seatNumber) {
	        int remainder = seatNumber % 12;
	        if (remainder == 0) {
	            return seatNumber - 11;
	        } else {
	            return seatNumber + (12 - remainder) + 1;
	        }
	    }
	    
	    public static String getSeatType(int seatNumber) {
	        int remainder = seatNumber % 6;
	        if (remainder == 1 || remainder == 6) {
	            return "WS";
	        } else if (remainder == 2 || remainder == 5) {
	            return "MS";
	        } else {
	            return "AS";
	        }
	    }
	}
