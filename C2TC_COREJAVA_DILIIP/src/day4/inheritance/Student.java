package day4.inheritance;

public class Student extends Person{
   private int sid;
   private String dept;
   
   void show() {
	   System.out.println("In Student class");
   }
   
	   void display() {
		   System.out.println("In student class - display method");
   }
}
