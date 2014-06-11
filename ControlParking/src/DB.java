import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



import java.sql.Statement;

import javax.swing.JComboBox;

public class DB {
	Connection conexion = null; //maneja la conexión
	Statement instruccion = null;// instrucción de consulta
	ResultSet conjuntoResultados = null;// maneja los resultados
	private JComboBox<Coche> listadoCoche;

	public DB(JComboBox listadoCoche) {
		// TODO Auto-generated constructor stub
		crearconexion();
		this.listadoCoche=listadoCoche;
	}
	public void crearconexion() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			// establece la conexión a la base de datos
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/parking","root","tonphp");
			
			}
		catch( SQLException excepcionSql ){
				excepcionSql.printStackTrace();
			}// fin de catch
			
		catch( ClassNotFoundException noEncontroClase )
			{
				noEncontroClase.printStackTrace();
			}
			// fin de catch
	}
	
	public void leerCoches(){
		try{
			// crea objeto Statement para consultar la base de datos
			instruccion = (Statement) conexion.createStatement();
			// consulta la base de datos
			conjuntoResultados = instruccion.executeQuery("SELECT * FROM controlcoches");
			//Mostrar por pantalla
			
			while (conjuntoResultados.next())
			{
				System.out.println("id="+conjuntoResultados.getObject("id")+
					      ", Nombre="+conjuntoResultados.getObject("matricula"));
				Coche del=new Coche((String)conjuntoResultados.getObject("matricula"),
							   							(int)conjuntoResultados.getObject("horaentrada"),
							   							(int)conjuntoResultados.getObject("horasalida"),
							   							(String)conjuntoResultados.getObject("observaciones"),
							   							(int)conjuntoResultados.getObject("precio"));
					   			
					   
					   listadoCoche.addItem(del);
			}
			conjuntoResultados.close();}
			
			catch( SQLException excepcionSql ){
				excepcionSql.printStackTrace();}
				}	
}	


