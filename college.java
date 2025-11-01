class college
{
int optMarks;//instance variable


static String colname="Dr.Babasaheb Ambedakr marathvada University";//static variable

void display()
{
int count=1000;//local variable
System.out.println(count);
}
public static void main(String args[])
{
college ce = new college();
ce.optMarks=33;

ce.optMarks=35;
System.out.println(ce.optMarks);

System.out.println(ce.optMarks);
college ce2 = new college();System.out.println(ce.colname);
System.out.println("-----------------------------------------------------------");
college.colname="Dept:UDMS";
System.out.println(ce.colname);
System.out.println("------------------------------------------------------------");
college.colname="Marksheet";
System.out.println(ce2.colname);
System.out.println("-------------------------------------------------------------");
college.colname="subject        Max_marks              Min_marks";
System.out.println(ce2.colname);
System.out.println("--------------------------------------------------------------");
System.out.println("java           45                      18");
System.out.println("math           45                      18");
System.out.println("python         45                      18");

}
}



