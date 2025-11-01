import java.util.Scanner;
class swit
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter your first number");
int n1=sc.nextInt();
System.out.println("enter your second number");
int n2=sc.nextInt();
System.out.println("enter your operator(+,-,*,%,/)");
char op=sc.next().charAt(0);
switch(op)
{
case'+':
System.out.println("addition="+(n1+n2));
break;
case'-':
System.out.println("Subtraction="+(n1-n2));
break;
case'*':
System.out.println("Multipication="+(n1*n2));
break;
case'%':
System.out.println("Module ="+(n1%n2));
break;
case'/':
System.out.println("Division="+(n1/n2));
break;
default:
System.out.println("invalid opeartor");
}
}
}
