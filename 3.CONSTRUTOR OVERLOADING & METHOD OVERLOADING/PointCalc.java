import java.util.Scanner;

/*Create a class called Point which will have 2 co-ordinate value x & y and will be able to
calculate the distance between two points. Write appropriate constructor and method of the
class. Create another class called Shape, which takes different number of points to create a
triangle, rectangle and circle. And also able to calculate the area and perimeter for the
different shapes. Write the appropriate overloading method for this shape class. Write
appropriate main function to test the shape class.
*/
//			by Aniruddha

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

class Shape
{
	double peri,area;
	Shape(Point a,Point b)	//circle
	{
		double r = (a.dist(b))/2.0;
		peri = 2*3.14*r;area=r*3.14*r;
		System.out.println("Circle Perimeter : "+peri);
		System.out.println("Circle Area : "+area);
	}
	
	Shape(Point a,Point b,Point c,Point d)	//rectangle
	{
		double u,v,x,y;
		u=a.dist(b);
		v=b.dist(c);
		peri = 2*(u+v);
		area = u*v;
		System.out.println("Rectangle Perimeter : "+peri);
		System.out.println("Rectangle Area : "+area);
	}
	Shape(Point a,Point b,Point c)	//triangle
	{
		double u,v,x,y;
		u=a.dist(b);
		v=b.dist(c);
		x=a.dist(c);
		peri = (u+v+x);
		double s = peri/2.0;
		area = Math.sqrt(s*(s-u)*(s-v)*(s-x));
		System.out.println("Triangle Perimeter : "+peri);
		System.out.println("Triangle Area : "+area);
	}
	
}

class PointCalc
{
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		double a,b;
		
		System.out.println("Input 1st point: ");
		a=in.nextDouble();
		b=in.nextDouble();
		Point p1 = new Point(a,b);
		
		System.out.println("Input 2nd point: ");
		a=in.nextDouble();
		b=in.nextDouble();
		Point p2 = new Point(a,b);
		
		System.out.println("Distance : "+p1.dist(p2));
		
		System.out.println("Input 2 points of Circle: ");
		a=in.nextDouble();
		b=in.nextDouble();
		Point p3 = new Point(a,b);
		a=in.nextDouble();
		b=in.nextDouble();
		Point p4 = new Point(a,b);
		Shape c = new Shape(p3,p4);
		
		System.out.println("Input 4 points of Rectangle: ");
		a=in.nextDouble();
		b=in.nextDouble();
		Point p5 = new Point(a,b);
		a=in.nextDouble();
		b=in.nextDouble();
		Point p6 = new Point(a,b);
		a=in.nextDouble();
		b=in.nextDouble();
		Point p7 = new Point(a,b);
		a=in.nextDouble();
		b=in.nextDouble();
		Point p8 = new Point(a,b);
		Shape r = new Shape(p5,p6,p7,p8);
		
		System.out.println("Input 3 points of Triangle: ");
		a=in.nextDouble();
		b=in.nextDouble();
		Point p9 = new Point(a,b);
		a=in.nextDouble();
		b=in.nextDouble();
		Point p10 = new Point(a,b);
		a=in.nextDouble();
		b=in.nextDouble();
		Point p11 = new Point(a,b);
		Shape t = new Shape(p9,p10,p11);
		
	}
}

/*Sample Output:

Input 1st point: 
0 0
Input 2nd point: 
5 5
Distance : 7.0710678118654755
Input 2 points of Circle: 
0 0
0 5
Circle Perimeter : 15.700000000000001
Circle Area : 19.625
Input 4 points of Rectangle: 
0 0
0 5
5 5
5 0
Rectangle Perimeter : 20.0
Rectangle Area : 25.0
Input 3 points of Triangle: 
0 0
0 10
5 5
Triangle Perimeter : 24.14213562373095
Triangle Area : 25.000000000000004

*/
		
