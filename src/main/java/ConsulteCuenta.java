
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
public class ConsulteCuenta {
    public void Cuenta(String nombre ,String apellido , int id ,int saldo ){
        JOptionPane.showMessageDialog(null, "--Estado de Cuenta--");
        JOptionPane.showMessageDialog(null, " Nombre : "+ nombre + "\n Apellido : "
        + apellido + "\n ID : "+ id + "\n Saldo Disponible : "+ saldo +" colones.");
    
   
    }
    
                  
}
