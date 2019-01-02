import java.util.Scanner;

/*Create a class called point which will have 2 co-ordinate value x & y and will be able to
calculate the distance between two points. Write appropriate constructor and method of the
class. Create an abstract class called Shape, which contains abstract methods to for area(),
perimeter(), colour() and compareShape(Shape ob). Create the derived class Triangle,
Rectangle and Circle. Write the appropriate overridden methods for these classes. .
[compareShape(Shape ob) checks if area and perimeter are same for two objects and return
the result[suppose for two Rectangle Objects then return “Matching Rectangles” otherwise
return “Non matching Rectangle”]. Test your code using dynamic method dispatch.*/

//				by Aniruddha

class Point 
{
	double x,y;
	
	Point(double a,double b)
	{
		x=a;y=b;
	}
	
	double dist(Point ob)
	{
		return Math.sqrt(Math.pow(x-ob.x , 2) + Math.pow(y-ob.y , 2));
	}
}

abstract class Shape
{
	Point a,b;
	String col;
	
	Shape(String s,Point x,Point y)	
	{
		col=s;a=x;b=y;
	}
	
	abstract double area();
	abstract double perimeter();
	abstract String colour();
	abstract void compareShape(Shape ob);
	
	void display()
	{
		System.out.println("Area: "+area());
		System.out.println("Perimeter: "+perimeter());
		System.out.println("Colour: "+colour());
	}
}

class Triangle extends Shape
{
	Point c;
	Triangle(String s,Point u,Point v,Point x)
	{
		super(s,u,v);
		c = x;
	}
	public double area()
	{
		double u,v,x,areaa;
		u=a.dist(b);
		v=b.dist(c);
		x=a.dist(c);
		double s =(u+v+x)/2.0;
		return Math.sqrt(s*(s-u)*(s-v)*(s-x));
	}
	public double perimeter()
	{
		double u,v,x,peri;
		u=a.dist(b);
		v=b.dist(c);
		x=a.dist(c);
		return (u+v+x);
	}
	public String colour()
	{
		return col;
	}
	public void compareShape(Shape ob)
	{
		if (area() == ob.area() && perimeter()==ob.perimeter())
			System.out.println("Matching Triangle ");
		else
			System.out.println("Not Matching Triangle ");
	}
}

class Rectangle extends Shape
{
	Point c,d;
	Rectangle(String s,Point a,Point b,Point u,Point v)
	{
		super(s,a,b);
		c=u;
		d=v;
	}
	public double area()
	{
		double u,v;
		u=a.dist(b);
		v=b.dist(c);
		return u*v;
	}
	public double perimeter()
	{
		double u,v;
		u=a.dist(b);
		v=b.dist(c);
		return 2*(u+v);
	}
	public String colour()
	{
		return col;
	}
	public void compareShape(Shape ob)
	{
		if (area() == ob.area() && perimeter()==ob.perimeter())
			System.out.println("Matching Rectangle ");
		else
			System.out.println("Not Matching Rectangle ");
	}
}

class Circle extends Shape
{
	Circle(String s,Point a,Point b)
	{
		super(s,a,b);
	}
	public double area()
	{
		double r = (a.dist(b))/2.0;
		return r*3.14*r;
	}
	public double perimeter()
	{
		double r = (a.dist(b))/2.0;
		return 2*3.14*r;
	}
	public String colour()
	{
		return col;
	}
	public void compareShape(Shape ob)
	{
		if (area() == ob.area() && perimeter()==ob.perimeter())
			System.out.println("Matching Circle ");
		else
			System.out.println("Not Matching Circle ");
	}
}


class ShapeCalc
{
	public static void main(String args[])
	{
		Shape sh;
		//circle
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,5);
		Circle c = new Circle("Blue",p1,p2);
		sh = c;
		sh.display();
		
		//Rectangle
		p1 = new Point(0,0);
		p2 = new Point(0,5);
		Point p3 = new Point(5,5);
		Point p4 = new Point(5,0);
		Rectangle r = new Rectangle("Red",p1,p2,p3,p4);
		sh = r;
		sh.display();
		
		//Triangle
		p1 = new Point(0,0);
		p2 = new Point(0,10);
		p3 = new Point(5,5);
		Triangle t = new Triangle("Yellow",p1,p2,p3);
		sh = t;
		sh.display();
	
	}
}

/*Sample Output:
Area: 19.625
Perimeter: 15.700000000000001
Colour: Blue
Area: 25.0
Perimeter: 20.0
Colour: Red
Area: 25.000000000000004
Perimeter: 24.14213562373095
Colour: Yellow
*/	
