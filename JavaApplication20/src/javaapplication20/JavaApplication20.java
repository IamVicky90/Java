package javaapplication20;
import javax.swing.*;
public class JavaApplication20 {
    public static void main(String[] args) {
        int a[][][]=new int[2][2][2];
        for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
        for(int k=0;k<a[i][j].length;k++){
        String str=JOptionPane.showInputDialog("Enter the numbers");
        a[i][j][k]=Integer.parseInt(str);
        }
        }
        }
        
       vicky(a);
    }public static void vicky(int a[][][]){
            for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
        for(int k=0;k<a[i][j].length;k++){
        JOptionPane.showMessageDialog(null,a[i][j][k]);
        //a[i][j][k]=Integer.parseInt(str);
        }
        }
        }
    }
    
}
