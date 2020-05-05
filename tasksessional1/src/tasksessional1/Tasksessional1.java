
package tasksessional1;
import javax.swing.*;
import java.util.Arrays;
import java.lang.Math;
public class Tasksessional1 {


    public static void main(String[] args) {
        int[][][] arr=new int[2][2][2];
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
        for(int k=0;k<arr[i][j].length;k++){
        String str=JOptionPane.showInputDialog("Enter the numbers");
        arr[i][j][k]=Integer.parseInt(str);
        }
        }
        }
        String str=JOptionPane.showInputDialog("Press a for median\nPress b for mode\nPress c for combination\npress d for quadratic\nPress e for sum of the series");
        char ch=str.charAt(0);
        int n=arr.length;
        
        switch(ch){
            case 'a':
                Arrays.sort(arr);
                int y[][][]=new int[2][2][2];
                int count=1;
                int sofar=1;
                int index1=0;
                int index2=0;
                int index3=0;
         for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
        for(int k=0;k<arr[i][j].length;k++){
                      if(y[i-1][j-1][k-1]==arr[i][j][k]){
                      count++;
                      } 
                      if(count>sofar){
                      sofar=count;
                      index1=i;
                      index2=j;
                      index3=k;
                      
                      }
                      else{
                      count=1;
                      }
        }
        JOptionPane.showMessageDialog(null, y[index1][index2][index3]);
        }
        }                     


                JOptionPane.showMessageDialog(null, y);
               break;
            case 'b':
                
                break;
                
            case 'c':
                double a=2;
                double b=8;
                double c=2;
                
                double ans=Math.sqrt((b*b)-(4*a*c));
                double ans1=ans/2*a;
                JOptionPane.showMessageDialog(null, ans1);
               
        }
    }
    
}
