/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level1;

/**
 *
 * @author 91780
 */
import java.util.Scanner;
public class replacevowels {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
       
        char[] x = a.toCharArray();
        
        for (int i = 0; i < x.length; i++) {
            
            if(x[i] == 'a' || x[i] == 'e' || x[i] == 'i' || x[i] == 'o' || x[i] == 'u'){
            
               x[i] ='z'; 
                
            
            
            }
        
            
        
        }
        System.out.println(x);
       
       
           
          
                  
        
    }
    
    
    
}
