import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moi_queces30
 */
public class Transaccion {
    private String nombre;
    private String apellido;
    private String id;
    private String cedula;
    private int pago;

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {

              this.cedula = cedula;

      
               
    }

    public Transaccion(String nombre, String apellido, String id, String cedula, int pago) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cedula = cedula;
        this.pago=pago;
        
     
    }
    
   
}
