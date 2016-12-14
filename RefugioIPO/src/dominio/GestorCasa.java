package dominio;
import java.sql.ResultSet;
import java.util.Vector;

import persistencia.Agente;
import presentacion.Login;

public class GestorCasa {
	
	
	
	public void insertar(Casa a) throws Exception{
		
		String SQL_insert= "INSERT INTO Acogedores (Dni, Nombre, Apellidos, FechaNacimiento, Telefono, Direccion, Ciudad, Provincia, Correo, Profesion, OtrosAnimales, TipoVivienda, LugarDormir, Mascota)"+" VALUES ('"+a.getDni()+"','"+a.getNombre()+"','"+a.getApellidos()+"','"+a.getNacimiento()+"','"+a.getTelefono()+"','"+a.getDireccion()+"','"+a.getCiudad()+"','"+a.getProvincia()+"','"+a.getCorreo()+"','"+a.getProfesion()+"','"+a.getOtrosAnimales()+"','"+a.getTipoVivienda()+"','"+a.getLugarDormir()+"', '"+a.getMascota()+"');";
		
		Agente ag= Agente.getAgente(Login.getDireccion());
		
		ag.insert(SQL_insert);
		
	}
	
	
	public void update(String dni, Casa ac) throws Exception{
		
		//se crea el insert
		String SQL_update="UPDATE Acogedores SET Dni='"+ac.getDni()+"', Nombre='"+ac.getNombre()+"', Apellidos='"+ac.getApellidos()+"', FechaNacimiento='"+ac.getNacimiento()+"', Telefono='"+ac.getTelefono()+"', Direccion='"+ac.getDireccion()+"', Ciudad='"+ac.getCiudad()+"', Provincia='"+ac.getProvincia()+"', Correo='"+ac.getCorreo()+"', Profesion='"+ac.getProfesion()+"', OtrosAnimales='"+ac.getOtrosAnimales()+"', TipoVivienda='"+ac.getTipoVivienda()+"', LugarDormir='"+ac.getLugarDormir()+"' WHERE Dni='"+dni+"';";                                                            
		
		//se crea un objeto agente
		Agente a = Agente.getAgente(Login.getDireccion());
		//se utiliza el objeto agente para hacer el insert y se recoge el resultado
		a.update(SQL_update);
		
		
	}

	public String [] read() throws Exception{
		
		
		String SQL_Consulta = "SELECT Dni, Nombre FROM Acogedores";
		
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
	
	public Casa readOne(String dni) throws Exception{
		
		
		
		String SQL_Consulta = "SELECT  Dni, Nombre, Apellidos, FechaNacimiento, Telefono, Direccion, Ciudad, Provincia, Correo, Profesion, OtrosAnimales, TipoVivienda, LugarDormir, Mascota FROM Acogedores WHERE Dni = '"+dni+"';";
		
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
			aux.addElement(resultado.getString("Profesion"));
			aux.addElement(resultado.getString("OtrosAnimales"));
			aux.addElement(resultado.getString("TipoVivienda"));
			aux.addElement(resultado.getString("LugarDormir"));
			aux.addElement(resultado.getString("Mascota"));
			
		}
		
		
		
		Casa acog = new Casa(aux.elementAt(0).toString(),aux.elementAt(1).toString(),aux.elementAt(2).toString(),aux.elementAt(3).toString(), aux.elementAt(4).toString(),aux.elementAt(5).toString(),aux.elementAt(6).toString(),aux.elementAt(7).toString(), aux.elementAt(8).toString(),aux.elementAt(9).toString(),aux.elementAt(10).toString(),aux.elementAt(11).toString(), aux.elementAt(12).toString(), aux.elementAt(13).toString());
		
		return acog;
	}

	

	
	public void delete(String dni) throws Exception{
		
		//se crea el insert
		String SQL_delete="DELETE * FROM Acogedores WHERE Dni = '"+dni+"';";
		//se crea un objeto agente
		Agente a = Agente.getAgente(Login.getDireccion());
		//se utiliza el objeto agente para hacer el insert y se recoge el resultado
		a.delete(SQL_delete);
	
		
	}

}

