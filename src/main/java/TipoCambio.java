
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
public class TipoCambio {
    public void Cambio(){
    int opcion=0; 
      
    
   
      do{  
      opcion =Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: \n"
      +"1. tipo de cambio en dolares \n"
      +"2. tipo de cambio en euros \n 3. Salir"));
      
      switch(opcion){
            
    
          case 1: JOptionPane.showMessageDialog(null, "El cambio en dolares "
                  + "esta"
                  + " a 590,77 colones");
          break;
          case 2: JOptionPane.showMessageDialog(null, "El cambio en euros esta"
                  + " en"
                  + " 693,47 colones");
          break;
      
      }//fin}
      }while(opcion!=3);
}}