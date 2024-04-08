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
