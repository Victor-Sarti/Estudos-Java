package piBancoDeDados;

import java.sql.*;
public class ConectaMySQL {
	private final static String url = 
			"jdbc:mysql://localhost:3306/Senac";
	private final static String username = "root";
	private final static String password = "";
	private static Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public static void main(String args[]){
		ConectaMySQL b = new ConectaMySQL();
		b.openDB(); 	
		b.closeDB();
	}
	
	public Connection openDB(){
		try{
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
			System.out.println("\nConexÃ£o estabelecida com sucesso!\n");
		}catch(Exception e){
			System.out.println("\nNÃ£o foi possÃ­vel estabelecer conexÃ£o " + e + "\n");
			System.exit(1);	}
		return con;	
		}
	public void closeDB(){
		try{
			con.close();
		}catch(Exception e){
			System.out.println("\nNÃ£o foi possÃ­vel fechar conexÃ£o " + e + "\n");
			System.exit(1);		
		}	
	}
	public void closeDB(Connection cn, Statement st, ResultSet rs) throws SQLException {
		if(cn!=null)
			cn.close();
		if(st!=null)
			st.close();
		if(rs!=null)
			rs.close();
	}	
	public void closeDB(Statement st, ResultSet rs) throws SQLException {
		if(st!=null)
			st.close();
		if(rs!=null)
			rs.close();
	}	
}