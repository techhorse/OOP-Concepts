import java.util.*;
	
	class Box {

double width;
double height;
double depth;
}
	
// This class declares an object of type Box.
class program {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
Box mybox = new Box();
double vol;
// assign values to mybox's instance variables
System.out.println("Enter the width of the box");

mybox.width = sc.nextInt();
System.out.println("Enter the Height of the box");
mybox.height = sc.nextInt();
System.out.println("Enter the depth of the box");
mybox.depth = sc.nextInt();
// compute volume of box
vol = mybox.width * mybox.height * mybox.depth;
System.out.println("The Volume of box with Width "+mybox.width+" Height"+mybox.height+" depth "+mybox.depth+" is " + vol);
}
}
