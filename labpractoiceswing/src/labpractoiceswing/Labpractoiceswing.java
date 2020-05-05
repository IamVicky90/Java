
package labpractoiceswing;
import javax.swing.*;
public class Labpractoiceswing {
    
public static int vicky(int arr[]){
   int sum =0;
    for(int i=0;i<arr.length;i++){
        sum =sum+arr[i];
        }
    return sum;
    }
public static void vicky(int a,int b){

}
    public static void main(String[] args) {
         int arr[]=new int[10];
        
        for(int i=0;i<arr.length;i++){
            String str=JOptionPane.showInputDialog("Enter 10 numbers");
        arr[i]=Integer.parseInt(str);
        }
        int sum=vicky(arr);
        JOptionPane.showMessageDialog(null,"The sum is :"+sum,"Message",JOptionPane.INFORMATION_MESSAGE);
        String str1=JOptionPane.showInputDialog("Enter 1st number");
        int a=Integer.parseInt(str1);
           String str2=JOptionPane.showInputDialog("Enter 2nd number");
        int b=Integer.parseInt(str2);
        vicky(a,b);

    }
    
    
}
