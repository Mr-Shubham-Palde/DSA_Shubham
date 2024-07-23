/*
What is recursion : when a function calls itself,until a specified condition is met , is called as recursion 
Stack Overflow: when program gets executed again and again until the system gets run out of memory it is known as Stack Overflow

we will understand it with the help of the factorial code
*/

import java.util.*;
public class Recursion {
    static int factorial(int n){    
        if (n == 0)    
          return 1;    
        else    
          return(n * factorial(n-1));    
       }    
       public static void main(String args[]){  
        int i,fact=1;  
        int number=4;//It is the number to calculate factorial    
        fact = factorial(number);   
        System.out.println("Factorial of "+number+" is: "+fact);    
       }  
}
