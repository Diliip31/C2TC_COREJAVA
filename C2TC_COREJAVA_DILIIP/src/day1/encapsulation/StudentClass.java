package day1.encapsulation;

public class StudentClass {

	public static void main(String[] args) {
	 student ob = new student();
      ob.setId(101);
      ob.setName("Diliip");
      
      System.out.println(ob.getId());
      System.out.println(ob.getName());
      
      System.out.println();
      System.out.println(ob);
	}

}
