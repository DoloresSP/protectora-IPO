package dominio;
import java.sql.ResultSet;
import java.util.Vector;

import persistencia.Agente;
import presentacion.Login;

public class GestorSocio {
	
	
	
	public void insertar(Socio s) throws Exception{
		
		String SQL_insert= "INSERT INTO Socios (Dni, Nombre, Apellidos, FechaNacimiento, Telefono, Direccion, Ciudad, Provincia, Correo, Foto, Cuenta, Cantidad)"+" VALUES ('"+s.getDni()+"','"+s.getNombre()+"','"+s.getApellidos()+"','"+s.getNacimiento()+"','"+s.getTelefono()+"','"+s.getDireccion()+"','"+s.getCiudad()+"','"+s.getProvincia()+"','"+s.getCorreo()+"','"+s.getFoto()+"','"+s.getCuenta()+"','"+s.getCantidad()+"');";
		
		Agente ag= Agente.getAgente(Login.getDireccion());
		
		ag.insert(SQL_insert);
		
	}
	
	
	public void update(String dni, Socio socio) throws Exception{
		
		//se crea el insert
		String SQL_update="UPDATE Socios SET Dni='"+socio.getDni()+"', Nombre='"+socio.getNombre()+"', Apellidos='"+socio.getApellidos()+"', FechaNacimiento='"+socio.getNacimiento()+"', Telefono='"+socio.getTelefono()+"', Direccion='"+socio.getDireccion()+"', Ciudad='"+socio.getCiudad()+"', Provincia='"+socio.getProvincia()+"', Correo='"+socio.getCorreo()+"', Foto='"+socio.getFoto()+"', Cuenta='"+socio.getCuenta()+"',Cantidad='"+socio.getCantidad()+"' WHERE Dni='"+dni+"';";                                                            
		
		//se crea un objeto agente
		Agente a = Agente.getAgente(Login.getDireccion());
		//se utiliza el objeto agente para hacer el insert y se recoge el resultado
		a.update(SQL_update);
		
		
	}

	public String [] read() throws Exception{
		
		
		String SQL_Consulta = "SELECT Dni, Nombre FROM Socios";
		
		Agente a = Agente.getAgente(Login.getDireccion());
		ResultSet resultado = a.select(SQL_Consulta);
		
		//vectores auxiliares
		Vector<Object> aux = new Vector<Object>();
				
				
		//se recorre el resultSet con los resultados y se almacena en un vector de vectores
		while(resultado.next()){
			Vector<Object> vec= new Vector<Object>();
			vec.addElement(resultado.getString("Dni"));
			vec.addElement(resultado.getString("Nombre"));
			aux.addElement(vec);
		}
		
		String [] datos=new String[aux.size()];
		
		for(int i=0; i<aux.size(); i++){
			
			datos[i]= aux.elementAt(i).toString();
			//System.out.println(res.elementAt(i));
		}
		
		
		return datos;
	}
	
	public Socio readOne(String dni) throws Exception{
		
		
		
		String SQL_Consulta = "SELECT  Dni, Nombre, Apellidos, FechaNacimiento, Telefono, Direccion, Ciudad, Provincia, Correo, Foto, Cuenta, Cantidad FROM Socios WHERE Dni = '"+dni+"';";
		
		Agente a = Agente.getAgente(Login.getDireccion());
		ResultSet resultado = a.selectOne(SQL_Consulta);
		
		Vector<Object> aux= new Vector<Object>();
		
		//se recorre el resultSet con los resultados y se almacena en un vector de vectores
		while(resultado.next()){

			aux.addElement(resultado.getString("Dni"));
			aux.addElement(resultado.getString("Nombre"));
			aux.addElement(resultado.getString("Apellidos"));
			aux.addElement(resultado.getString("FechaNacimiento"));
			aux.addElement(resultado.getString("Telefono"));
			aux.addElement(resultado.getString("Direccion"));
			aux.addElement(resultado.getString("Ciudad"));
			aux.addElement(resultado.getString("Provincia"));
			aux.addElement(resultado.getString("Correo"));
			aux.addElement(resultado.getString("Foto"));
			aux.addElement(resultado.getString("Cuenta"));
			aux.addElement(resultado.getString("Cantidad"));
			
			
			
		}
		
		
		
		Socio v = new Socio(aux.elementAt(0).toString(),aux.elementAt(1).toString(),aux.elementAt(2).toString(),aux.elementAt(3).toString(), aux.elementAt(4).toString(),aux.elementAt(5).toString(),aux.elementAt(6).toString(),aux.elementAt(7).toString(), aux.elementAt(8).toString(),aux.elementAt(9).toString(),aux.elementAt(10).toString(),aux.elementAt(11).toString());
		
		return v;
	}

	

	
	public void delete(String dni) throws Exception{
		
		//se crea el insert
		String SQL_delete="DELETE * FROM Socios WHERE Dni = '"+dni+"';";
		//se crea un objeto agente
		Agente a = Agente.getAgente(Login.getDireccion());
		//se utiliza el objeto agente para hacer el insert y se recoge el resultado
		a.delete(SQL_delete);
	
		
	}

}

