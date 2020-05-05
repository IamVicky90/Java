package javaapplication54;
 class Super_Ex1 {
 Super_Ex1(String str) {
System.out.println("Base Class Constructor " + str); }} 

class SubClass extends Super_Ex1 {
SubClass(String str) {
super(str);
System.out.println("Sub Class Constructor " + str); }}


public class JavaApplication54 {

    public static void main(String[] args) {

       SubClass obj = new SubClass("called");
  
    }
    
}
