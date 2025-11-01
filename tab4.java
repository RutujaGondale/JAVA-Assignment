import java.util.Scanner;
class tab4
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter number");
int n1=sc.nextInt();
int i=1;
do
{
System.out.println(n1+ "*" +i+"="+(n1*i));

i++;
}
while(i<=10);
}
}