package question1;
import javax.swing.*;

public class Question1 {
public static void func(int arr[][][]){
String str=JOptionPane.showInputDialog("Enter a number that you want to serial search");
int s=Integer.parseInt(str);
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    if(arr[i][j][k]==s){
                        int y=i+j+k;
                    JOptionPane.showMessageDialog(null,"The location of "+s+" is "+y+"And its Indexes are "+i+" "+j+" "+k,"Information",JOptionPane.INFORMATION_MESSAGE);
                    break;
                    }
                }
            }
        }
        }
public static int func(int m,int arr[][][]){
    int formula_for_median=0;

   for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
              
                    formula_for_median=arr[i][j][k]*(m/2)+arr[i][j][k]*(m/2-1);
                }
            }
        }return formula_for_median;
}
    public static void main(String[] args) {
        int m=8;
        int arr[][][]=new int[2][2][2];
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    String str=JOptionPane.showInputDialog("Enter the numbers");
                    arr[i][j][k]=Integer.parseInt(str);
                    
                }
            }
        }
        
        func(arr);
       int median= func(m,arr);
       JOptionPane.showMessageDialog(null,"Median is "+median,"Message",JOptionPane.INFORMATION_MESSAGE);

    }}
