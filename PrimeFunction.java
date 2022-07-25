/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class PrimeFunction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check if it is truly prime number or not: ");
        int number= sc.nextInt();
        if(isPrime(number)) {
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is a non-prime number");
        }
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }


}

    

