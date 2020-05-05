
package javaapplication24;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;
public class JavaApplication24 {
    public static void main(String[] args) {
        String str=JOptionPane.showInputDialog("hellow");
    char cha=str.charAt(0);
        JOptionPane.showMessageDialog(null,cha);
        Scanner input=new Scanner(System.in);
        System.out.println("enter a String");
        String ch=input.nextLine();
        System.out.println("String is: "+ ch);
        System.out.println("Enter a character");
        char ch1=input.next().charAt(0);
        System.out.println("Char is"+ch1);
        switch(ch1)
                {
            case 'a':
                System.out.println("gdsjh");
                break;
            case 'b':
                System.out.println("hello");
                break;
            default:
                System.out.println("default");
                break;       }
    }
    
    String str2;
   

    
    
}
