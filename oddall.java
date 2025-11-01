class oddall
{
public static void main(String args[])
{
int i = 1;
 int sum = 0;
while(i<=15)
{
if(i%2!=0)
{
sum=sum+i;
}
i++;
}
System.out.println("the sum of all odd number from 1 to 15 is"+sum);
}
}