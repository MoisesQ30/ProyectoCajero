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
public class Retirar {
    //metodo para retirar dinero
    public int retirar(){
    int saldo=100000;
    String clave = "1234";
      
        String ax;                
        ax = JOptionPane.showInputDialog("Digite el monto a retirar.");
        
        if(ax==null){
            
        }else{
            if(!ax.equals("")){            
                if(ax.equals(clave)){
                    ax = JOptionPane.showInputDialog(null, "a. 5000  b. 10.000\n c. 20.000  d. 50.000\n e. 100.000 f. Ingresar valor",
                            "CANTIDAD A RETIRAR", JOptionPane.INFORMATION_MESSAGE);
                    if(ax!=null){
                        if(!ax.equals("")){
                            switch(ax){
                                case "a":
                                    if((saldo-5000>=10000)){
                                        saldo-=5000;
                                    }                            
                                    break;
                                case "b":
                                   if((saldo-10000>=10000)){
                                        saldo-=10000;
                                    }
                                    break;
                                case "c":
                                   if((saldo-20000>=10000)){
                                    }
                                    break;
                                case "d":
                                    if((saldo-50000>=10000)){
                                        saldo-=50000;
                                    }
                                    break;
                                case "e":
                                    if((saldo-100000>=10000)){
                                        saldo-=100000;
                                    }
                                    break;
                                case "f":
                                    ax = JOptionPane.showInputDialog(null, "Digite el valor a retirar: ");
                                    if(!ax.equals("") && auxi.isNum(ax) && (Integer.parseInt(ax)>0) && (saldo-Integer.parseInt(ax)>=10000) ){
                                        saldo-= Integer.parseInt(ax);
                                    }
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Digite una opcion valida", "OPCION INCORRECTA", JOptionPane.ERROR_MESSAGE);
                                    break;
                            }             
                        } 
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "La clave ingresada no coincide....");
                }
            }
        }              
    return saldo;
/* se retorna el saldo para restarselo al que sale en el main*/ }
}
   
    

