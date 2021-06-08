package perezVazquez_Ester_PilasyColas;

import java.util.LinkedList;
import java.util.Scanner;

public class Cola extends ColeccionSimple {

	private LinkedList<Object> listaCola;
	
	
	
	public Cola() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Cola(LinkedList<Object> listaCola) {
		super();
		this.listaCola = listaCola;
	}


	
	

	public LinkedList<Object> getListaCola() {
		return listaCola;
	}



	public void setListaCola(LinkedList<Object> listaCola) {
		this.listaCola = listaCola;
	}


	
	

	@Override
	public String toString() {
		return "Cola [listaCola=" + listaCola + "]";
	}



	@Override
	void annadir(Scanner teclado, LinkedList<Object> annadirDato) {
		// TODO Auto-generated method stub
		
		int salir;
		do {
			System.out.println("Añada un dato");
			annadirDato.add(teclado.next());
			System.out.println("Añadir más datos? 1/SI 0/NO");
			salir =teclado.nextInt();
		}while(salir!=0);
		
		
	}

	@Override
	void primero(LinkedList<Object> primer) {
		// TODO Auto-generated method stub
		
		System.out.println("El primer elemento es: "+primer.get(0));
		
	}

	@Override
	void extraer(LinkedList<Object> borrar) {
		// TODO Auto-generated method stub
		
		System.out.println(borrar.get(0)+" ha sido borrado");
		borrar.remove(borrar.get(0));
		
	}

	@Override
	void toString(LinkedList<Object> mostrar) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<mostrar.size(); i++) {
			System.out.print(mostrar.get(i).toString()+" ");
			
		}
		System.out.println(" ");
	}

}
