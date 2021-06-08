package perezVazquez_Ester_PilasyColas;

import java.util.LinkedList;
import java.util.Scanner;

public class Pila extends ColeccionSimple {

	private LinkedList<Object> listaPila;

	public Pila() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pila(LinkedList<Object> listaPila) {
		super();
		this.listaPila = listaPila;
	}

	public LinkedList<Object> getListaPila() {
		return listaPila;
	}

	public void setListaPila(LinkedList<Object> listaPila) {
		this.listaPila = listaPila;
	}

	@Override
	public String toString() {
		return "Pila [listaPila=" + listaPila + "]";
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
		
		System.out.println("El primer elemento es: "+primer.get(primer.size()-1));
		
	}

	@Override
	void extraer(LinkedList<Object> borrar) {
		// TODO Auto-generated method stub
		
		System.out.println(borrar.get(borrar.size()-1)+" ha sido borrado");
		borrar.remove(borrar.get(borrar.size()-1));
	}

	@Override
	void toString(LinkedList<Object> mostrar) {
		// TODO Auto-generated method stub
		
		for(int i=mostrar.size()-1; i>=0; i--) {
			System.out.print(mostrar.get(i).toString()+" ");
			
		}
		System.out.println(" ");
	}
	
	
	
	
}
