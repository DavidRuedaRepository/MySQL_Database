package es.ifp.programacion.ejercicio.retouf6;


/**
 * Clase Usuario que sirve para instanciar objetos de tipo Usuario a través de su constructor.
 */
public class Usuario {

	//Atributos
	private int id;
	private String nombre;
	private String apellidos;
	private String nombreUsuarios;
	private String password;



	//Connstructores

	/**
	 * Constructor con todos los parámetros
	 * @param id id del usuario
	 * @param nombre nombre del usuario
	 * @param apellidos apellidos del usuario
	 * @param DNI dni del usuario
	 * @param correo correo del usuario
	 * @param telefono teléfono del usuario
	 */
	public Usuario (int id, String nombre, String apellidos, String nombreUsuarios, String password){

		this.id=id;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.nombreUsuarios=nombreUsuarios;
		this.password=password;

	}


	//Métodos


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	/**
	 * @return the nombreUsuarios
	 */
	public String getNombreUsuarios() {
		return nombreUsuarios;
	}


	/**
	 * @param nombreUsuarios the nombreUsuarios to set
	 */
	public void setNombreUsuarios(String nombreUsuarios) {
		this.nombreUsuarios = nombreUsuarios;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * Método toString que sobreescribe y formatea los datos que nos devuelve la clase a través de sus métodos get.
	 */
	@Override
	public String toString () {

	
			return 
					"Nombre: " +getNombre()+"\n"
					+"Apellidos: " +getApellidos()+"\n"
					+"Nombre de Usuario:  " +getNombreUsuarios()+"\n"
					+"Password: " +getPassword()+"\n";

		

	}

}
