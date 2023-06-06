/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ramirezcamila.ejercicioexamen1poo.controlador;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.idao.IDAOProducto;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.modelo.Producto;
import ec.edu.ups.ramirezcamila.ejercicioexamen1poo.vista.VistaProducto;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class ControladorProducto {
    private VistaProducto vistaProducto;
    private Producto producto;
    private IDAOProducto productoDAO;

    public ControladorProducto(VistaProducto vistaProducto, IDAOProducto productoDAO) {
        this.vistaProducto = vistaProducto;
        this.productoDAO = productoDAO;
    }
    
    public void agregarProducto(){
       producto = vistaProducto.ingresarProducto();
       productoDAO.create(producto);
    }
   
    public void actualizarProducto(){
       producto = vistaProducto.actualizarProducto();
       productoDAO.update(producto);
    }
   
    public void elimarProducto(){
       producto = vistaProducto.eliminarProducto();
       productoDAO.delete(producto);
    }
}