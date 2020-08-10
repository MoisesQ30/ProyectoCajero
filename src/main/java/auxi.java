/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moi_queces30
 */
public class auxi {
   
    
    public static boolean isNum(String a){  
        
        try{
            int b = Integer.parseInt(a);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }        
    }
    
}

