package alc.appnaranja.presentador;

public interface IPresentadorConfirmarCita {
	
	/**
	 * Se realizan todas las operaciones necesarias para mostrar la VistaConfirmarCita.
	 */
	public void mostrarVistaConfirmarCita();
	
	/**
	 * Se carga del modelo la informaci�n de la cita.
	 */
	public void cargarInfoCita();
	
	/**
	 * Se presenta en la vista la informaci�n de la cita.
	 */
	public void presentarInfoCita();
	
	/**
	 * Se introduce la cita en la base de datos externa y queda confirmada.
	 */
	public void confirmarCita();
	
	/**
	 * Lanza la actividad Principal de la aplicaci�n, donde el usuario puede acceder a todas las funciones de la aplicaci�n.
	 */
	public void lanzarPrincipal();

}
