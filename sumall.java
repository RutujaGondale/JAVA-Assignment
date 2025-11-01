class sumall
{
public static void main(String args[])
{
int i = 10;
 int sum=0;
while(i<=50)
{
if(i % 2 == 0)
{
sum=sum+i;
}
i++;
}
System.out.println("the sum of all 10 to 50 numbers are"+sum);
}
}