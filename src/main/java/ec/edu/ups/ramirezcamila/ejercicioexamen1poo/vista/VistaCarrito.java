/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ramirezcamila.ejercicioexamen1poo.vista;

import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.modelo.Carrito;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class VistaCarrito {
    
    private Scanner entrada;
    
    public VistaCarrito() {
        entrada = new Scanner(System.in);
    }
    public Carrito ingresarCarrito(){
        System.out.println("Ingrese los siguientes datos del cliente: ");
        System.out.println("horaYFecha: ");
        String horaYFecha = entrada.nextLine();
        System.out.println("subtotalAPagar: ");
        double subtotalAPagar = entrada.nextDouble();
        System.out.println("IVA: ");
        double IVA = entrada.nextDouble();
        System.out.println("Cliente: ");
        Cliente cliente = entrada.nextLine();
        System.out.println("productos: ");
        List<Producto> listaProductos = entrada.next();
                
        Carrito carrito = new Carrito(horaYFecha, subtotalAPagar, IVA, cliente, listaProductos);
        return carrito;
    }
    
    public Carrito actualizarCarrito(){
        System.out.println("Ingrese el carrito del cliente que desea actualizar: ");
        //Carrito clienteCarrito  = entrada.nextLine();
        System.out.println("Ingrese los siguientes datos del cliente: ");
        System.out.println("horaYFecha: ");
        String horaYFecha = entrada.nextLine();
        System.out.println("subtotalAPagar: ");
        double subtotalAPagar = entrada.nextDouble();
        System.out.println("IVA: ");
        double IVA = entrada.nextDouble();
        System.out.println("Cliente: ");
        //Cliente cliente = entrada.nextLine();
        System.out.println("productos: ");
        //List<Producto> listaProductos = entrada.next();
        // return new Carrito(horaYFecha, subtotalAPagar, IVA, clienteCarrito, listaProductos);
    }
    
    public Carrito eliminarCarrito(){
        System.out.println("Ingrese la cedula del cliente que desea eliminar: ");
        String cedula1 = entrada.nextLine();
        //return new Carrito("",null , "","","");
    }
}