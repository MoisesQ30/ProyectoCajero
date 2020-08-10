/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moi_queces30
 */
public class Usuarios {
    
  private String nombre = "";
  private String apellido= "";
  private int id=0;
  private int contrasena=0;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public Usuarios(String nombre, String apellido, int id, int contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.contrasena = contrasena;
    }
    
}
