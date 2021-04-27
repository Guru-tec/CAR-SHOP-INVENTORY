package javaWithMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBMS {

	public static void main(String[] args) {
		Connection connection;
		Statement statements;
		ResultSet resultSet;
		

		String url = "jdbc:mysql://localhost:3306/project1";
		String username ="root";
		String password = "Java@2021";
		
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
				
				System.out.println(carId +"."+brand+" ," +model + " , " + price );
				
				
			}
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}

	}

}
