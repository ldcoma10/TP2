package restaurante;

import estructurasDatos.ListaSimple;
import usuario.Cheff;
import usuario.Cliente;

public class Orden {
	private Cliente cliente;
	private ListaSimple<Cheff> cheffsOrden;
	private Platillo platillo;
	private boolean completa;
	private String tipoOrden; //Si es Platino, Oro, Bronce
	
	public void mostrarProgresoOrden(){
		
	}
	public void enviarNotificacionCliente(){}
}


