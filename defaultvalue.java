public class defaultvalue
{
byte defaultByte;
short defaultShort;
int defaultInt;
long defaultLong;
float defaultFloat;
double defaultDouble;
char defaultChar;
boolean defaultBoolean;
public void printvalue()
{
System.out.println("the  default value of byte = "+ defaultByte);
System.out.println("the  default value of short ="+ defaultShort);
System.out.println("the  default value of int ="+ defaultInt);
System.out.println("the  default value of float ="+ defaultFloat);
System.out.println("the  default value of double ="+ defaultDouble);
System.out.println("the  default value of char ="+ defaultChar);
System.out.println("the  default value of boolean ="+ defaultBoolean);
}
public static void main(String args[])
{
defaultvalue dv = new defaultvalue();
defaultvalue dv1 = new defaultvalue();
dv.printvalue();
dv1.printvalue();

}
}


