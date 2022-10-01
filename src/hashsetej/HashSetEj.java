/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashsetej;

import java.util.Scanner;


/**
 *
 * @author Diego
 */
public class HashSetEj {

    /**
     * @param args the command line arguments
     */
    
    public static int menu() {
        Scanner scanInt = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Bienvenido");
        System.out.println("1. Generar y agregar un codigo");
        System.out.println("2. Agregar un codigo manualmente");
        System.out.println("3. Mostrar todos los codigos");
        System.out.println("4. Verificar si existe un codigo");
        System.out.println("5. Vaciar lista");
        System.out.println("6. Salir");
        System.out.println("Ingrese una opcion: ");
        opcion = scanInt.nextInt();
        return opcion;
    }
    
    public static void main(String[] args) {
        CodigosEstAdmin codigos = new CodigosEstAdmin();
        int opcion = 0;
        while(opcion != 6) {
            opcion = menu();
            switch(opcion) {
                case 1:
                    codigos.agregarCodigo();
                    break;
                case 2:
                    codigos.agregarManualmente();
                    break;
                case 3: 
                    codigos.mostrarTodos();
                    break;
                case 4:
                    codigos.buscarCodigo();
                    break;
                case 5:
                    codigos.vaciarLista();
                    break;
                case 6:
                    System.out.println("Buen dia");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
        
    }
    
}
