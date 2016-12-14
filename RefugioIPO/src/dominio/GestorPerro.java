package dominio;
import java.sql.ResultSet;
import java.util.Vector;

import persistencia.Agente;
import presentacion.Login;

public class GestorPerro {
	
	
	
	public void insertar(Perro p) throws Exception{
		
		String SQL_insert= "INSERT INTO Perros (Nombre, Sexo, Raza, Edad, Chip, NumeroChip, Enfermedad, TipoDeEnfermedad, Vacunado, SociableGatos,SociableNiños, SociablePerros, Estado, Foto)"+" VALUES ('"+p.getNombre()+"','"+p.getSexo()+"','"+p.getRaza()+"','"+p.getEdad()+"','"+p.isChip()+"','"+p.getNumeroChip()+"','"+p.isEnfermedad()+"','"+p.getTipoEnfermedad()+"','"+p.isVacunado()+"','"+p.isSociableGatos()+"','"+p.isSociableNiños()+"','"+p.isSociablePerros()+"','"+p.getEstado()+"','"+p.getFoto().toString()+"');";
		
		Agente ag= Agente.getAgente(Login.getDireccion());
		
		ag.insert(SQL_insert);
		
	}
	
	
	public void update(String id, Perro p) throws Exception{
		
		//se crea el insert
		String SQL_update="UPDATE Perros SET Nombre='"+p.getNombre()+"', Sexo='"+p.getSexo()+"', Raza='"+p.getRaza()+"', Edad='"+p.getEdad()+"', Chip='"+p.isChip()+"', NumeroChip='"+p.getNumeroChip()+"', Enfermedad='"+p.isEnfermedad()+"', TipoDeEnfermedad='"+p.getTipoEnfermedad()+"', Vacunado='"+p.isVacunado()+"', SociableGatos='"+p.isSociableGatos()+"', SociableNiños='"+p.isSociableNiños()+"', SociablePerros='"+p.isSociablePerros()+"', Estado='"+p.getEstado()+"', Foto='"+p.getFoto()+"' WHERE Id='"+id+"';";                                                            
		
		//se crea un objeto agente
		Agente a = Agente.getAgente(Login.getDireccion());
		//se utiliza el objeto agente para hacer el insert y se recoge el resultado
		a.update(SQL_update);
		
		
	}

	public String [] read(String raza, String sexo) throws Exception{
		
		
		String SQL_Consulta = "SELECT Id, Nombre FROM Perros WHERE Raza = '"+raza+"' AND Sexo = '"+sexo+"';";
		
		Agente a = Agente.getAgente(Login.getDireccion());
		ResultSet resultado = a.select(SQL_Consulta);
		
		//vectores auxiliares
		Vector<Object> aux = new Vector<Object>();
				
				
		//se recorre el resultSet con los resultados y se almacena en un vector de vectores
		while(resultado.next()){
			Vector<Object> vec= new Vector<Object>();
			vec.addElement(resultado.getString("Id"));
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
	
	
	public String [] readDisponible(String disp) throws Exception{
		
		
		String SQL_Consulta = "SELECT Nombre FROM Perros WHERE Estado= '"+disp+"';";
		
		Agente a = Agente.getAgente(Login.getDireccion());
		ResultSet resultado = a.select(SQL_Consulta);
		
		//vectores auxiliares
		Vector<Object> aux = new Vector<Object>();
				
				
		//se recorre el resultSet con los resultados y se almacena en un vector de vectores
		while(resultado.next()){
			Vector<Object> vec= new Vector<Object>();
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
	
	public Perro readOne(String id) throws Exception{
		
		
		
		String SQL_Consulta = "SELECT Nombre, Sexo, Raza, Edad, Chip, NumeroChip, Enfermedad, TipoDeEnfermedad, Vacunado, SociableGatos,SociableNiños, SociablePerros, Estado, Foto FROM Perros WHERE Id = '"+id+"';";
		
		Agente a = Agente.getAgente(Login.getDireccion());
		ResultSet resultado = a.selectOne(SQL_Consulta);
		
		Vector<Object> aux= new Vector<Object>();
		
		//se recorre el resultSet con los resultados y se almacena en un vector de vectores
		while(resultado.next()){

			aux.addElement(resultado.getString("Nombre"));
			aux.addElement(resultado.getString("Sexo"));
			aux.addElement(resultado.getString("Raza"));
			aux.addElement(resultado.getString("Edad"));
			aux.addElement(resultado.getString("Chip"));
			aux.addElement(resultado.getString("NumeroChip"));
			aux.addElement(resultado.getString("Enfermedad"));
			aux.addElement(resultado.getString("TipoDeEnfermedad"));
			aux.addElement(resultado.getString("Vacunado"));
			aux.addElement(resultado.getString("SociableGatos"));
			aux.addElement(resultado.getString("SociableNiños"));
			aux.addElement(resultado.getString("SociablePerros"));
			aux.addElement(resultado.getString("Estado"));
			aux.addElement(resultado.getString("Foto"));
			
		}
		
		boolean b1=Boolean.parseBoolean(aux.elementAt(4).toString());
		boolean b2=Boolean.parseBoolean(aux.elementAt(6).toString());
		boolean b3=Boolean.parseBoolean(aux.elementAt(8).toString());
		boolean b4=Boolean.parseBoolean(aux.elementAt(9).toString());
		boolean b5=Boolean.parseBoolean(aux.elementAt(10).toString());
		boolean b6=Boolean.parseBoolean(aux.elementAt(11).toString());
		
		Perro p1 = new Perro(aux.elementAt(0).toString(),aux.elementAt(1).toString(),aux.elementAt(2).toString(),aux.elementAt(3).toString(), b3 , b1, b2, b6, b4, b5, aux.elementAt(5).toString(), aux.elementAt(7).toString(),aux.elementAt(12).toString(),aux.elementAt(13).toString());
		
		return p1;
	}

	
	public void delete(String id) throws Exception{
		
		//se crea el insert
		String SQL_delete="DELETE * FROM Perros WHERE Id = '"+id+"';";
		//se crea un objeto agente
		Agente a = Agente.getAgente(Login.getDireccion());
		//se utiliza el objeto agente para hacer el insert y se recoge el resultado
		a.delete(SQL_delete);
	
		
	}


	

}
