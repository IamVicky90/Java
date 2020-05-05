
package javaapplication17;
import java.util.Scanner;
public class JavaApplication17 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a[][][]=new int[3][5][2];
        for(int j=0;j<a.length;j++){
        for(int k=0;k<a[j].length;k++){
        for(int l=0;l<a[j][k].length;l++){
            
        a[j][k][l]=i.nextInt();
        }
        }
        }
         
        for(int j=0;j<a.length;j++){
        for(int k=0;k<a[j].length;k++){
        for(int l=0;l<a[j][k].length;l++){
            
            System.out.println(" "+a[j][k][l]);
        }System.out.println("");
        }System.out.println("");
        }
    }
    
}
