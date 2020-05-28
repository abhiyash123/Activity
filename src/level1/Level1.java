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
import java.util.LinkedList;
public class Level1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        
        char[] x = a.toCharArray();
        
        
        for (int i = x.length-1; i >=0; i--) {
            
            
            System.out.print(x[i]);
            
        }
        
        
        
    }
    
}
