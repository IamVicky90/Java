package javaapplication34;
//import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.*;
public class JavaApplication34 {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        try
        {String str=JOptionPane.showInputDialog("Enter only integers");
        int a=Integer.parseInt(str);
           
        }
    catch(java.lang.NumberFormatException exception){
       JOptionPane.showMessageDialog(null,"Please enter integer type");
    }
    }
    }