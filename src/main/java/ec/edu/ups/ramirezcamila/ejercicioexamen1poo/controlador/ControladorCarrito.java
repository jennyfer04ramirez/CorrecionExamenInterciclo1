/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ramirezcamila.ejercicioexamen1poo.controlador;

import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.dao.CarritoDAO;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.modelo.Carrito;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class ControladorCarrito {

    private CarritoDAO carritoDAO;

    public ControladorCarrito(CarritoDAO carritoDAO) {
        this.carritoDAO = carritoDAO;
    }

    public void agregarCarritoCompra(CarritoDAO carrito) {

    }

    public void eliminarCarritoCompra(CarritoDAO carrito) {

    }

    public void actualizarCarritoCompra(CarritoDAO carrito) {

    }

    public Carrito obtenerCarritoCompra(Calendar fecha) {
        return null;
    }

    public List<Carrito> obtenerTodosLosCarritosCompra() {
        return null;
    }
}
