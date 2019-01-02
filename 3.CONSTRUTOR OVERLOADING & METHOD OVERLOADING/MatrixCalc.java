import java.util.Scanner;

/*Create a class called Matrix. It includes methods called 'matMul' for multiplying two Matrix
objects and return the resultant Matrix object and 'matAdd' for adding two Matrix objects and
return the resultant Matrix*/
//			by Aniruddha

class Matrix
{
	int m[][];
	
	Matrix(int r,int c)
	{
		m = new int[r][c];
	}
	
	void create()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input Matrix: ");
		for(int i=0;i <m.length;i++)
			for(int j=0;j <m[0].length;j++)
				m[i][j]= in.nextInt();	
	}
	
	void display()
	{
		for(int i=0;i <m.length;i++)
		{
			for(int j=0;j < m[0].length;j++)
				System.out.print(m[i][j]+"\t");
			System.out.println();
		}
	}
	
	Matrix add(Matrix n)
	{
		if(m.length == n.m.length && m[0].length == n.m[0].length)
		{
			Matrix temp = new Matrix(m.length,m[0].length);
			for(int i=0;i <m.length;i++)
				for(int j=0;j <m[0].length;j++)
					temp.m[i][j]= m[i][j] + n.m[i][j];	
			return temp;
		}
		else
		{
			System.out.println("Not Possible");
			return null;
		}
	}
	
	Matrix mul(Matrix n)
	{
		if(n.m.length == m[0].length)
		{
			Matrix temp = new Matrix(m.length,n.m[0].length);
			for(int i=0;i <m.length;i++)
				for(int j=0;j <n.m[0].length;j++)
				{
					int sum = 0;
					for(int k=0;k <m[0].length;k++)
						sum = sum + m[i][k]*n.m[k][j];
					temp.m[i][j]= sum;	
				}
			return temp;
		}
		else
		{
			System.out.println("Not Possible");
			return null;
		}
	}
}

class MatrixCalc
{
	public static void main(String args[])
	{
		Matrix m1 = new Matrix(3,3);
		m1.create();
		Matrix m2 = new Matrix(3,3);
		m2.create();
		System.out.println("Matrix 1 :");
		m1.display();
		System.out.println("Matrix 2 :");
		m2.display();
		Matrix m3 = m1.add(m2);
		System.out.println("Matrix Sum :");
		m3.display();
		Matrix m4 = m1.mul(m2);
		System.out.println("Matrix Product :");
		m4.display();
	}
}

/*Sample Output:
Input Matrix: 
5 8 9
2 7 3
1 9 4
Input Matrix: 
6 7 2
1 5 6
7 5 3
Matrix 1 :
5	8	9	
2	7	3	
1	9	4	
Matrix 2 :
6	7	2	
1	5	6	
7	5	3	
Matrix Sum :
11	15	11	
3	12	9	
8	14	7	
Matrix Product :
101	120	85	
40	64	55	
43	72	68	
*/	
