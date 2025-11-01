import java.util.Scanner;
class facto2
{
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter your number");
int n = sc.nextInt();
int fact=1;
int i=1;
do
{
fact=fact*i;
System.out.println(fact);

i++;
}
while(i<=n);
System.out.println("factorial:"+fact);
}
}
