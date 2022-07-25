/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
package com.tcc.java.programs;
 /**
 * Java Program for addition, subtraction, multiplication and division of two
 * numbers
 */
 public class ArithmeticOperations {
     
 
       public static void main(String[] args) 
       {
        int a, b, sum, difference, product, modulo;
        float quotient;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter Two Integers");
        a = sc.nextInt();
        b = sc.nextInt();
        
        sum = a + b;
        difference = a - b;
        product = a * b;
        quotient = (float) a / b;
        modulo =a%b;
        System.out.println("Sum : " + sum);
        System.out.println("Difference : " + difference);
        System.out.println("Product : " + product);
        System.out.println("Quotient : " + quotient);
        System.out.println("Remainder : " + modulo);
    }
}

