package identityMap;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String c = "";
		Scanner input = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("Enter the ID you want to retrieve: ");
			int id = input.nextInt();
			
			Person b = new Person();
			
			long startTime = System.currentTimeMillis();
			b.finder(id);
			long endTime = System.currentTimeMillis();
			
			System.out.println(endTime - startTime + " milliseconds");
			System.out.println(PersonIdentityMap.getPersonMap());
			
			System.out.println("Do you want to continue (y/n): ");
			c = input.next();
		}
		while(c.equalsIgnoreCase("Y"));
		input.close();
	}

}