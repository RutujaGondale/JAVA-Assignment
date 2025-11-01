/* static block : -the block declared with static keyword call as static block
- it execute automatically when class is loaded into memory*/

 class StaticBlock{
static {
 System.out.println("this is static block");
System.out.println("execute automatically when class is loaded into memory");
int a=10,b=23;
System.out.println(+(a+b));
String r = "rutu";
System.out.println("string="+r);
}
static int value=0;
StaticBlock()
{
value++;
System.out.println(value);
System.out.println("i am belong from class and all objects of class share same static varialbe ");
}
static void sayhello()
{
System.out.println("hello i am from static method");
System.out.println("you can call me without creating my object");
}

public static void main(String args[])
{
StaticBlock sb = new StaticBlock();
StaticBlock sb1 = new StaticBlock();
StaticBlock sb2 = new StaticBlock();
StaticBlock sb3 = new StaticBlock();
StaticBlock sb4 = new StaticBlock();
StaticBlock sb5 = new StaticBlock();
sayhello();
StaticBlock.sayhello();
}

}
