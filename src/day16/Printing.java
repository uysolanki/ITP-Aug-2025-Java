package day16;

public class Printing {

	public static void printBill(String custName, String dateOfPlay, String timeOfPlay, Turf turf) {
		System.out.println("**** BILL ****");
		System.out.println(String.format("%-20s %-20s", "Customer Name : ",custName));
		System.out.println(String.format("%-20s %-20s", "Date Of Play :",dateOfPlay));
		System.out.println(String.format("%-20s %-20s", "Time Of Play :",timeOfPlay));
		System.out.println(String.format("%-20s %-20s", "Turf Type : ",turf.getTurfName()));
		System.out.println(String.format("%-20s %-20f", "Price : ",turf.getTurfPrice()));
		
	}

}
