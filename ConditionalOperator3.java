class ConditionalOperator3
{
public static void main (String x[])
{
System.out.println("enter first number"+x[0]);
System.out.println("enter second number" +x[1]);
System.out.println("enter third number " +x[2]);
System.out.println("enter fourth number" +x[3]);
System.out.println("enter fifth number" +x[4]);
int n1=Integer.parseInt(x[0]);
int n2=Integer.parseInt(x[1]);
int n3=Integer.parseInt(x[2]);
int n4=Integer.parseInt(x[3]);
int n5=Integer.parseInt(x[4]);
int m=(n1>n2?(n1>n3?(n1>n4?(n1>n5?n1:n5):(n4>n5?n4:n5))
       :(n3>n4?(n3>n5?n3:n5):(n4>n5?n4:n5)))
       :(n2>n3?(n2>n4?(n2>n5?n2:n5):(n4>n5?n4:n5))
       : (n3>n4?(n3>n5?n3:n5):(n4>n5?n4:n5))));
System.out.println("the greater among 5="+m);
}
}