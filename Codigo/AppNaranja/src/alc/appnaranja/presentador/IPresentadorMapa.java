package alc.appnaranja.presentador;

public interface IPresentadorMapa {
	
	/**
	 * Se realizan todas las operaciones necesarias para mostrar la VistaMapa.
	 */
	public void mostrarVistaMapa();
	
	/**
	 * Presenta en la vista el mapa
	 */
	public void presentarMapa();
	
	/**
	 * Presenta en la vista el mapa con todas las peluquer�as
	 */
	public void presentarMapaTodasPeluquerias();
	
	/**
	 * Presenta en la vista el mapa con la peluquer�a m�s cercana
	 */
	public void presentarMapaPeluqueriaCercana();
	
	
	

}
