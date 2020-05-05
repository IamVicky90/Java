/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;
//import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Waqas Bilal
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
try
{
  System.out.println("Please input an integer");
  //nextInt will throw InputMismatchException
  //if the next token does not match the Integer
  //regular expression, or is out of range
  int usrInput=sc.nextInt();
}
catch(java.util.InputMismatchException exception)
{
//  Print "This is not an integer"
  //when user put other than integer
  System.out.println("This is not an integer");
}
    }
    
}
