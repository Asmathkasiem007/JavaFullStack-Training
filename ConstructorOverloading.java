class ConstructorOverloading {
ConstructorOverloading(int r)
{
double circle = 3.14*r*r;
System.out.println("The area of circle is : " +circle);
}
ConstructorOverloading(int 1, int w);
{
double rect = 1*w;
System.out.println("The area of rectangle is : " +rect);
}
public static void main(string args[]) {
	ConstructorOverloading obj=new ConstructorOverloading(5,5);
	ConstructorOverloading obj=new ConstructorOverloading(5.5);
	ConstructorOverloading obj=new ConstructorOverloading(5);
    }
}
