package estructurasDatos;



import ordenamiento.Ordenamiento;

public class Launcher {

	public static void main(String[] args) {
		Integer palabra1=3;
		Integer palabra2=5;
		//palabra1 > palabra2 /Z es mayor que A
		System.out.println(palabra1.compareTo(palabra2));
		
		
		
		//Hi >m
		// TODO Auto-generated method stub
		
		ListaSimple <String> ls=new ListaSimple<String>();
		
		ls.insertarFinal("Adri");		
		
		ls.insertarInicio("Luis");		
		
		ls.insertarInicio("Grace");		
		
		ls.insertarInicio("Hernan");
		
		ls.insertarFinal("Adriana");
		ls.insertarPosicion("Zara",3);
		ls.imprimir();
		Ordenamiento qs=new Ordenamiento();
		//qs.quicksort(ls).imprimir();
		
		
		qs.radixSort(ls,7).imprimir();
		//qs.shellSort(ls).imprimir();
		//qs.bubbleSort(ls).imprimir();
		//qs.insertionSort(ls).imprimir();
		/*
		ls.eliminar(4);
		
		ls.modificarPosicion(0,5);		
		
		/*
		Pila <Integer>ls=new Pila<Integer>();
		ls.push(1);		
		
		ls.push(4);		
		
		ls.push(3);		
		
		ls.push(2);
		
		ls.push(1);
		ls.imprimir();
		
		
		ls.moverHaciaAdentro(4);
		ls.imprimir();
		ls.moverHaciaAdentro(4);
		ls.imprimir();
		ls.moverHaciaAfuera(4);
		ls.moverHaciaAfuera(4);
		ls.moverHaciaAdentro(4);
		ls.imprimir();
		ls.imprimir();
		
		*/
		
		
		
		
		
		
	}

}
