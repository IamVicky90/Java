
package pkgsuper.pkgclass;

import java.util.Scanner;

class calculator{

    protected int a,b;
    

  //int a,b;
    
      calculator(){
           Scanner i=new Scanner(System.in);
         System.out.println("Enter two number");
      
         a=i.nextInt();
         b=i.nextInt();
    }
    
}
class add extends calculator{
    add(){
        int a=super.a;
        int b=super.b;
        System.out.println((a+b));
    }
}
class sub extends add{
 sub(){
     int a=super.a;
        int b=super.b;
    System.out.println(a-b);
    
}
}
class mul extends sub{
mul(){
    int a=super.a;
        int b=super.b;
    System.out.println(a*b);
}
}
class div extends mul{
div(){
    int a=super.a;
        int b=super.b;
    System.out.println(a/b);
}
void show(){
    System.out.println("Programming in Java, Thank You!");
}
}

public class SuperClass {


    public static void main(String[] args) {
        
                div obj=new div();
        
        obj.show();

    }
    
}
