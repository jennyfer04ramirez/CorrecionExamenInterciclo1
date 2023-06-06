/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ramirezcamila.ejercicioexamen1poo.test;

import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.controlador.ControladorCarrito;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.controlador.ControladorCliente;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.controlador.ControladorProducto;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.dao.CarritoDAO;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.dao.ClienteDAO;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.dao.ProductoDAO;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.idao.IDAOCarrito;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.idao.IDAOCliente;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.idao.IDAOProducto;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.vista.VistaCarrito;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.vista.VistaCliente;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.vista.VistaProducto;

/**
 *
 * @author ESTUDIANTE
 */
public class Principal {
    public static void main(String[] args) {
       
        IDAOCarrito carritoDAO = new CarritoDAO();
        VistaCarrito vistaCarrito= new VistaCarrito();
        
        VistaProducto vistaProduct = new VistaProducto();
        IDAOProducto productoDAO = new ProductoDAO();
        
        VistaCliente vistaCliente = new VistaCliente();
        IDAOCliente clienteDAO = new ClienteDAO();
        
        ControladorCarrito controladorCarrito = new ControladorCarrito((CarritoDAO) carritoDAO);
        ControladorProducto controladorProducto = new ControladorProducto(vistaProduct, productoDAO);
        ControladorCliente controladorCliente = new ControladorCliente(vistaCliente, clienteDAO);
    }
}
