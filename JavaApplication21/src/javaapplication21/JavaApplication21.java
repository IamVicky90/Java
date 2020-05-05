package javaapplication21;
import javax.swing.*;
import java.util.Scanner;
public class JavaApplication21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str0=JOptionPane.showInputDialog("Enter 1 for JOptionPane\nEnter 2 for Scanner");
        int ch=Integer.parseInt(str0);
        switch(ch){
            case 1:
        String str=JOptionPane.showInputDialog("Enter the first number of arrays");
        int x=Integer.parseInt(str);
        String str2=JOptionPane.showInputDialog("Enter the second number of arrays");
        int y=Integer.parseInt(str2);
        String str3=JOptionPane.showInputDialog("Enter the third number of arrays");
        int z=Integer.parseInt(str3);
        int arr[][][]=new int[x][y][z];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
        String str1=JOptionPane.showInputDialog("Enter the elements");
        arr[i][j][k]=Integer.parseInt(str1);}}
        
            
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
            JOptionPane.showMessageDialog(null,arr[i][j][k],"Information",JOptionPane.INFORMATION_MESSAGE);
            
}}}     
        break;
            case 2:
                System.out.println("Enter the first number of array");
                int nm1=input.nextInt();
                //int arr1[]=new int[nm1];
                System.out.println("Enter the second number of array");
                int nm2=input.nextInt();
                //int arr2[]=new int[nm2];
                System.out.println("Enter the third number of array");
                int nm3=input.nextInt();
                int arr1[][][]=new int[nm1][nm2][nm3];
                for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr1[i].length;j++){
                for(int k=0;k<arr1[i][j].length;k++){
                arr1[i][j][k] =input.nextInt();
                }
                }
                }
                  for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr1[i].length;j++){
                for(int k=0;k<arr1[i][j].length;k++){
                    System.out.println(arr1[i][j][k]);
                }
                }
                }break;
            default:
                JOptionPane.showMessageDialog(null, "INVALID COMMAND","Vicky Error",JOptionPane.ERROR_MESSAGE);
                break;
        
        }
        }
    }
