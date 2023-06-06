/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ramirezcamila.ejercicioexamen1poo.controlador;

import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.idao.IDAOCliente;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.modelo.Cliente;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.vista.VistaCliente;

/**
 *
 * @author ESTUDIANTE
 */
public class ControladorCliente {
    private VistaCliente vistaCliente;
    private Cliente cliente;
    private IDAOCliente clienteDAO;

    public ControladorCliente(VistaCliente vistaCliente, IDAOCliente clienteDAO) {
        this.vistaCliente = vistaCliente;
        this.clienteDAO = clienteDAO;
    }

    public void agregarCliente(){
        cliente = vistaCliente.ingresarCliente();
        clienteDAO.create(cliente);
    }
    
    public void actualizarCliente(){
        cliente = vistaCliente.actualizarCliente();
        clienteDAO.update(cliente);
    }
    
    public void eliminarCliente(){
        cliente = vistaCliente.eliminarCliente();
        clienteDAO.delete(cliente);
    }
}