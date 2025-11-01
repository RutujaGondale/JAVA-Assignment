class lo11
{
public static void main(String args[])
{
int i=1;
int r=5;
while(i<=r)
{
int space=r-i;
while(space>0)
{
System.out.print(" ");
space--;
}
int j=1;
while(j<=i)
{
System.out.print(j+"");
j++;
}
System.out.println();
i++;
}
}
}