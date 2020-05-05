
package javaapplication1;
import javax.swing.*;
import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args) {
        
        int a[]={10,20,67,89,90};
        int search;
        Scanner input=new Scanner(System.in);
        String J=JOptionPane.showInputDialog("Enter The Number That You Want To Search");
        //int search= input.nextInt();
        search =Integer.parseInt(J);
        System.out.println(search);
        //int search=67;
        boolean find = false; 
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                find=true;
            j=i+1;
            }
         
        }
        if(find){
            JOptionPane.showMessageDialog(null,"Found at "+j);
        }
        else{
JOptionPane.showMessageDialog(null,"Not Found at ","Error",JOptionPane.WARNING_MESSAGE);        }
    
    }
    
}
