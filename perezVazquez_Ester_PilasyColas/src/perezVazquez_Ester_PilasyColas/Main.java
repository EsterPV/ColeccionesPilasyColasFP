package perezVazquez_Ester_PilasyColas;

import java.util.*;

public class Main {

	public static void rellenar(Scanner teclado, LinkedList<Object> lista, Pila p1) {
		
		p1.annadir(teclado, lista);
		
	}
	public static void rellenar(Scanner teclado, LinkedList<Object> lista2, Cola c1) {
			
			c1.annadir(teclado, lista2);
			
	}
	public static void imprimirYvaciar(LinkedList<Object> lista, Pila p1) {
		p1.toString(lista);
		lista.removeAll(lista);
		System.out.println("Se ha eliminado correctamente");
	}
	public static void imprimirYvaciar(LinkedList<Object> lista2, Cola c1) {
		c1.toString(lista2);
		lista2.removeAll(lista2);
		System.out.println("Se ha eliminado correctamente");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		LinkedList<Object> pila1=new LinkedList <Object>();
		LinkedList<Object> cola1=new LinkedList <Object>();
		Pila p1 = new Pila();
		Cola c1 = new Cola();
		int opciones;
		
		do {
			System.out.println("1. Pila");
			System.out.println("2. Cola");
			System.out.println("0. Salir");
			opciones=teclado.nextInt();
			switch(opciones) {
			case 1:
				do {
					System.out.println("1. Añadir datos");
					System.out.println("2. Número de elementos que contiene la pila");
					System.out.println("3. Mostrar el primer elemento de la pila");
					System.out.println("4. Borrar el primer elemento de la pila");
					System.out.println("5. Mostrar la pila");
					System.out.println("6. Mostrar y eliminar la pila");
					System.out.println("8. Salir");
					opciones=teclado.nextInt();
					switch(opciones) {
					case 1:
						rellenar(teclado, pila1, p1);
						break;
					case 2:
						ColeccionSimple.estaVacia(pila1);
						break;
					case 3:
						p1.primero(pila1);
						break;
					case 4:
						p1.extraer(pila1);
						break;
					case 5:
						p1.toString(pila1);
						break;
					case 6:
						imprimirYvaciar(pila1, p1);
						break;
					case 8:
						break;
					default:
						System.out.println("Error, opción incorrecta");
						break;
					}
				}while(opciones!=8);
				break;
			case 2: 
				do {
					System.out.println("1. Añadir datos");
					System.out.println("2. Número de elementos que contiene la cola");
					System.out.println("3. Mostrar el primer elemento de la cola");
					System.out.println("4. Borrar el primer elemento de la cola");
					System.out.println("5. Mostrar la cola");
					System.out.println("6. Mostrar y eliminar la cola");
					System.out.println("8. Salir");
					opciones=teclado.nextInt();
					switch(opciones) {
					case 1:
						rellenar(teclado, cola1, c1);
						break;
					case 2:
						ColeccionSimple.estaVacia(cola1);
						break;
					case 3:
						c1.primero(cola1);
						break;
					case 4:
						c1.extraer(cola1);
						break;
					case 5:
						c1.toString(cola1);
						break;
					case 6:
						imprimirYvaciar(cola1, c1);
						break;
					case 8:
						break;
					default:
						System.out.println("Error, opción incorrecta");
						break;
					}
				}while(opciones!=8);
			break;
			
			case 0: 
				break;
			default:
				System.out.println("Error, opción incorrecta");
				break;
			}
		}while(opciones!=0);
		
		System.out.println("Fin");
	}

	
	
}
