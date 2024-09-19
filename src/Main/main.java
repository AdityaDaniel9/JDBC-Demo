package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {

	private static final String url= "jdbc:mysql://127.0.0.1:3306/infosys";
	private static final String username ="root";
	private static final String password = "mysql";
	
	
	public static void main(String[] a) {
		
		
		
		
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			
			//Statement statement = connection.createStatement();
			
//			-----------------------TO ADD VALUES TO SINGLE ROW--------------------
//			int id = 6;
//			String names = "Girish";
//			int age = 27;
//			int sallary = 60000;
//			String city = "Banagalore";
//			String query = String.format("insert into employees(id,names,age,sallary,city)values(%d,'%s',%d,%d,'%s');",id,names,age,sallary,city);
//			
//			
//			
//			int rowsaffected = statement.executeUpdate(query);
//			
//			if(rowsaffected > 0) {
//				System.out.println("data added sucsessfully");
//			}
//			else {
//				System.out.println(" No data added");
//			}
			
			
//---------------------------TO UPDATE ONE VALUE FROM A COLUMN-------------------------------
					
//			String query = String.format("UPDATE employees SET sallary = %d WHERE id= %d ",75000,4 );			
//			
//			int rowsaffected = statement.executeUpdate(query);
//			
//			if(rowsaffected > 0) {
//				System.out.println("data updated sucsessfully");
//			}
//			else {
//				System.out.println(" No data updated");
//			}
			
			
//----------------------TO DELETE A ROW ------------------------------------------------------
//String query = "DELETE FROM employees WHERE  id = 3";			
//			
//			int rowsaffected = statement.executeUpdate(query);
//			
//			if(rowsaffected > 0) {
//				System.out.println("data deleted sucsessfully");
//			}
//			else {
//				System.out.println(" No data deleted");
//			}
			
			
			
			
//	------------------------------TO GET OR VIEW DATA------------------------------------------- 		
//			String query = "select * from employees";
//			ResultSet resultSet = statement.executeQuery(query);
//			
//			while(resultSet.next()) {
//				
//				int id = resultSet.getInt("id");
//				String name = resultSet.getString("names");
//				int sallary = resultSet.getInt("sallary");
//				int age = resultSet.getInt("age");
//				String city = resultSet.getString("city");
//				
//				System.out.println("id: " + id);
//				System.out.println("name: " + name);
//				System.out.println("sallary: " + sallary);
//				System.out.println("age: "+ age);
//				System.out.println("city: " + city);
//				System.out.println("------------------------");
//				
//				
//			}
//----------------------------------------------------------------------------------------------
			
//----------------------------------WITH PREPARED STATEMENT-------------------------------------
			
//--------------------------------------ADDING DATA WITH PREPARED STATEMENT---------------------------------------------
			
//			String query = "insert into employees(id,names,age,sallary,city)values(?,?,?,?,?)";
//			
//			PreparedStatement preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setInt(1, 10);
//			preparedStatement.setString(2, "Avi");
//			preparedStatement.setInt(3, 26);
//			preparedStatement.setInt(4, 100000);
//			preparedStatement.setString(5, "Bhilai");
//			
//			int rowsAffected = preparedStatement.executeUpdate();
//			if( rowsAffected > 0) {
//				System.out.println("Data has been Added");
//				
//			}else {
//				System.out.println("No Data has been Added");
//			}
//			
//----------------------------GETTING DATA WITH PREPARED STATEMENT----------------------------			
//			String sql = "SELCT * from employees where id =?";
//			
//			PreparedStatement preparedStatement = connection.prepareStatement(sql);
//		
//			
//			preparedStatement.setInt(1,4);
//			
//			ResultSet resultSet = preparedStatement.executeQuery();
//			
//			if(resultSet.next()) {
//				
//				int id = resultSet.getInt("id");
//				String name = resultSet.getString("names");
//				int sallary = resultSet.getInt("sallary");
//				int age = resultSet.getInt("age");
//				String city = resultSet.getString("city");
//				
//				System.out.println("id: " + id);
//				System.out.println("name: " + name);
//				System.out.println("sallary: " + sallary);
//				System.out.println("age: "+ age);
//				System.out.println("city: " + city);
//				System.out.println("------------------------");			}
//			else {
//				
//				System.out.println("No data with this id");
//			}
//-----------------------UPDATE DATA WITH PREPARED STATEMENTS-----------------------------------------	
			
	String query = "UPDATE  from employees SET sallary = ? where id =?";
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
		
			
			preparedStatement.setInt(1,79000);
			preparedStatement.setInt(2,4);
			
			int rowsAffected = preparedStatement.executeUpdate();
			if( rowsAffected > 0) {
				
				System.out.println(" data updated for this id");		}
			else {
				
				System.out.println("No data updated for this id");
			}
			
			

//-----------------------------------------------------------------------------------------------			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
