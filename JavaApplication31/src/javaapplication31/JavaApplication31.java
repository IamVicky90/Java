package javaapplication31;
import java.util.Scanner;
import javax.swing.*;
public class JavaApplication31 {
    public static void main(String[] args) {
        //int name[]=new int[5];
        Scanner input=new Scanner(System.in);
        String names[]={"Pakistan","India","America"};
        for(String name1: names){
            System.out.println(name1);
        }
        String str2=JOptionPane.showInputDialog("Enter 1 for JOptionpane\nEnter 2 for Scanner\nenter 3 for String array in JOptionPane\nenter 4 for string array in scanner");
       
       int ch = Integer.parseInt(str2);
        switch(ch){
            case 1:
                int a[][]=new int[2][2];
                for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                String str1=JOptionPane.showInputDialog("Enter the numbers");
                a[i][j]=Integer.parseInt(str1);
                }
                }
                 for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
               JOptionPane.showMessageDialog(null,"The numbers are: "+a[i][j],"Information Message",JOptionPane.INFORMATION_MESSAGE);
                
                }
                }break;
            case 2:
                System.out.println("Enter the numbers");
                
                int b[][]=new int[2][2];
                                for(int i=0;i<b.length;i++){
                for(int j=0;j<b[i].length;j++){
                
                b[i][j]=input.nextInt();
                }
                }
                for(int i=0;i<b.length;i++){
                for(int j=0;j<b[i].length;j++){
                
                    System.out.println("Tne numbers are: "+b[i][j]);
                }
                }break;
            case 3:
                String arr[][]=new String[2][2];
                
                for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                arr[i][j]=JOptionPane.showInputDialog("Enter the Strings");
                
                }
                }
                 for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    
               JOptionPane.showMessageDialog(null,arr[i][j],"Information Message",JOptionPane.INFORMATION_MESSAGE);
                
                }
                }break;
            case 4:
                                String arr1[][]=new String[2][2];
                System.out.println("Enter the strings");
                for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                arr1[i][j]=input.nextLine();
                
                }
                }
                 for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    
                    System.out.println("Strings are: "+arr1[i][j]);
                }
                }
                 break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Number","Error is Occured!",JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
    
}
