import java.util.Scanner;
class tab2

{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.println("enter number");
int num=sc.nextInt();
int i=1;
System.out.println("table"+num+":");
while(i<=10)
{
System.out.println(num+ "*" +i+"="+(num*i));
i++;
}

}
}