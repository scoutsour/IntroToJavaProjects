//nick
//kenneth kutnock

public class Driver {
	
	public static void main(String[] args)
	{
		
		Triangle shape = new Triangle(5, 5, 5);
		
		System.out.println("The three sides of the legal triangle are: " + shape.getSideA() + " " + shape.getSideB() + " " + shape.getSideC());
		
		shape.setSideA(9);
		shape.setSideB(6);
		shape.setSideC(7);
		
		System.out.println("A was set to 9, then B to 6 and C to 7: " + shape);
		
		Triangle shapeTwo = new Triangle(2, 2, 10);
		System.out.println("The illegal triangle contained: " + shapeTwo);
		
		shapeTwo.setSideA(7);
		System.out.println("Changed side A to 7: " + shapeTwo);
		
		shapeTwo.setSideB(-10);
		System.out.println("Changed side B to -10: " + shapeTwo);
		
		shapeTwo.setSideC(21);
		System.out.println("Changed side C to 21: " + shapeTwo);

	}
}
