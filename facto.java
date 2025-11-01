import java.util.Scanner;
class facto
{
public static void main(String args[])
{
int i=1;
 int fact = 1;
Scanner sc = new Scanner(System.in);
System.out.println("enter number");
 int num = sc.nextInt();
while(i<=num)
{
fact=fact*i;

i++;
}
System.out.println(fact);
}
}


