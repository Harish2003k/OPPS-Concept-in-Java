import java.util.*;
class pen{
	String color;
	String type;
	  public void write() {
			System.out.println("Writing something...");
		}
	  public void printColor() {
		  System.out.println(this.color);
		  System.out.println(this.type);
	  }
}

	  public class OOPS {
	public static void main(String args[]) {
		pen pen1=new pen();
		pen1.color="blue";
		pen1.type="gel pen";
		pen pen2=new pen();
		pen2.color="black";
		pen2.type="dot";
		pen1.write();
		pen2.printColor();
	}
}
