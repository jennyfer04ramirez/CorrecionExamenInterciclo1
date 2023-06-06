/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.ramirezcamila.ejercicioexamen1poo.idao;

import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.modelo.Cliente;

/**
 *
 * @author ESTUDIANTE
 */
public interface IDAOCliente {
    public void create(Cliente cliente);
    public Cliente read(String cedula);
    public void update(Cliente cliente);
    public void delete(Cliente cliente);
}
