package ArabeUnido;

public abstract class Equipo implements Integrante {

	   private String nombre;
	   private String identificacion;
	   private String apellido;
	   private int edad;
	   
	   public void viajar(){
		   System.out.println("El personaje del equipo viaja");
	   }
		
		public void concentrase(){
			System.out.println("El personaje esta concentrado");
		}
		 
		public void jugarPartidos(){
			System.out.println("El personaje Juega el partido");
		}
		
		public void entrenar(){
			System.out.println("el personaje entrena");
		}
	   
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	   
	}
