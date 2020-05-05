package mainclass;
import java.util.Scanner;
class crcle{
    double r=5.6;
public crcle(){
        double r=1.0;
        System.out.println(r);
        System.out.println(this.r);}}
class Vicky{
        void vicky(int a, int b){
        if(a<b){
        System.out.println(a);
        }else{
        System.out.println(b);
        }}
        }
class Circle{
	public Circle(){
		r = 1.0; //default radius value;
                System.out.println(r);
	}double r=4.0; 
        
	public Circle (double r) {
		this.r = r;  //same name!	
                System.out.println(r);
        }}
public class MainClass{	
        public static void main(String[] args){
		Circle c = new Circle(2.0); //OK
		Circle c2 = new Circle();    // OK now! 
                crcle c3=new crcle();
                System.out.println("Enter first number");
                Scanner i=new Scanner(System.in);
                int a=i.nextInt();
                System.out.println("Enter the Secomd Number");
                int b=i.nextInt();
                Vicky v=new Vicky();
                v.vicky(a,b);}}