/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ramirezcamila.ejercicioexamen1poo.vista;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.modelo.Cliente;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class VistaCliente {
    
    private Scanner entrada;
    
    public VistaCliente() {
        entrada = new Scanner(System.in);
    }
    public Cliente ingresarCliente(){
        System.out.println("Ingrese los siguientes datos del cliente: ");
        System.out.println("Cedula: ");
        String cedula = entrada.nextLine();
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Apellido: ");
        String apellido = entrada.nextLine();
        System.out.println("Direccion: ");
        String direccion = entrada.nextLine();
        System.out.println("Telefono: ");
        String telefono = entrada.nextLine();
                
        Cliente cliente = new Cliente(cedula, nombre, apellido, direccion, telefono);
        return cliente;
    }
    
    public Cliente actualizarCliente(){
        System.out.println("Ingrese la cedula del cliente que desea actualizar: ");
        String cedula1 = entrada.nextLine();
        System.out.println("Ingrese los siguientes datos del cliente: ");
        System.out.println("Cedula: ");
        String cedula = entrada.nextLine();
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Apellido: ");
        String apellido = entrada.nextLine();
        System.out.println("Direccion: ");
        String direccion = entrada.nextLine();
        System.out.println("Telefono: ");
        String telefono = entrada.nextLine();
        
        return new Cliente(cedula, nombre, apellido, direccion, telefono);
    }
    
    public Cliente eliminarCliente(){
        System.out.println("Ingrese la cedula del cliente que desea eliminar: ");
        String cedula1 = entrada.nextLine();
        
        return new Cliente("",null , "","","");
    }
    
}
