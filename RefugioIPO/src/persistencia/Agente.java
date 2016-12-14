package persistencia;


import java.awt.List;
import java.sql.*;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.JOptionPane;

import org.apache.commons.*;
import org.hsqldb.*;

import presentacion.Login;

import com.healthmarketscience.*;

import net.ucanaccess.*;


public class Agente {
	//instancia del agente
    protected static Agente mInstancia=null;
    //Conexion con la base de datos
    protected static Connection mBD;
	//Identificador ODBC de la base de datos
    private static String url="jdbc:ucanaccess://";
    //Driven para conectar con bases de datos Microsoft Access 
    private static String driver="net.ucanaccess.jdbc.UcanaccessDriver";
    
    //Constructor
    private Agente(String s)throws Exception {
    	conectar(s);		
    }
    
    //Implementacion del patron singleton
     public static Agente getAgente(String s) throws Exception{
          if (mInstancia==null){
          mInstancia=new Agente(s);
        }
        return mInstancia;
     }
 
    //Metodo para realizar la conexion a la base de datos 
    private void conectar(String s) throws Exception {
         Class.forName(driver);
         mBD=DriverManager.getConnection(url+s);
    }
    
    


   
    //Metodo para desconectar de la base de datos
    public void desconectar() throws Exception{
    	mBD.close();
    }

    //Metodo para realizar una insercion en la base de datos
    public int insert(String SQL) throws SQLException, Exception{ 
     	conectar(Login.getDireccion());
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	return res;
    }
    
    //Metodo para realizar una eliminacion en la base de datos
    public int delete(String SQL) throws SQLException,Exception{

    	conectar(Login.getDireccion());
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	
    	return res;
    }
    
    //Metodo para realizar una actualizacion en la base de datos
    public int update(String SQL) throws SQLException,Exception{
    	
    	conectar(Login.getDireccion());
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close();
    	desconectar();

    	return res;
    }
    
    
	public ResultSet select(String SQL) throws SQLException,Exception{
			
		conectar(Login.getDireccion());
		
		//se crea la sentencia SQL
		Statement sentencia = mBD.createStatement();
		
		//se ejecuta la sentencia y se recoge el resultado
		ResultSet resultado= sentencia.executeQuery(SQL);
		
		
		
		//finaliza la sentencia
		sentencia.close();
		
		//cierra la conexion
		desconectar();

		return resultado;
	}
	
	public ResultSet selectOne(String SQL) throws SQLException,Exception{
		
		conectar(Login.getDireccion());
		
		//se crea la sentencia SQL
		Statement sentencia = mBD.createStatement();
		
		//se ejecuta la sentencia y se recoge el resultado
		ResultSet resultado= sentencia.executeQuery(SQL);
		
		
		
		//finaliza la sentencia
		sentencia.close();
		
		//cierra la conexion
		desconectar();

		return resultado;
	}
	
	

}
