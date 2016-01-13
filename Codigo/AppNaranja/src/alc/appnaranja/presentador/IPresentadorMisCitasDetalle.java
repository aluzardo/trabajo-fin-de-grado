package alc.appnaranja.presentador;

public interface IPresentadorMisCitasDetalle {

	/**
	 * Se realizan todas las operaciones necesarias para mostrar la VistaMisCitasDetalle.
	 */
	public void mostrarVistaMisCitasDetalle();
	
	/**
	 * Carga del modelo la informaci�n de la cita
	 */
	public void cargarInfoCita();
	
	/**
	 * Presenta la informaci�n de la cita en la vista.
	 */
	public void presentarInfoCita();
	
	/**
	 * Cancela la cita y la borra del modelo
	 */
	public void cancelarCita();
	
	/**
	 * Lanza la actividad MisCitasMaestro de la aplicaci�n, donde le aparece al usuario un listado con las citas que ha pedido.
	 */
	public void lanzarMisCitasMaestro();
}


