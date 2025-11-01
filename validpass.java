import java.util.Scanner;
class validpass
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter user id");
String  id = sc.nextLine();
System.out.println("enter user password");
String  pass = sc.nextLine();
if(id.equals("rutuja") && pass.equals("rut123"))
{
System.out.println("id and password are valid");
}
System.out.println("end the code");
}
}