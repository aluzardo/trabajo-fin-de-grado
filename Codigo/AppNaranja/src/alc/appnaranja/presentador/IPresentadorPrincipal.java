package alc.appnaranja.presentador;

import android.app.Activity;

public interface IPresentadorPrincipal {

	/**
	 * Lanza la actividad Donde Estamos de la aplicaci�n, donde se puede ver la ubicaci�n de las distintas peluquer�as.
	 */
	public void lanzarDondeEstamos();
	
	/**
	 * Lanza la actividad Pedir Cita de la aplicaci�n, donde se puede pedir cita.
	 */
	public void lanzarPedirCita();
	
	/**
	 * Lanza la actividad Mis Citas de la aplicaci�n, donde se pueden ver las citas que el usuario ha pedido.
	 */
	public void lanzarMisCitas();
	
	/**
	 * Lanza la actividad Ayuda de la aplicaci�n, donde se proporciona ayuda para el uso de la aplicaci�n.
	 */
	public void lanzarAyuda();
	
	/**
	 * Lanza la actividad Info de la aplicaci�n, donde se proporciona informaci�n de la aplicaci�n (versi�n, creadores...)
	 */
	public void lanzarInfo();
	
	/**
	 * Lanza la actividad Presentaci�n de la aplicaci�n, donde se proporciona una presentaci�n de la empresa.
	 */
	public void lanzarPresentacion();
	
	/**
	 * Lanza la actividad Configuraci�n de la aplicaci�n, donde se puede cambiar la configuracion de la aplicaci�n.
	 */
	public void lanzarConfiguracion();
	
	/**
	 * Lanza el navegador del m�vil con una url espec�fica.
	 * @param url URL de la p�gina a la que se acceder�
	 * @param a Actividad que lanza dicha url
	 */
	public void lanzarURL(String url, Activity a);
	
	/**
	 * Actualiza las preferencias por las seleccionadas por el usuario.
	 */
	public void actualizaPreferencias();
}
