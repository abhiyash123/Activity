/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level1;

import java.util.Scanner;

/**
 *
 * @author 91780
 */
public class conacat1 {
    
    
    public static void main(String[] args) {
        
        
              Scanner sc = new Scanner(System.in);
        
        String str1 = sc.nextLine();
          String str2 = sc.nextLine();
        
          char[] c = str2.toCharArray();
          String a ="" ;
          String b;
          
          for (int i=c.length-1; i >=0; i--) {
              
              a = a+ c[i];
        
              
            
        }
          
          b = str1.concat(a);
          
          System.out.println(b);
          
          
          
          
          
         
          
        
    }
    
}
