/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.ramirezcamila.ejercicioexamen1poo.idao;

import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.modelo.Producto;

/**
 *
 * @author ESTUDIANTE
 */
public interface IDAOProducto {
    public void create(Producto producto);
    public Producto read(int codigo);
    public void update(Producto producto);
    public void delete(Producto producto);
}
