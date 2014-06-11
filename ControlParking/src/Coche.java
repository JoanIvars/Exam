
public class Coche {
	private int id;
	private String matricula;
	private int horaentrada;
	private int precio;
	private String observaciones;
	private int horasalida;

	
	public Coche() {
		id=0;
		matricula="";
		horaentrada=0;
		horasalida=0;
		precio=0;
		observaciones="";
		
	}
	public Coche(String Matricula, int HoraEntrada,int HoraSalida, String Observaciones,int Precio) {
		matricula=Matricula;
		horaentrada=HoraEntrada;
		horasalida=HoraSalida;
		observaciones=Observaciones;
		precio=Precio;
	}

	public void setMatricula(String CojeMatricula) {
		matricula=CojeMatricula;
	}
	public String getMatricula() {
		return matricula;
	}
	public void sethoraentrada(int Cojehoraentrada) {
		horaentrada=Cojehoraentrada;
	}
	public int gethoraentrada() {
		return horaentrada;
	}
	public void sethorasalida(int Cojehorasalida) {
		horasalida=Cojehorasalida;
	}
	public int gethorasalida() {
		return horasalida;
	}
	public void setobservaciones(String Cojeobservaciones) {
		observaciones=Cojeobservaciones;
	}
	public String getobservaciones() {
		return observaciones;
	}
	public void setprecio(int Cojeprecio) {
		precio=Cojeprecio;
	}
	public int getprecio() {
		return precio;
	}
	public void setId(int Id) {
		id=Id;
	}
	public int getId() {
		return id;
	}
	
	public String toString(){
		return matricula;
	}
}
