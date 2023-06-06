/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ramirezcamila.ejercicioexamen1poo.modelo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class Carrito {
    private int codigo;
    private Calendar horaYFecha;
    private double subtotalAPagar;
    private double IVA;
    private double totalAPagar;
    private Cliente cliente;
    private List<Producto> listaProductos;

    public Carrito() {
        listaProductos = new ArrayList();
    }

    public Carrito(int codigo, Calendar horaYFecha, double subtotalAPagar, double IVA, double totalAPagar, Cliente cliente, List<Producto> listaProductos) {
        this.codigo = codigo;
        this.horaYFecha = horaYFecha;
        this.subtotalAPagar = subtotalAPagar;
        this.IVA = IVA;
        this.totalAPagar = totalAPagar;
        this.cliente = cliente;
        this.listaProductos = listaProductos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Calendar getHoraYFecha() {
        return horaYFecha;
    }

    public void setHoraYFecha(Calendar horaYFecha) {
        this.horaYFecha = horaYFecha;
    }

    public double getSubtotalAPagar() {
        return subtotalAPagar;
    }

    public void setSubtotalAPagar(double subtotalAPagar) {
        this.subtotalAPagar = subtotalAPagar;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public double calcularSubtotal(){
        subtotalAPagar = 0; 
        for (int i = 0; i < listaProductos.size(); i++) {
            subtotalAPagar = subtotalAPagar + listaProductos.get(i).getPrecio();
        }
        return subtotalAPagar;
    }
    
    public double calcularIvaPagar(){
        IVA = calcularSubtotal() * 0.12;
        return IVA;
    }
    
    public double calcularTotalPagar(){
        totalAPagar = calcularIvaPagar() + calcularSubtotal();
        return totalAPagar;
    }
    
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        subtotalAPagar += producto.getPrecio();
        calcularTotalPagar();
    }

    public void eliminarProducto(Producto producto) {
        listaProductos.remove(producto);
        subtotalAPagar -= producto.getPrecio();
        calcularTotalPagar();
    }

    @Override
    public String toString() {
        return "Carrito{" + "horaYFecha=" + horaYFecha + ", subtotalAPagar=" + subtotalAPagar + ", IVA=" + IVA + ", cliente=" + cliente + ", listaProductos=" + listaProductos + '}';
    }
}