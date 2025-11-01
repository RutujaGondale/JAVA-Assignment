class lo12
{
public static void main(String args[])
{
int i=1;
int r=5;
do
{
int space = r-i;
do
{
if(space==0) break;
System.out.print(" ");
space--;
}
while(space>0);
int j=1;
do
{
if(j>i) break;
System.out.print(j+"");
j++;
}
while(j<=i);
System.out.println();
i++;
}
while(i<=r);
}
}
