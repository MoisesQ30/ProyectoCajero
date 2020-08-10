
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
public class chanPass {
    String clave = "1234";
    public void chanPass(){
      String ax, cl;
        
        ax = JOptionPane.showInputDialog(null, "Digite su clave....");
        if(ax!=null){
            if(!ax.equals("")){            
                if(ax.equals(clave)){
                   cl = JOptionPane.showInputDialog(null, "Digite su nueva clave");
                   if(cl!=null){
                       if(cl.length()>3){
                            ax=null;
                            ax="Su anterior clave es:"+clave;
                            clave=cl;
                            ax+="Su nueva clave es: "+clave; 
                            JOptionPane.showMessageDialog(null, ax);
                       }
                       else{
                            JOptionPane.showMessageDialog(null, "La clave que desea cambiar es muy corta...");
                       }
                   }                   
                }
                else{
                    JOptionPane.showMessageDialog(null, "La clave ingresada no coincide....");
                }
            }
        }} 
}
