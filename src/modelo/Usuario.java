package modelo;

public abstract class Usuario {
	
	private String nombre;
	private String email;
	private String contrasena;
	private String fechaNaciemiento;
	private String nacionalidad;
	private int licenciaConduccion; // solo usuario?
	private String paisExpedicion; // solo usuario?
	private String fechaVencimientoLicencia; // solo usuario?
	private int telefonoContacto;
	private int numeroTarjetaCredito; //yo creo que esto deberia ser un atributo solo del cliente, por que el admin o el empleado no deberian incluir el numero de la tarjeta
}
