/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ramirezcamila.ejercicioexamen1poo.dao;

import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.idao.IDAOCarrito;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.modelo.Carrito;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */

public class CarritoDAO implements IDAOCarrito{

    private List<Carrito> listaCarritos;

    public CarritoDAO() {
        listaCarritos = new ArrayList<>();
    }
    
    @Override
    public void create(Carrito carrito) {
        listaCarritos.add(carrito);
    }

    @Override
    public Carrito read(Carrito clienteCarrito) {
        for (Carrito carrito : listaCarritos) {
            if (carrito.getCliente().equals(clienteCarrito)) {
                return carrito;
            }
        }
        return null;
    }

    @Override
    public void update(Carrito carrito) {
        for (int i = 0; i < listaCarritos.size(); i++) {
            Carrito carrito1 = listaCarritos.get(i);
            if (carrito1.getCliente()== carrito.getCliente()) {
                listaCarritos.set(i, carrito);
            }
        }
    }

    @Override
    public void delete(Carrito carrito) {
        Iterator<Carrito> iterator = listaCarritos.iterator();
        while (iterator.hasNext()) {
            Carrito carrito1 = iterator.next();
            if (carrito1.getCliente()== carrito1.getCliente()) {
               iterator.remove();
               break;
            }
        }
    }
    //12% del subtotal
    
}
