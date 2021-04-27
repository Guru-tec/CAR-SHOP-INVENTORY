package javaWithMysql;

import java.util.Scanner;

public class DBMS_RW {

	public static void main(String[] args) {
		JavaDB db =new JavaDB();
		Scanner scanner = new Scanner(System.in);
		while(true) {

			System.out.println("Press 1 to read all data");
			System.out.println("Press 2 to write all data");
			System.out.print("Choose_");
			
			int input= scanner.nextInt();
			switch(input) {
			case 1:
				db.readData();
				break;
			case 2:
				db.writeData();
				break;
				default:System.out.println("Invalid option");
				
			}
			
			
			
			
		}

	}

}

	
	
	
	
	
	
	
	
	