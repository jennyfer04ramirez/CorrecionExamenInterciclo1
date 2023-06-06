/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.ramirezcamila.ejercicioexamen1poo.idao;

import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.modelo.Carrito;

/**
 *
 * @author ESTUDIANTE
 */
public interface IDAOCarrito {
    public void create(Carrito carrito);
    public Carrito read(Carrito clienteCarrito);
    public void update(Carrito carrito);
    public void delete(Carrito carrito);
    
}
