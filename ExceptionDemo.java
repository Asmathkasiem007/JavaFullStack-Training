public class ExceptionDemo {
public static void main(String[] args) {
int a=10, b=0, c;
System.out.println("Welcome");
try {
	if(b==0)
		throw new ArithmeticException("Division by Zero is NOT Allowed");
	c = a/b;
	System.out.println("Result"+ c);
}
catch(Exception e) {
	System.out.println("The error is :"+ e);
}
System.out.println("Welcome");
}
}
