package alc.appnaranja.presentador;


public interface IPresentadorDondeEstamos {

	/**
	 * Se realizan todas las operaciones necesarias para mostrar la VistaDondeEstamos.
	 */
	public void mostrarVistaDondeEstamos();
	
	/**
	 * Carga del modelo la lista de peluquer�as.
	 */
	public void cargarListaPeluquerias();
	
	/**
	 * Presenta en la vista la lista de peluquer�as.
	 */
	public void presentarListaPeluquerias();
	
	/**
	 * Se cargan del modelo los datos de la peluquer�a seleccionada
	 */
	public void cargarDatosPeluqueria();
	
	/**
	 * Se presentan en la vista los datos de la peluquer�a (Imagen y descripci�n).
	 */
	public void presentarDatosPeluqueria();
	
	/**
	 * Lanza la actividad Mapa de la aplicaci�n, donde aparece un mapa con la posici�n de la peluquer�a.
	 */
	public void lanzarMapa();

}
