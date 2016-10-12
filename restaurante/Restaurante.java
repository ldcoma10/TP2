package restaurante;

import estructurasDatos.ColaPrioridad;
import estructurasDatos.ListaSimple;

public class Restaurante {
	private ListaSimple<Platillo> menu;
	private ColaPrioridad<Orden> ordenes;
	private int calificacion;
	private ListaSimple<String> comentario;

}
