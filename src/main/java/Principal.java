 
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
        Transaccion deposito = new Transaccion("", "","","",0);
      
        int op=0;
       
    
        
        // TODO code application logic here
        
        int saldoDisponible = 100000;// Variable del saldo disponible 
        
        
        Usuarios usuario1 = new Usuarios("Moisés","Quesada", 20021 , "1234",saldoDisponible);
        
     
        
            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite su id"));
            if(id != usuario1.getId()){
                JOptionPane.showMessageDialog(null, "Su id es incorrecto");
               
            
            }
            else{
              int cont=Integer.parseInt(JOptionPane.showInputDialog("Digite su contraseña"));
              if(cont==Integer.parseInt(usuario1.getContrasena())){
        
        do{
             op=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite "
             + " una de las opciones que "
               + " muestra el menú : \n 1.Estado de Cuenta   2.Ingresar Monto\n "
               + "3.Transferencia         4.Retiro\n 5.Recarga de celular"
               + "      6.Tipo de Cambio \n 7.Cambiar contraseña   8.Salir"));
       switch(op){  
           case 1:  
           cuenta.Cuenta(usuario1.getNombre(), usuario1.getApellido(), usuario1.getId(), usuario1.getSaldo());
           
           
          
               break;// metodo para revisar el estado de cuenta
               
               
           case 2: int monto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto a ingresar"));
               int montoIngresado = ingreso.Ingresar(monto1);
               saldoDisponible = montoIngresado + saldoDisponible;
               usuario1.setSaldo(saldoDisponible); 
          
               break;// metodo para ingresar dinero
               
               
           case 3:String nombre=JOptionPane.showInputDialog("Digite el nombre del destinario.");
           String apellido = JOptionPane.showInputDialog("Digite el apellido. ");
           String ID = JOptionPane.showInputDialog("Digite el id de 5 digitos.");
           String cedula = JOptionPane.showInputDialog("Escriba la cedula.");
           
           if(cedula.length()!=8){
           JOptionPane.showMessageDialog(null, "--Cedula Erronea--");}
           else{
               int pago= Integer.parseInt(JOptionPane.showInputDialog("Digite el monto que desea transferir a " + nombre));
           deposito.setNombre(nombre);
           deposito.setApellido(apellido);
           deposito.setId(ID);deposito.setCedula(cedula);
           deposito.setPago(pago);
           saldoDisponible = saldoDisponible - pago;
           JOptionPane.showMessageDialog(null, " Se transfirio correctamente un monto de " + pago+ " a: \n"
                   + " Nombre : "+ deposito.getNombre() + " \n Apellido: " + deposito.getApellido() + "\n "
                           + " ID : "+ deposito.getId() + " \n Cedula : "+ deposito.getCedula() );
           usuario1.setSaldo(saldoDisponible);}
           
               break;// metodo de transferencia
               
               
           case 4: String intento = JOptionPane.showInputDialog("Digite su contraseña");
           if(intento.equals(usuario1.getContrasena())){
               int dinerototal=usuario1.getSaldo();//voy a usar dinerototal para enviarlo como parametro a el metodo Retirar
               int saldo = retiro.retirar(dinerototal);
             saldoDisponible=saldoDisponible=saldo;
             
              usuario1.setSaldo(saldoDisponible);
             
               
              
          }
           else{ JOptionPane.showMessageDialog(null, "--Contraseña erronea--");
             
           }
           break;
                // metodo de Retirar dinero ARREGLAR}
               
           
           
           case 5: int cel = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de celular al que desea recaragar."));
             
           saldoDisponible = saldoDisponible-recarga.RecargaCel(cel);
           usuario1.setSaldo(saldoDisponible);
           
               break; // metodo para recargar el celular
               
               
           case 6:cambio.Cambio();
               break;// metodo para revisar el valor de cambio
               
               
           case 7:
               String conNueva = cambiaCon.chanPass(usuario1.getContrasena());
           usuario1.setContrasena(conNueva);
               break;// metodo para cambiar contraseña
       
       }
       
       }while(op!=8);
            }}
    
    
}//fin del main
        
         }
      

    
        

    

