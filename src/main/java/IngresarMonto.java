
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
    
    public int Ingresar(){
        int monto1=0;
      String monto = JOptionPane.showInputDialog("Digite la cantidad de dinero que desea ingresar.");
        if((monto!=null) && !monto.equals("") && auxi.isNum(monto)){
            monto1 = Integer.parseInt(monto);
            if(monto1>0){JOptionPane.showMessageDialog(null,"Ha ingresado un monto de : " + monto);
                return monto1;
            }
            else{JOptionPane.showMessageDialog(null, "Debe ingresar un monto mayor !");
            
            }
        }
       
  
    return monto1;}

}
