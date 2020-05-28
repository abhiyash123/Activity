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
import java.util.HashMap;
import java.util.Scanner;
public class frequency {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
       String str = sc.nextLine();
      char[] arr = str.toCharArray();
      HashMap<Character,Integer> hMap = new HashMap<>();
      for(int i= 0 ; i< arr.length ; i++) {
         if(hMap.containsKey(arr[i])) {
            int count = hMap.get(arr[i]);
            hMap.put(arr[i],count+1);
         } else {
            hMap.put(arr[i],1);
      }
   }
   System.out.println(hMap);
        
    }
    
}
