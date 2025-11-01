import java.io.*;
class loops
{
public static void main(String args[])
{
String a;
int i;
System.out.println("Enter the 10 name");
DataInputStream r =  new DataInputStream(System.in);
try
{
for(i=0;i<=10;i++)
{
a=(r.readLine());
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}