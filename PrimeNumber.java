/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class PrimeNumber {
    
    public static void main(String[] args) {
      int my_high, my_low, i;
      boolean my_temp;
      my_low = 1;
      my_high = 75;
      System.out.println("The starting and ending numbers are defined as " + my_low + " and " + my_high);
      System.out.println("The prime numbers between the interval " + my_low + " and " + my_high + " are:");
      while (my_low < my_high) {
         my_temp = false;
         for(i = 2; i <= my_low/2; ++i) {
            if(my_low % i == 0) {
               my_temp = true;
               break;
            }
         }
         if (!my_temp && my_low != 0 && my_low != 1)
            System.out.print(my_low + " ");
           ++my_low;
      }
   }
}

