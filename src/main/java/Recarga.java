
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
public class Recarga {
    
    public int RecargaCel(int cel){
    
      int op=0;
      int recarga=0;
     String numero=Integer.toString(cel);
    
     
      
      do{ 
          op=Integer.parseInt(JOptionPane.showInputDialog("seleccione una opcion: \n"
      +"1. Recarga en claro \n"
      +"2. Recarga en movistar \n"
      +"3. Recarga en kolbi \n"
      + "4. Salir"));
     
     if(numero.length()!=8){
     JOptionPane.showConfirmDialog(null, "--Error--"
             + "\n--El número digitado es inexistente--" );}
     else if(numero.length()==8){
     recarga = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto que desea recargar"));
     
      
      switch(op){
          case 1: JOptionPane.showMessageDialog(null, "Se recargaron "+ recarga+ " colones, al numero "+ numero+ " de la compañia claro.");
          break;
          case 2: JOptionPane.showMessageDialog(null, "Se recargaron "+ recarga+ " colones, al numero "+ numero+ " de la compañia movistar.");
          break;
          case 3: JOptionPane.showMessageDialog(null, "Se recargaron "+ recarga+ " colones, al numero "+ numero+ " de la compañia kolbi.");
          break;
      } }//fin de switch}
  
     
      return recarga;

    }while(op!= 4);
     
} }
