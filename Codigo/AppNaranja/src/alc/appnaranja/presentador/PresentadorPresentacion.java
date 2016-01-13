package alc.appnaranja.presentador;

import alc.appnaranja.AppMediador;

public class PresentadorPresentacion implements IPresentadorPresentacion {

	@Override
	public void mostrarVistaPresentacion() {
		AppMediador.getInstance().getVistaPresentacion().setTextoPresentacion("Desde que inauguramos nuestro primer sal�n Naranja en Lanzarote a principios de 2011 nos convertimos, autom�ticamente, en la peluquer�a unisex m�s econ�mica de Espa�a. Hoy, dos a�os despu�s, contamos con 6 salones distribuidos entre Las Palmas y Lanzarote y m�s de 35 empleados dispuestos a atenderle.");
	}

	
	

}
