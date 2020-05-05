package javaapplication56;
import java.util.Scanner;

class calculator{

    int a,b;
    
      calculator(){
          Scanner i=new Scanner(System.in);
           
         System.out.println("Enter two number");
      
         a=i.nextInt();
         b=i.nextInt();
    }
    
}
class add extends calculator{
    add(){
       
        System.out.println((a+b));
    }
}
class sub extends add{
 sub(){
     
    System.out.println(a-b);
    
}
}
class mul extends sub{
mul(){
    
    System.out.println(a*b);
}
}
class div extends mul{
div(){

    System.out.println(a/b);
}
void show(){
    System.out.println("Programming in Java, Thank You!");
}
}
public class JavaApplication56 {


    public static void main(String[] args) {
              div obj=new div();
        
        obj.show();        
    }}