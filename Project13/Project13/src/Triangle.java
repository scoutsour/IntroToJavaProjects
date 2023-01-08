//nick 
//kenneth kutnock

import java.text.DecimalFormat;

public class Triangle {

private static final DecimalFormat FORMATTER = new DecimalFormat("#.###");
private double s1;
private double s2;
private double s3;

private boolean isTriangle(double side1, double side2, double side3)
{
	boolean triangle = false;
	if(side1 > 0 && side2 > 0 && side3 > 0)
	{
		if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
		{
			
			return true;
		}
		
	}

return triangle;
}

public Triangle(double side1, double side2, double side3)
{
	if(isTriangle(side1,side2,side3))
	{
		s1 = side1;
		s2 = side2;
		s3 = side3;
	}
	else
	{
		s1 = 1;
		s2 = 2;
		s3 = 3;
	}

}
public double getSideA()
{
	return s1;
}

public double getSideB()
{
	return s2;
}
public double getSideC()
{
	return s3;
}

public boolean setSideA(double a)
{
	boolean valid = false;
	if(isTriangle(a,s2,s3))
	{
		s1 = a;
		valid = true;
	}
	
		return valid;
}
public boolean setSideB(double b)
{
	boolean valid = false;
	if(isTriangle(s1,b,s3))
	{
		s2 = b;
		valid = true;
	}
	
		return valid;
}
public boolean setSideC(double c)
{
	boolean valid = false;
	if(isTriangle(s1,s2,c))
	{
		s3 = c;
		valid = true;
	}
	
		return valid;
}
public String toString()
{
	return "Triangle(" + "" + FORMATTER.format(s1) + "," + FORMATTER.format(s2) + "," + FORMATTER.format(s3) + ")";
}

}
