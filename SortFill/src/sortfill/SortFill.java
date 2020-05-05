
package sortfill;

import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Collections;
public class SortFill {
    
    public static void main(String[] args) {
      /*   int a[][][] =new int[2][2][2];
        for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
        for(int k=0;k<a[i][j].length;k++){
        String str=JOptionPane.showInputDialog("enter the numbers");
                a[i][j][k]=Integer.parseInt(str);
                
        }
        }
        }
        Arrays.sort(a);
           for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
        for(int k=0;k<a[i][j].length;k++){
        JOptionPane.showMessageDialog(null,a[i][j][k]);
                
                
        }
        }
        }*/
        /*int a[]=new int[10];
        Arrays.fill(a, 5);
        for(int b:a){
            System.out.println(b+" ");}*/
    /* int a[][][] =new int[2][2][2];
        for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
        for(int k=0;k<a[i][j].length;k++){
        String str=JOptionPane.showInputDialog("enter the numbers");
                a[i][j][k]=Integer.parseInt(str);
                
        }
        }
        }
        int b[][][]=a;
         
       /* for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
        for(int k=0;k<a[i][j].length;k++){
        String str1=JOptionPane.showInputDialog("enter the numbers");
               // b[i][j][k]=a[i][j][k];
                b[i][j][k]=Integer.parseInt(str1);
                
        }
        }
        }*/
         
        /*for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
        for(int k=0;k<a[i][j].length;k++){
        JOptionPane.showMessageDialog(null,b[i][j][k]);
                
                
        }
        }
        }*/
        Integer[] a={2,3,4,3,1,0,9};
        Arrays.sort(a,Collections.reverseOrder());
        for(int b:a){
        System.out.println(b);}
}}
