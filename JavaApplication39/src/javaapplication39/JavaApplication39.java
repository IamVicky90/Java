
package javaapplication39;
import javax.swing.*;
public class JavaApplication39 {

    public static void main(String[] args) {
        int arr[]=new int[10];
        int arr1[]=new int[10];
        for(int i=0;i<arr.length;i++){
        String str=JOptionPane.showInputDialog("Enter the numbers");
        arr[i]=Integer.parseInt(str);
        if(arr[i]%2==0)
        {arr1[i]=arr[i];
    }else{
            JOptionPane.showMessageDialog(null,"The number is not odd","Error",JOptionPane.ERROR_MESSAGE);
        }   }
                for(int i=0;i<arr.length;i++){
        JOptionPane.showMessageDialog(null,"The numbers are: "+arr1[i],"Message",JOptionPane.PLAIN_MESSAGE);
                
                }
    }
}
