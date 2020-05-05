
package javaapplication32;

import java.util.Scanner;
import javax.swing.*;
public class JavaApplication32 {


    public static void main(String[] args) {
        String str =JOptionPane.showInputDialog("Enter a number");
        int ch=Integer.parseInt(str);
        switch(ch){
                case 1:
                    JOptionPane.showMessageDialog(null, "You have enter an integer","Information!",JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Number","Error is Occured!",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
}
