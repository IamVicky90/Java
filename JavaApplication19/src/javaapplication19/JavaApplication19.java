package javaapplication19;
import java.util.Scanner;
import javax.swing.*;
public class JavaApplication19 {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*System.out.println("Enter 6 numbers");
        int sum[]=new int[6];*/
        /*String sum1=JOptionPane.showInputDialog("Enter 6 numbers");
        int sum[]=new int[6];
        int y;*/
         //sum[6]=Integer.parseInt(sum1);
         int sum[]=new int[6];
        for(int i=0;i<6;i++){
            //y=sum[i];
             String sum1=JOptionPane.showInputDialog("Enter 6 numbers");
        
        int y;
        sum[i]=Integer.parseInt(sum1);
        }
        int display=vicky(sum);
        /*System.out.println(display);*/
        JOptionPane.showMessageDialog(null,display,"Vicky Message",JOptionPane.INFORMATION_MESSAGE);
                
    }public static int vicky(int a[]){
    int s=0;
    for(int i=0;i<a.length;i++){
    s=a[i]+s;
    }
    return s;
    }
    
}
