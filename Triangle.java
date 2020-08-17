import java.util.*;
import java.lang.Math;

class Triangle
{

public double triangleArea(int a,int b,int c)
{
int p;
double area;
p=(a+b+c)/2;
area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
return area;
}

public static void main(String arg[])
{
	Triangle t =new Triangle();
System.out.println(t.triangleArea(7,9,8));
}

} 