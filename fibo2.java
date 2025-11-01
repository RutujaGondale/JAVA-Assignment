import java.util.Scanner;
class fibo2
{
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter number of term:");
int n = sc.nextInt();

int a=0 ,b=1, count= 0;
System.out.println("fibonnaci series"+n +"term:");

do
{
System.out.println(a +"");
int next=a+b;
a=b;
b=next;
count++;
}
while(count<=n);

}
}
