class ConditionalOperator
{
public static void main (String x[])
{
System.out.println("enter first number"+x[0]);
System.out.println("enter second number" +x[1]);
int n1=Integer.parseInt(x[0]);
int n2=Integer.parseInt(x[1]);
int m=n1>n2 ? n2 :n1;
System.out.println("n1 is grater"+m);
}
}