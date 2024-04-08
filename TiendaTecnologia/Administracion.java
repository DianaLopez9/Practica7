//package TiendaTecnologia;

//import TiendaTecnologia.Compradores.*;
import java.util.Scanner;

public class Administracion{
	
	public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int opcion;


            System.out.println("************Bienvenido a la Tienda de Tecnologia************");

            do {
            System.out.println("Por favor ingrese el tipo de comprador..");
            System.out.println("1) Estudiante");
            System.out.println("2) Socio");
            System.out.println("3) VIP");
            System.out.println("4) Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    	System.out.println("Introduzca su nombre y despues su apellido ,por favor");
			String nombre = sc.nextLine();
			String apellido= sc.nextLine();
			Estudiante alu = new Estudiante(nombre,apellido);
			alu.crearMenu();
			alu.mostrarMenu();
                        int select;
                        do{
			System.out.println("Que le gustaria realizar");
			System.out.println("1 - Comprar");
			System.out.println("2 - Revisar promociones");
			System.out.println("3 - Ticket de compra");

			select=sc.nextInt();
                        sc.nextLine();
			    
			    switch(select){
				    case 1:
					    alu.comprar();
					    break;
				    case 2:
					    alu.mostrarDescuentos();
					    break;
				    case 3:
					    alu.ticket();
					    break;
				    default:
					    System.out.println("Por favor, escoja una de las opciones disponibles");
                            }
			    }while(select<3);
			System.exit(0);
                    break;
                case 2:
                	
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("OpciÃ³n invÃ¡lida.");
            }
        } while (opcion != 4);
	}
}
/*
package Principal;


import Compradores.Estudiante;
import Principal.TiendaTecnologia.*;
import java.util.Scanner;


public class TiendaTecnologia {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int opcion;


	System.out.println("************Bienvenido a la Tienda de Tecnologia************");

	do {
	    System.out.println("Por favor ingrese el tipo de compador..");
            System.out.println("1) Estudiante");
            System.out.println("2) Vip");
            System.out.println("3) Socio");
            System.out.println("4) Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca su nombre y despues su apellido ,por favor");
			String nombre = sc.nextLine();
			String apellido= sc.nextLine();
			Estudiante alu = new Estudiante(nombre,apellido);
			alu.crearMenu();
			alu.mostrarMenu();
			System.out.println("Que le gustaria realizar");
			System.out.println("1 - Comprar");
			System.out.println("2 - Revisar promociones");
			System.out.println("3 - Ticket de compra")    ;

			int select=sc.nextInt();
			    do{
			    switch(select){
				    case 1:
					    alu.comprar();
					    break;
				    case 2:
					    alu.mostrarDescuentos();
					    break;
				    case 3:
					    alu.ticket();
					    break;
				    default:
					    System.out.println("Por favor, escoja una de las opciones disponibles");
                                
			    }while(select=3);
                break;
                case 2:
                	System.out.println("Introduzca su nombre y despues su apellido ,por favor");
			String nombre = sc.nextLine();
			String apellido= sc.nextLine();
			Vip vip = new Vip(nombre,apellido);
			vip.crearMenu();
			vip.mostrarMenu();
			System.out.println("Que le gustaria realizar");
			System.out.println("1 - Comprar");
			System.out.println("2 - Ticket de compra");
                        
                        int select=sc.nextInt();
			    do{
			    switch(select){
				    case 1:
					    vip.comprar();
					    break;
				    case 2:
					    vip.ticket();
					    break;
				    default:
					    System.out.println("Por favor, escoja una de las opciones disponibles");
                                
			    }while(select=2);
                        
                    break;
                case 3:
                    System.out.println("Introduzca su nombre y despues su apellido ,por favor");
			String nombre = sc.nextLine();
			String apellido= sc.nextLine();
			Socio socio = new Socio(nombre,apellido);
			socio.crearMenu();
			socio.mostrarMenu();
			System.out.println("Que le gustaria realizar");
			System.out.println("1 - Comprar");
			System.out.println("2 - Revisar promociones");
			System.out.println("3 - Ticket de compra");

			int select=sc.nextInt();
			    do{
			    switch(select){
				    case 1:
					    socio.comprar();
					    break;
				    case 2:
					    socio.mostrarDescuentos();
					    break;
				    case 3:
					    socio.ticket();
					    break;
				    default:
					    System.out.println("Por favor, escoja una de las opciones disponibles");
                                
			    }while(select=3);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }
}
*/
