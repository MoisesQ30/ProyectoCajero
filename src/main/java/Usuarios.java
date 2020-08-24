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
  private String contrasena="";
  private int saldo=0;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Usuarios(String nombre, String apellido, int id, String contrasena, int saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.contrasena = contrasena;
        this.saldo = saldo;
    }
    
}
