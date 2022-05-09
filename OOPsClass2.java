import java.util.*;
class Students{
	String name;
	int age;
	int id;
	public void printInfo() {
		System.out.println("Name of student:"+this.name);
		System.out.println("Age of Student:"+this.age);
		System.out.println("Id of Student:"+this.id);
	}
}
public class OOPsClass2 {
	public static void main(String args[]) {
		Students s1=new Students();
		s1.name="harish";
		s1.age=19;
		s1.id=1001;
		s1.printInfo();
	}

}
