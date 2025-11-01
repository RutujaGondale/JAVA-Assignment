class sumodd
{
public static void main(String args[])
{
int i=1;
int sum=0;
do
{
if(i%2!=0)
{
sum=sum+i;
System.out.println(sum);
}
i++;
}
while(i<=15);
}
}
