package restaurante;

import estructurasDatos.ListaSimple;
import inventario.Producto;

public class Platillo {
	private String nombre;
	private ListaSimple<Producto> listaIngredientes;
	private String informacionNutricional;
	private int precio;
	private int minutos;
	private ListaSimple <Receta> listaRecetas;
	private String informacionAdicional;

}
