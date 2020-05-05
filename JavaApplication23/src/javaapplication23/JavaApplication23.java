package javaapplication23;
import java.util.Scanner;
import javax.swing.*;
import java.util.Arrays;
public class JavaApplication23 {
    public static void main(String[] args) {
        int a[][][] =new int[2][2][2];
        for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
        for(int k=0;k<a[i][j].length;k++){
        String str=JOptionPane.showInputDialog("enter the numbers");
                a[i][j][k]=Integer.parseInt(str);
                
        }
        }
        }
        int smaller=vicky(a);
         JOptionPane.showMessageDialog(null, smaller);
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the numbers");
        int c[][][]=new int[2][2][2];
          for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
        for(int k=0;k<a[i][j].length;k++){
        c[i][j][k]=input.nextInt();
                
        }
        }
        }}
    static int
         vicky(int a[][][]){
        int smaller_nmbr=a[0][0][0];
            for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
        for(int k=0;k<a[i][j].length;k++){
        if(smaller_nmbr>a[i][j][k]){
       smaller_nmbr=a[i][j][k];
        }
                
                
        }
        }
        }
   return smaller_nmbr;}}