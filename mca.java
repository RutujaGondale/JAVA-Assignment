import java.util.*;

class mca
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int x,y,z;
System.out.println("enter first number");
x=sc.nextInt();//to store the value of varialbe x
System.out.println("enter second number");
y=sc.nextInt();//1
z=x+y;
System.out.println("the addition is ="+z);
System.out.println("enter your name");
String name = sc.nextLine();
System.out.println("hello,"+ name +"!");
float a;//2
System.out.println("enetr your floating value");
a=sc.nextFloat();
System.out.println("the floating point is"+a);
Double b;
System.out.println("enetr floating value");
b=sc.nextDouble();
System.out.println("double value"+b);
Boolean c;
System.out.println("read next token from input as boolean");
c=sc.nextBoolean();
System.out.println("the value is"+c);
Long g;
System.out.println("enter long value");
g=sc.nextLong();
System.out.println("value is long"+g);

sc.close();
}
}