package dominio;
import java.sql.ResultSet;
import java.util.Vector;

import persistencia.Agente;
import presentacion.Login;

public class GestorVoluntario {
	
	
	
	public void insertar(Voluntario v) throws Exception{
		
		String SQL_insert= "INSERT INTO Voluntarios (Dni, Nombre, Apellidos, FechaNacimiento, Telefono, Direccion, Ciudad, Provincia, Correo, Foto)"+" VALUES ('"+v.getDni()+"','"+v.getNombre()+"','"+v.getApellidos()+"','"+v.getNacimiento()+"','"+v.getTelefono()+"','"+v.getDireccion()+"','"+v.getCiudad()+"','"+v.getProvincia()+"','"+v.getCorreo()+"','"+v.getFoto()+"');";
		
		Agente ag= Agente.getAgente(Login.getDireccion());
		
		ag.insert(SQL_insert);
		
	}
	
	
	public void update(String dni, Voluntario v) throws Exception{
		
		//se crea el insert
		String SQL_update="UPDATE Voluntarios SET Dni='"+v.getDni()+"', Nombre='"+v.getNombre()+"', Apellidos='"+v.getApellidos()+"', FechaNacimiento='"+v.getNacimiento()+"', Telefono='"+v.getTelefono()+"', Direccion='"+v.getDireccion()+"', Ciudad='"+v.getCiudad()+"', Provincia='"+v.getProvincia()+"', Correo='"+v.getCorreo()+"', Foto='"+v.getFoto()+"' WHERE Dni='"+dni+"';";                                                            
		
		//se crea un objeto agente
		Agente a = Agente.getAgente(Login.getDireccion());
		//se utiliza el objeto agente para hacer el insert y se recoge el resultado
		a.update(SQL_update);
		
		
	}

	public String [] read() throws Exception{
		
		
		String SQL_Consulta = "SELECT Dni, Nombre FROM Voluntarios";
		
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
	
	public Voluntario readOne(String dni) throws Exception{
		
		
		
		String SQL_Consulta = "SELECT  Dni, Nombre, Apellidos, FechaNacimiento, Telefono, Direccion, Ciudad, Provincia, Correo, Foto FROM Voluntarios WHERE Dni = '"+dni+"';";
		
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
			
			
		}
		
		
		
		Voluntario v = new Voluntario(aux.elementAt(0).toString(),aux.elementAt(1).toString(),aux.elementAt(2).toString(),aux.elementAt(3).toString(), aux.elementAt(4).toString(),aux.elementAt(5).toString(),aux.elementAt(6).toString(),aux.elementAt(7).toString(), aux.elementAt(8).toString(),aux.elementAt(9).toString());
		
		return v;
	}

	

	
	public void delete(String dni) throws Exception{
		
		//se crea el insert
		String SQL_delete="DELETE * FROM Voluntarios WHERE Dni = '"+dni+"';";
		//se crea un objeto agente
		Agente a = Agente.getAgente(Login.getDireccion());
		//se utiliza el objeto agente para hacer el insert y se recoge el resultado
		a.delete(SQL_delete);
	
		
	}

}