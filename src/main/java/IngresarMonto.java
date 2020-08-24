
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
public class IngresarMonto {
    
    public int Ingresar(int monto1){
        
       int monto = Integer.parseInt(JOptionPane.showInputDialog("Vuelva a digitar la cantidad de dinero que desea ingresar."));
        if( (monto==monto1)){
            
            
            if(monto1>0){JOptionPane.showMessageDialog(null,"Ha ingresado un monto de : " + monto);
                
            }
            else if (monto1!=monto){JOptionPane.showMessageDialog(null, "El monto no coincide con el anterior !");
            
            }
        }else if (monto1<10){
            JOptionPane.showMessageDialog(null, "El monto debe ser mayor.");
        
        }
       
  
    return monto;}


}
