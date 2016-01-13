package alc.appnaranja.vista;


public interface IVistaPedirCita3 {
	/**
	 * Actulaiza los d�as disponibles en la vista
	 * @param dias Dias disponibles
	 */
	public void setDiasDisponibles(Object dias);
	
	/**
	 * Actualiza las horas disponibles en la vista
	 * @param horas Horas disponibles en la vista
	 */
	public void setHorasDisponibles(Object horas);
	
	/**
	 * Obtiene el d�a seleccionado por el usuario en la vista
	 * @return D�a seleccionado en la vista
	 */
	public String getDia();
	
	/**
	 * Obtiene la hora seleccionada en la vista
	 * @return Hora seleccionada en la vita
	 */
	public String getHora();
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
