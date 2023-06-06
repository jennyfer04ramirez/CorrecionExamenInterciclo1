/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ramirezcamila.ejercicioexamen1poo.vista;

import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.modelo.Producto;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class VistaProducto {
    
    private Scanner entrada;

    public VistaProducto() {
        entrada = new Scanner(System.in);
    }
    public Producto ingresarProducto(){
        System.out.println("Ingrese los siguientes datos del producto: ");
        System.out.println("Codigo: ");
        int codigo = entrada.nextInt();
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Descripcion: ");
        String descripcion = entrada.nextLine();
        System.out.println("Precio: ");
        double precio = entrada.nextDouble();
                
        Producto producto = new Producto(codigo, nombre, descripcion, precio);
        return producto;
    }
    
    public Producto actualizarProducto(){
        System.out.println("Ingrese el codigo del procutp que desea actualizar: ");
        int codigo1 = entrada.nextInt();
        System.out.println("Ingrese los siguientes datos del producto: ");
        System.out.println("Codigo: ");
        int codigo = entrada.nextInt();
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Descripcion: ");
        String descripcion = entrada.nextLine();
        System.out.println("Precio: ");
        double precio = entrada.nextDouble();
        
        return new Producto(codigo, nombre, descripcion, precio);
    }
    
    public Producto eliminarProducto(){
        System.out.println("Ingrese el codigo del producto que desea eliminar: ");
        String codigo1 = entrada.nextLine();
        
        return new Producto(0, "", "", 0.00);
    }
}
