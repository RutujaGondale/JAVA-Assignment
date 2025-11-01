class ConditionalOperator1
{
public static void main (String x[])
{
System.out.println("enter first number"+x[0]);
System.out.println("enter second number" +x[1]);
System.out.println("enter third number " +x[2]);
int n1=Integer.parseInt(x[0]);
int n2=Integer.parseInt(x[1]);
int n3=Integer.parseInt(x[2]);
int m=n1>n2 ? (n1>n3?n1:n3):(n2>n3?n2:n3);
System.out.println("the is grater"+m);
}
}