package pruebaConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class pruebaConexion {

	public static void main(String[] args) {
		
		try {
			
			//Probamos la conexión
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qatar2022","root","joaquin2023");
		    System.out.println("Conexion exitosa!!");
		    
		    //Se crea el statement para hacer consulta a la BD
		    Statement stmt=con.createStatement();
		    
		    //Traigo tabla empleado
		    ResultSet rs=stmt.executeQuery("SELECT * FROM empleado");
		    while(rs.next())
		    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		    
			} catch (Exception e) { 
				System.out.println(e);
			}
	}

}
