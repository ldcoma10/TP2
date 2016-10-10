package ordenamiento;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

import estructurasDatos.ListaSimple;
import estructurasDatos.Nodo;

public class Ordenamiento {
	public ListaSimple<String> quicksort(ListaSimple <String> lista){
		return quicksortAux(0,lista.tamano()-1,lista);
	}
	public ListaSimple<String> quicksortAux(int indexMenor, int indexMayor,ListaSimple <String>lista){
		if (lista.esVacia()||indexMenor>=indexMayor){
			return null;
		}
		//Se escoge el indice del medio y se busca el pivote
		int mitad=indexMenor+(indexMayor-indexMenor)/2;
		Nodo<String> pivote=lista.buscar(mitad);
		
		//Se empieza a buscar 
		int i=indexMenor;
		int j=indexMayor;
		
		
		for(;i<=j;){
			for(;pivote.getDato().compareToIgnoreCase(lista.buscar(i).getDato())>0;i++){				
			}
			for(;lista.buscar(j).getDato().compareToIgnoreCase(pivote.getDato())>0;j--){				
			}
			if (i<=j){
				String datoAux=lista.buscar(i).getDato();
				lista.modificarPosicion(i,lista.buscar(j).getDato());
				lista.modificarPosicion(j,datoAux);
				i++;
				j--;
			}
		}
		
		//Se divide la lista en 2
		if (indexMenor < j)
			quicksortAux(indexMenor, j, lista);
	 
		if (indexMayor > i)
			quicksortAux(i, indexMayor,lista);
		return lista;
		}
	   
	public ListaSimple <String> radixSort( ListaSimple <String> lista, int palabraMasLarga )
    {
        
        
        ListaSimple<ListaSimple<String>>listaSegunTamaño=new ListaSimple<ListaSimple<String>>();
        listaSegunTamaño.hacerArreglo(palabraMasLarga+1, null);
        ListaSimple<ListaSimple<String>>listaLetraSeparadas=new ListaSimple<ListaSimple<String>>();
        listaLetraSeparadas.hacerArreglo(256, null);
        
        
        for( int i = 0; i < palabraMasLarga+1; i++ )
        	listaSegunTamaño.modificarPosicion(i,new ListaSimple<String>()) ;
        
        for( int i = 0; i < 256; i++ )
        	listaLetraSeparadas.modificarPosicion(i, new ListaSimple<>( ));
            
        //Loop para insertar cada una de las palabras en la  lista  cada nodo
        Nodo <String>aux=lista.getInicio();
        for(;aux!=null;aux=aux.getSiguiente()){
        	listaSegunTamaño.buscar(aux.getDato().length()).getDato().insertarFinal(aux.getDato());
        	}
            
       //Loop para insertar cada una de las palabras 
        int idx = 0;
        Nodo<ListaSimple<String>>auxiliar=listaSegunTamaño.getInicio();
        for( ;auxiliar!=null;auxiliar=auxiliar.getSiguiente() ){
        	Nodo<String>aux2=auxiliar.getDato().getInicio();
            for(;aux2!=null;aux2=aux2.getSiguiente()){
                lista.modificarPosicion(idx++, aux2.getDato());
                }
            }
            
        
        int startingIndex = lista.tamano();    
        for( int pos = palabraMasLarga - 1; pos >= 0; pos-- )
        {
            startingIndex -= listaSegunTamaño.buscar(pos + 1).getDato().tamano( );
            
            
            //Se guarda listaLetraSeparadas cada letra del nombre junto al nombre perteneciente
            for( int i = startingIndex; i < lista.tamano(); i++ ){
            	listaLetraSeparadas.buscar(lista.buscar(i).getDato().charAt(pos)).getDato().insertarFinal(lista.buscar(i).getDato());
            	}
                
            
            idx = startingIndex;
            Nodo<ListaSimple<String>>auxiliar2=listaLetraSeparadas.getInicio();
            for( ;auxiliar2!=null;auxiliar2=auxiliar2.getSiguiente() )
            {
            	Nodo<String>aux1=auxiliar2.getDato().getInicio();
                for(;aux1!=null;aux1=aux1.getSiguiente() ){
                    lista.modificarPosicion(idx++, aux1.getDato());
                    }
                
                auxiliar2.getDato().setInicio(null);
            }
        }
        return lista;
        
    }
	
	
	public ListaSimple<String> shellSort(ListaSimple<String> lista){
		
	    int mayor=1;
	    for(;mayor<= lista.tamano()/3; mayor = 3*mayor + 1){
	          
	    }
	    for(;mayor>0;mayor = (mayor-1)/3){    

	       for(int i=0; i<lista.tamano(); i++){ 

	            String temp = lista.buscar(i).getDato(); 
	            int j;              

	            for(j=i; j>mayor-1 && lista.buscar(j-mayor).getDato().compareToIgnoreCase(temp) >= 0; j=j-mayor){
	            	lista.modificarPosicion(j,lista.buscar(j-mayor).getDato());                  
	            }
	            lista.modificarPosicion(j,temp);
	        }
	         
	    }
	    
	  return lista;
	}
	
	public ListaSimple<String> bubbleSort(ListaSimple<String> lista){
		String aux;
        for(int i=0; i < lista.tamano()-1; i++){ 
            for(int j=1; j < lista.tamano()-i; j++){
                if(lista.buscar(j-1).getDato().compareToIgnoreCase(lista.buscar(j).getDato()) > 0){
                    aux=lista.buscar(j-1).getDato();
                    lista.modificarPosicion(j-1,lista.buscar(j));
                    lista.modificarPosicion(j, aux);
                }
            }            
        }
        return lista;		
	}
	
	public ListaSimple<String> insertionSort(ListaSimple<String>lista){
		String aux;
        for (int i = 1; i < lista.tamano(); i++) {
            for(int j = i ; j > 0 ; j--){
                if(lista.buscar(j-1).getDato().compareToIgnoreCase(lista.buscar(j).getDato())>0){
                    aux = lista.buscar(j).getDato();
                    lista.modificarPosicion(j, lista.buscar(j-1).getDato());
                    lista.modificarPosicion(j-1,aux);
                    
                }
            }
        }
        return lista;
		
	}
	
	

}
