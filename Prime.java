/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Prime {
  
public static void main(String[] args) {
int low = 20, high = 50;
while (low < high) {
boolean flag = false;
for(int i = 2; i <= low/2; ++i) {
// condition for nonprime number
if(low % i == 0) {
flag = true;
break;
}
}
if (!flag)
System.out.print(low + " ");
++low;
}
}
}

