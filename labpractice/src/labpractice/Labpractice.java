
package labpractice;
import java.util.Scanner;
public class Labpractice {
public static int vicky(int arr[]){
   int sum =0;
    for(int i=0;i<arr.length;i++){
        sum =sum+arr[i];
        }
    return sum;
    }

public static void vickySearch(int arr[]){
   int search =5;
    for(int i=0;i<arr.length;i++){
        if (search==arr[i]){
            int u=i+1;
            System.out.println("The number is at index of "+i+"And Location is : "+u);
            break;
        }
        }
    
    }

public static int vicky1(int arr[]){
   
    for(int i=0;i<arr.length;i++){
        
        }
    return arr[10];
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter 10 numbers");
        for(int i=0;i<arr.length;i++){
        arr[i]=input.nextInt();
        }
        int sum=vicky(arr);
        System.out.println("Sum is: "+sum);
        vickySearch(arr);
        int arr3[]=new int[10];
        arr3[10]=vicky1(arr);
        for(int i=0;i<arr3.length;i++){
        System.out.println("Vicky numbers are"+arr3[i]);
    }}
    
}
