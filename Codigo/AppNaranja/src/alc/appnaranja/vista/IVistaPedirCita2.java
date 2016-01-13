package alc.appnaranja.vista;


public interface IVistaPedirCita2 {
	
	/**
	 * Obtiene el estado del bot�n CorteDePelo de la vista
	 * @return Estado del bot�n CorteDePelo
	 */
	public boolean getEstadoCorteDePelo();
	
	/**
	 * Obtiene el estado del bot�n Manicura de la vista
	 * @return Estado del bot�n Manicura
	 */
	public boolean getEstadoManicura();
	
	/**
	 * Obtiene el estado del bot�n Pedicura de la vista
	 * @return Estado del bot�n Pedicura
	 */
	public boolean getEstadoPedicura();
	
	/**
	 * Obtiene el estado del bot�n Mechas de la vista
	 * @return Estado del bot�n Mechas
	 */
	public boolean getEstadoMechas();
	
	/**
	 * Obtiene el estado del bot�n Tinte de la vista
	 * @return Estado del bot�n Tinte
	 */
	public boolean getEstadoTinte();
	
	/**
	 * Obtiene el estado del bot�n CorteDeFlecos de la vista
	 * @return Estado del bot�n CorteDeFlecos
	 */
	public boolean getEstadoCorteDeFlecos();
	
	
	/**
	 * Actualiza el precio total en la vista
	 * @param precio Precio a actualizar en la vista
	 */
	public void setPrecioTotal(String precio);
	
	
	//a�adido nuevo
	
	/**
	 * Actualiza el precio del corte de pelo en la vista
	 * @param precio Precio a actualizar en la vista
	 */
	public void setPrecioCorteDePelo(String precio);
	
	/**
	 * Actualiza el precio de la manicura en la vista
	 * @param precio Precio a actualizar en la vista
	 */
	public void setPrecioManicura(String precio);
	
	/**
	 * Actualiza el precio de la pedicura en la vista
	 * @param precio Precio a actualizar en la vista
	 */
	public void setPrecioPedicura(String precio);
	
	/**
	 * Actualiza el precio de las mechas en la vista
	 * @param precio Precio a actualizar en la vista
	 */
	public void setPrecioMechas(String precio);
	
	/**
	 * Actualiza el precio del tinte en la vista
	 * @param precio Precio a actualizar en la vista
	 */
	public void setPrecioTinte(String precio);
	
	/**
	 * Actualiza el precio del corte de flecos en la vista
	 * @param precio Precio a actualizar en la vista
	 */
	public void setPrecioCorteDeFlecos(String precio);
	
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
