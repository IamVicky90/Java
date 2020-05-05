
package javaapplication6;
import java.util.Scanner;
import javax.swing.*;
//import javax.swing.JOptionPane;
public class JavaApplication6 {
    public static void main(String[] args) {
        Scanner i =new Scanner(System.in);
        int a[]={100,90,19,15,26,41};
     /*   for(int b :a){
            
            JOptionPane.showMessageDialog(null,b,"Output is",JOptionPane.INFORMATION_MESSAGE);
        } */
        int min;
        min=a[0];
        for(int j=0;j<6;j++){
            if(a[j]<min){
            min=a[j];
            }
        }
        JOptionPane.showMessageDialog(null,min);
    }
    
}
