/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ramirezcamila.ejercicioexamen1poo.dao;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.idao.IDAOCliente;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.modelo.Cliente;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class ClienteDAO implements IDAOCliente {
    
    private List<Cliente> listaClientes;

    public ClienteDAO() {
        listaClientes = new ArrayList<>();
    }
    
    @Override
    public void create(Cliente cliente) {
        listaClientes.add(cliente);
    }

    @Override
    public Cliente read(String cedula) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public void update(Cliente cliente) {
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cliente1 = listaClientes.get(i);
            if (cliente1.getCedula().equals(cliente.getCedula())) {
                listaClientes.set(i, cliente);
            }
        }
    }

    @Override
    public void delete(Cliente cliente) {
        Iterator<Cliente> iterator = listaClientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente1 = iterator.next();
            if (cliente1.getCedula().equals(cliente.getCedula())) {
               iterator.remove();
               break;
            }
        }
    }
    
}