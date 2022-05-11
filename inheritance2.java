import java.util.*;
class Animal{
	String name;
	public void eat() {
		System.out.println("I am Eating");
	}
}
class Dog extends Animal{
	public void display() {
		System.out.println("MY name is "+name);
	}
}
public class inheritance2 {
	public static void main(String args[]) {
		Dog german=new Dog();
		german.name="xyz";
		german.eat();
		german.display();
	}
	

}
