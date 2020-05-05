
package javaapplication5;
import javax.swing.*;
import java.util.Scanner;
import java.lang.String;
public class JavaApplication5 {


    public static void main(String[] args) {
        String a,b,c;
        a=JOptionPane.showInputDialog("Enter First Number");
        String tst = "dd";
        char hoo ='x';
        if(a.getClass()==tst.getClass()){
             int x =Integer.parseInt(a);
      
        
        
        b =JOptionPane.showInputDialog("Enter Second Number");
        int y=Integer.parseInt(b);
        c= JOptionPane.showInputDialog("Enter third number");
        int z=Integer.parseInt(c);
        int sum=x+y+z;
                JOptionPane.showMessageDialog(null,"TOtal is : "+sum);
                String table;
                table = JOptionPane.showInputDialog("Enter the number to want it's Table");
                int t;
                t=Integer.parseInt(table);
        for(int i=1;i<11;i++){
            
            JOptionPane.showMessageDialog(null,t+"*"+i +"=" +i*t,"Table of"+ t,JOptionPane.INFORMATION_MESSAGE);
            continue;

            
}}  else {
    JOptionPane.showMessageDialog(null, "Not Supported","Invalid",JOptionPane.ERROR_MESSAGE);
        }
       
        }
    }
    

