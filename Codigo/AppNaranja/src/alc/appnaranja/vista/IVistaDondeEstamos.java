package alc.appnaranja.vista;


public interface IVistaDondeEstamos {
	
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
	 * Actualiza la imagen de la peluquer�a que aparece en la vista
	 * @param imagen Imagen de la peluquer�a
	 */
	public void setImagenPeluqueria(Object imagen);
	/**
	 * Actualiza el texto de la descripci�n de la peluquer�a
	 * @param texto Texto de la descripci�n de la peluquer�a
	 */
	public void setTextoDescripcionPeluqueria(String texto);
	
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
