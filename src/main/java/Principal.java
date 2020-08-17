 
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
        ConsulteCuenta cuenta = new ConsulteCuenta();
        IngresarMonto ingreso = new IngresarMonto();
        Retirar retiro = new Retirar();
        chanPass cambiaCon = new chanPass();
        TipoCambio cambio = new TipoCambio();
        Recarga recarga = new Recarga();
        
        // TODO code application logic here
        
        
        Usuarios usuario1 = new Usuarios("Moisés","Quesada", 20021 , "1234",100000);
        
       int i = 0;
        do{
            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite su id"));
            if(id != usuario1.getId()){
                JOptionPane.showMessageDialog(null, "Su id es incorrecto");
               
            
            }
            else{
              int cont=Integer.parseInt(JOptionPane.showInputDialog("Digite su contraseña"));
              if(cont==Integer.parseInt(usuario1.getContrasena())){
        int op=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite "
             + " una de las opciones que "
               + " muestra el menú : \n 1.Estado de Cuenta   2.Ingresar Monto\n "
               + "3.Transferencia         4.Retiro\n 5.Recarga de celular"
               + "      6.Tipo de Cambio \n 7.Cambiar contraseña   8.Salir"));
        do{
       switch(op){ 
           case 1:cuenta.Cuenta(usuario1.getNombre(), usuario1.getApellido(), usuario1.getId(), usuario1.getSaldo());
               break;
           case 2: int monto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto a ingresar"));
               int montoIngresado = ingreso.Ingresar(monto1);
               usuario1.setSaldo(montoIngresado);
               
           
           
               break;
           case 3:
               break;
           case 4: int r = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto que quiere retiar."));
              int saldoRetirado =retiro.retirar(r, usuario1.getSaldo());
              
           break;
           case 5:recarga.RecargaCel();
               break;
           case 6:cambio.Cambio();
               break;
           case 7:
               String conNueva = cambiaCon.chanPass(usuario1.getContrasena());
           usuario1.setContrasena(conNueva);
               break;
       
       }
       
       }while(op!=8);
            }}
        }while(i!=1);
    
}
        
         }
      

    
        

    

