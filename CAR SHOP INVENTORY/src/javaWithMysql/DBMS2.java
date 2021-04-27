package javaWithMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class DBMS2 {

	public static void main(String[] args) {
		Connection connection;
		Statement statement;
		

		String url = "jdbc:mysql://localhost:3306/project1";
		String username ="root";
		String password = "Java@2021";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username , password);
			statement = connection.createStatement();
			
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter carId:");
			int carId =scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Enter brand:");
			String brand = scanner.nextLine();
			System.out.println("Enter model:");
			String model = scanner.nextLine();
			System.out.println("Enter price:");
			int price=scanner.nextInt();
			

			
			statement.executeUpdate(" INSERT INTO `project1`.`car_inventory` (`carId`, `brand`, `model`, `price`) VALUES ( '"+ carId +"', '"+brand+"', '"+ model+"','"+price +"');  ");
		
		
		
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}

	}

}
