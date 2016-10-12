package estructurasDatos;

public class ColaPrioridad <T> {
	private NodoPrioridad<T> inicio;	
	public NodoPrioridad<T> getInicio() {
		return inicio;
	}
	
	public boolean esVacia(){
		return inicio==null;
	}
	public void encolar (T dato, int prioridad){
		encolar (new NodoPrioridad<T>(dato,prioridad));
	}
	public void encolar(NodoPrioridad <T> nodo){
		if (esVacia()){
			inicio=nodo;
		}
		else{
			NodoPrioridad<T> aux=inicio;
			NodoPrioridad<T>auxAnterior=aux;
			
			while(aux!=null){
				
				if (aux.getPrioridad()>nodo.getPrioridad()){
					if (aux==auxAnterior){
						inicio=nodo;
						nodo.setSiguiente(aux);
						break;
					}
					auxAnterior.setSiguiente(nodo);
					nodo.setSiguiente(aux);
					break;
					
				}
				auxAnterior=aux;
				aux=aux.getSiguiente();					
			}
			if (aux==null){
				auxAnterior.setSiguiente(nodo);	}
			
			}
	}
	
	public void desencolar(){
		if (!esVacia()){
			inicio=inicio.getSiguiente();		
		}
		else{
			System.err.println("No se pudo eliminar, ya que la cola está vacía");
		}
	}
		
}
