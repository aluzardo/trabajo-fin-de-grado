package alc.appnaranja.presentador;


public interface IPresentadorPedirCita1 {
	
	/**
	 * Se realizan todas las operaciones necesarias para mostrar la VistaPedirCita1.
	 */
	public void mostrarVistaPedirCita1();
	
	/**
	 * Carga del modelo la lista de peluquer�as.
	 */
	public void cargarListaPeluquerias();
	
	/**
	 * Presenta en la vista la lista de peluquer�as.
	 */
	public void presentarListaPeluquerias();
	
	/**
	 * Guarda en el modelo los datos introducidos por el usuario.
	 */
	public void guardarDatos();
	
	/**
	 * Lanza la actividad PedirCita2 de la aplicaci�n, donde el usuario debe introducir los servicios que realizar� en la cita.
	 */
	public void lanzarPedirCita2();
	

}
