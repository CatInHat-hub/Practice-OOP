import java.io.IOException;			
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


//class MySQL{
//	
//}

public class main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		System.out.print("What will you code for today?");
//		Scanner scanner= new Scanner(System.in);
//		CauHoi cauHoi= new CauHoi();
//		cauHoi.initQuestion(scanner);
//		cauHoi.test();
//		scanner.close();	
//		
//		try {
////			Class.forName("");
//			
//		} catch (ClassNotFoundException e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
//		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","b^TsgF(act8AXnV");
			java.sql.Statement creaStatement= connection.createStatement();
			ResultSet resultSet = creaStatement.executeQuery("select * from products");
			while(resultSet.next()) {
				System.out.println(resultSet.getString(2));
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}