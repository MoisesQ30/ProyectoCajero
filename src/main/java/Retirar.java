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
    public int retirar(int saldo){
    
   int op = 0;
   if(saldo<5000){
       JOptionPane.showMessageDialog(null, "--Tu saldo es menor del requerido--");
   }
   else{
       op = Integer.parseInt(JOptionPane.showInputDialog("Digite la opción requerida : \n 1. 5000  2. 10000"
   + "\n3. 15000  4. 20000 \n5. 50000  6. 100000 \n7. Escribir monto."));
   switch(op){
       case 1: saldo=saldo-5000;
       break;
       case 2: saldo=saldo-10000;
       break;
       case 3: saldo = saldo - 15000;
       break;
       case 4: saldo = saldo - 20000;
       break;
       case 5: saldo = saldo-50000;
       break;
       case 6: saldo=saldo-100000;
       break;
       case 7: int monto = Integer.parseInt(JOptionPane.showInputDialog("--Ingrese el monto--"));
       if(monto>saldo){
       }else{saldo = saldo-monto;}break;
   
   
   }
   
   }
 return saldo;}


}
   
    

