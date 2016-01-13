package alc.appnaranja.modelo;


import java.util.ArrayList;

import com.google.android.gms.maps.model.LatLng;

import android.graphics.Bitmap;


public interface IModelo {
	/**
	 * Obtiene la lista de peluquer�as
	 */
	public void obtenerListaPeluquerias();
	
	/**
	 * Obtiene la descripci�n de la peluquer�a
	 * @param id_peluqueria Identificador de la peluquer�a
	 * @return Descripci�n de la peluquer�a
	 */
	public String obtenerDescripcionPeluqueria(String id_peluqueria);
	
	/**
	 * Obtiene la imagen de la peluquer�a
	 * @param id_peluqueria Identificador de la peluquer�a
	 * @return Imagen de la peluquer�a.
	 */
	public Bitmap obtenerImagenPeluqueria(String id_peluqueria);
	
	/**
	 * Obtiene la ubicaci�n geogr�fica de la peluquer�a.
	 * @param id_peluqueria Identificador de la peluquer�a.
	 * @return Posici�n geogr�fica de la peluquer�a.
	 */
	public LatLng posicionPeluqueria(String id_peluqueria);
	
	/**
	 * Obtiene la ubicaci�n geogr�fica de todas las peluquer�as.
	 * @return Todas las posiciones geogr�ficas de las peluquer�as.
	 */
	public ArrayList<LatLng> posicionTodasPeluquerias();
	
	/**
	 * Guarda en el modelo los datos introducidos por el usuario.
	 * @param nombre Nombre del usuario.
	 * @param telefono Tel�fono del usuario, utilizado como identificador del mismo.
	 * @param sexo Sexo del usuario.
	 * @param peluqueria Peluquer�a elegida por el usuario.
	 */
	public void guardarDatos(String nombre, String telefono, String sexo, String peluqueria);
	
	/**
	 * Obtiene los servicios
	 */
	public void obtenerServicios();
	
	/**
	 * Calcula el precio total segun los servicios.
	 * @param servicios Listado de servicios.
	 * @return Precio de los servicios seleccionados.
	 */
	public String calculaPrecioTotal(ArrayList<String> servicios);
	
	/**
	 * Guarda los datos introducidos por el usuario.
	 * @param servicios Listado de servicios introducidos por el usuario.
	 */
	public void guardarDatos(ArrayList<String> servicios);
	
	
	/**
	 * Obtiene las fechas disponibles para pedir cita.
	 * @return Fechas disponibles para pedir cita.
	 */
	public ArrayList<String> obtenerFechas(String id_peluqueria);
	

	/**
	 * Obtiene las horas disponibles para una fecha determinada.
	 * @param fecha Fecha para buscar las horas.
	 * @return Listado con todas las horas disponibles.
	 */
	public ArrayList<String> obtenerHoras(String fecha);
	
	/**
	 * Guarda los datos introducidos por el usuario.
	 * @param fecha Fecha seleccionada por el usuario
	 * @param hora Hora seleccionada por el usuario.
	 */
	public void guardarDatos(String fecha, String hora);
	
	/**
	 * Obtiene infomaci�n de la cita que ha ido introduciendo el usuario en la aplicaci�n.
	 */
	public String obtenerInfoCita();
	
	/**
	 * Confirma la cita que introdujo el usuario en la aplicaci�n y la envia a la base de datos externa.
	 * @return Informaci�n de la cita.
	 */
	public void confirmarCita();
	
	/**
	 * Obtiene el listado de citas que ha pedido el usuario a trav�s de la aplicaci�n.
	 * @param id_usuario Identificador del usuario.
	 * @return Listado con las citas.
	 */
	public void obtenerListaCitas(String id_usuario);
	
	/**
	 * Obtiene informaci�n de una cita con su identificador.
	 * @param id_cita Identificador de la cita.
	 */
	public void obtenerInfoCita(String id_cita);
	
	/**
	 * Cancela una cita que ha pedido el usuario y la borra de la base de datos externa.
	 * @return Retorna verdadero si se cancela con �xito o falso en caso contrario.
	 */
	public void cancelarCita();
	
	//A�adidos 
	
	/**
	 * Guarda la cita seleccionada en MisCitasMaestro
	 * @param id_cita Identificador de la cita
	 */
	public void setCitaSeleccionada(String id_cita);
	
	/**
	 * Obtiene la cita seleccionada en MisCitasMaestro
	 * @return id_cita Identificador de la cita
	 */
	public String getCitaSeleccionada();
	
	/**
	 * Guarda la peluqueria seleccionada en DondeEstamos
	 * @param id_peluqueria Identificador de la peluqueria
	 */
	public void setPeluqueriaSeleccionada(String id_peluqueria);
	
	/**
	 * Obtiene la peluqueria seleccionada en DondeEstamos
	 * @return id_peluqueria Identificador de la peluqueria
	 */
	public String getPeluqueriaSeleccionada();
	
	/**
	 * Guarda el telefono del usuario
	 * @param telefono Tel�fono del usuario utilizado como identificador
	 */
	public void setTelefono(String telefono);
	/**
	 * Obtiene el telefono del usuario
	 * @return telefono Tel�fono del usuario utilizado como identificador
	 */
	public String getTelefono();
	
	/**
	 * Obtiene del servidor externo los datos de todas las peluquerias
	 */
	public void obtenerDatosPeluquerias();
	
	
}
