package TiendaTecnologia;

import TiendaTecnologia.Compradores.*;
import java.util.Scanner;

public class Administracion{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        int opcion;


		System.out.println("************Bienvenido a la Tienda de Tecnologia************");

		do {
			System.out.println("Por favor ingrese el tipo de compador..")
            System.out.println("1) VIP");
            System.out.println("2) Socio");
            System.out.println("3) Estudiante");
            System.out.println("4) Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                	
                    break;
                case 3:
                    
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
