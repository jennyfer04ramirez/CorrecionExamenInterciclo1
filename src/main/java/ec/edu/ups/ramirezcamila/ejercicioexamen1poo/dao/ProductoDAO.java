/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ramirezcamila.ejercicioexamen1poo.dao;

import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.idao.IDAOProducto;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.modelo.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class ProductoDAO implements IDAOProducto{

    private List<Producto> listaProductos;

    public ProductoDAO() {
        listaProductos = new ArrayList<>();
    }
    
    @Override
    public void create(Producto producto) {
        listaProductos.add(producto);
    }

    @Override
    public Producto read(int codigo) {
        for (Producto producto : listaProductos) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }

    @Override
    public void update(Producto producto) {
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto producto1 = listaProductos.get(i);
            if (producto1.getCodigo() == producto.getCodigo()) {
                listaProductos.set(i, producto);
            }
        }
    }

    @Override
    public void delete(Producto producto) {
        Iterator<Producto> iterator = listaProductos.iterator();
        while (iterator.hasNext()) {
            Producto producto1 = iterator.next();
            if (producto1.getCodigo() == producto.getCodigo()) {
               iterator.remove();
               break;
            }
        }
    } 
}