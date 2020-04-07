/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalumnos.bdConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author gem2u
 */
public class BDconnection {
    protected Connection connection = null;
	
	public Connection getConnection() 
        {
		try 
		{			
		    Class.forName("com.mysql.jdbc.Driver");
                    connection = DriverManager.getConnection("jdbc:mysql://localhost/gestiondealumnos","root","");
                }catch(SQLException ex)
		{ ex.printStackTrace();}catch(ClassNotFoundException e){e.printStackTrace();}
		
		return connection;
	}
	
	public void cerrarBD() throws SQLException
	{
            try 
            {
                if(connection!=null) { connection.close(); }
            
            }catch(SQLException ex)
		{ ex.printStackTrace();}catch(Exception e) { e.printStackTrace();}
	}
}
