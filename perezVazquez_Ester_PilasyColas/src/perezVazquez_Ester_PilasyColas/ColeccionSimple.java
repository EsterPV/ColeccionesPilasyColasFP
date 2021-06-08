package perezVazquez_Ester_PilasyColas;

import java.util.*;

public abstract class ColeccionSimple {

	

	public static void estaVacia(LinkedList<Object> vacia) {
		
		if (vacia.size()==0)
			System.out.println("La colecci�n est� vac�a");
		else
			System.out.println("La colecci�n contiene "+vacia.size()+" elementos");
	}
	
	abstract void annadir(Scanner teclado, LinkedList<Object> annadirDato);
	
	abstract void primero(LinkedList<Object> primer);
	
	abstract void extraer(LinkedList<Object> borrar);

	abstract void toString(LinkedList<Object> mostrar);
	
	
}
