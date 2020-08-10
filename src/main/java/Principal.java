 
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author moi_queces30
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IngresarMonto ingreso = new IngresarMonto();
        Retirar retiro = new Retirar();
        
        // TODO code application logic here
        
        
        Usuarios usuario1 = new Usuarios("Moisés","Quesada", 20021 , 1234);
        int op=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite"
             + " una de las opciones que "
               + " muestra el menú : \n 1.Estado de Cuenta   2.Retiro\n "
               + "3.Transferencia         4.Ingresar Monto\n 5.Tipo de Cambio"
               + "      6.Recarga de celular\n 7.Cambiar contraseña   8.Salir"));
        do{
       switch(op){ 
           case 1:
               break;
           case 2:
               break;
           case 3:
               break;
           case 4: 
           break;
           case 5:
               break;
           case 6:
               break;
           case 7:
               break;
           
       }
       
       }while(op!=8);
    
}
        
         }
      

    
        

    

