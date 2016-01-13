package alc.appnaranja.presentador;

public interface IPresentadorMisCitasMaestro {

	/**
	 * Se realizan todas las operaciones necesarias para mostrar la VistaMisCitasMaestro.
	 */
	public void mostrarVistaMisCitasMaestro();
	
	/**
	 * Carga del modelo la lista con las citas que el usuario ha pedido a trav�s de la aplicaci�n.
	 */
	public void cargarListaCitas();
	
	/**
	 * Presenta en la vista la lista con el listado de citas que ha pedido el usuario.
	 */
	public void presentarListaCitas();
	
	/**
	 * Lanza la actividad MisCitasDetalle de la aplicaci�n, donde el usuario le aparece al usuario la informaci�n de la cita que ha seleccionado.
	 */
	public void lanzarMisCitasDetalle();	
	
	/**
	 * Lanza la actividad Principal de la aplicaci�n.
	 */
	public void lanzarPrincipal();	

}


