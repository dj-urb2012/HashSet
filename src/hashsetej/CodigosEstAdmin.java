/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashsetej;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class CodigosEstAdmin {
    private String arregloNumeros[] = {"1", "2", "3", "4", "5"};
    private String arregloLetras[] = {"A", "B", "C", "D", "E"};
    HashSet<String> listaCodigos = new HashSet<>();
    
    public CodigosEstAdmin() {
    }
        
    public String generarCodigo() {
        boolean asignador = false;
        String codigoEst = "";
        Random rand = new Random();
        for(int i = 0; i < 5; i++) {
            if(asignador) {
                asignador = false;
                codigoEst += this.arregloNumeros[rand.nextInt(5)];
            } else {
                codigoEst += this.arregloLetras[rand.nextInt(5)];
                asignador = true;
            }
        }
        return codigoEst;
    }
    
    public void agregarCodigo() {
        Scanner scanner = new Scanner(System.in);
        String nuevoCodigo = this.generarCodigo();
        if(this.listaCodigos.add(nuevoCodigo)) {
            System.out.println("Se ha agregado el codigo " + nuevoCodigo);
        } else {
            System.out.println("El codigo " + nuevoCodigo + " ya existe");
        }
        System.out.println("Preciona cualquier tecla para continuar");
        scanner.nextLine();
    }
    
    public void agregarManualmente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el codigo a agregar: ");
        String nuevoCodigo = scanner.nextLine();
        if(this.listaCodigos.add(nuevoCodigo)) {
            System.out.println("Se ha agregado el codigo " + nuevoCodigo);
        } else {
            System.out.println("El codigo " + nuevoCodigo + " ya existe");
        }
        System.out.println("Preciona cualquier tecla para continuar");
        scanner.nextLine();
    }
    
    public void buscarCodigo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el codigo del estudiante: ");
        String codigo = scanner.nextLine();
        if(this.listaCodigos.contains(codigo)) {
            System.out.println("Existe");
        } else {
            System.out.println("No existe");
        }
        System.out.println("Preciona cualquier tecla para continuar");
        scanner.nextLine();
    }
    
    public void vaciarLista() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseas eliminar todos los codigos de la lista? - SI - NO - ");
        String conf = scanner.nextLine();
        if(conf.equals("SI")) {
            this.listaCodigos.clear();
            System.out.println("Se han eliminado todos los codigos");
        } else {
            System.out.println("Se ha cancelado la eliminacion");
        }
        System.out.println("Preciona cualquier tecla para continuar");
        scanner.nextLine();
    }
    
    public void mostrarTodos() {
        Scanner scanner = new Scanner(System.in);
        Iterator<String> it = this.listaCodigos.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Preciona cualquier tecla para continuar");
        scanner.nextLine();
    }
    
}
