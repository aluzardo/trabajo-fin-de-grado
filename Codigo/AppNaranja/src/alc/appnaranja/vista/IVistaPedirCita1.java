package alc.appnaranja.vista;


public interface IVistaPedirCita1 {
	
	/**
	 * Obtiene el nombre introducido por el usuario en el campo nombre
	 * @return Nombre introducido por el usuario
	 */
	public String getTextoNombre();
	
	/**
	 * Obtiene el telefono introducido por el usuario en el campo telefono
	 * @return Telefono introducido por el usuario
	 */
	public String getTextoTelefono();
	
	/**
	 * Obtiene el estado del bot�n Hombre de la vista
	 * @return Estado del bot�n Hombre
	 */
	public boolean getEstadoBotonHombre();
	
	/**
	 * Obtiene el estado del bot�n Mujer de la vista
	 * @return Estado del bot�n Mujer
	 */
	public boolean getEstadoBotonMujer();
	
	/**
	 * Actualiza la lista de peluquer�as de la vista
	 * @param lista Listado de peluquer�as que se muestra en la vista.
	 */
	public void setListaPeluquerias(Object lista);
	
	/**
	 * Obtiene la peluquer�a que ha seleccionado el usuario en la vista
	 * @return Nombre de la peluquer�a seleccionada por el usuario
	 */
	public String getPeluqueriaSeleccionada();
	
	/**
	 * Muestra una alerta si ha habido alg�n error.
	 * @param titulo T�tulo de la alerta.
	 */
	public void mostrarAlerta(String titulo);
	
	/**
	 * Muestra una barra de progreso para indicar que se est� haciendo alguna operaci�n con la nube.
	 * @param mensaje mensaje que se muestra mientras se carga
	 */
	public void mostrarProgreso(String mensaje);
	
	/**
	 * Elimina la barra de progreso.
	 */
	public void eliminarProgreso();

}
