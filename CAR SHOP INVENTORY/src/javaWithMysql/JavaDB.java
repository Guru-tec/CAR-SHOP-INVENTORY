package javaWithMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JavaDB {
	Connection connection;
	Statement statements;
	ResultSet resultSet;
	

	String url = "jdbc:mysql://localhost:3306/project1";
	String username ="root";
	String password = "Java@2021";
	public void readData() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(url, username , password);
		statements = connection.createStatement();
		resultSet = statements.executeQuery("  SELECT * FROM project1.`car_inventory`; ");
		
		while(resultSet.next()) {
			int carId = resultSet.getInt("carId");
			String brand = resultSet.getString("brand");
			String model = resultSet.getString("model" );
			int price = resultSet.getInt("price");
			System.out.println();
			
			System.out.println(carId +"."+brand+"  , " + model + " , " + price );
			
			
		}
		
		
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	}
	
	public void writeData() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username , password);
			statements = connection.createStatement();
			
			
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
			

			
			statements.executeUpdate(" INSERT INTO `project1`.`car_inventory` (`carId`, `brand`, `model`, `price`) VALUES ( '"+ carId +"', '"+brand+"', '"+ model+"','"+price +"');  ");
		
		 
		
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}

