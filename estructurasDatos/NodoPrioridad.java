package estructurasDatos;

public class NodoPrioridad <T> {
	private T dato;	
	private NodoPrioridad <T>  siguiente;
	private int prioridad; //1 prioridad mayor, 3 prioridad menor
	
	public NodoPrioridad(){
		this.dato=null;
		this.siguiente=null;
	}
	
	public NodoPrioridad(T dato,int prioridad){
		this.dato=dato;
		this.prioridad=prioridad;
		this.siguiente=null;
		
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public NodoPrioridad<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoPrioridad<T> siguiente) {
		this.siguiente = siguiente;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	
	

}
