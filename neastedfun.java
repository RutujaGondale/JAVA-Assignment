class neastedfun
{
static int Greater1(int a,int b, int c,int d)
{
int r;
if (a==b && b==c && c==d)
 System.out.println("all are equals");

else

System.out.println("they are not equal");

if(a>b)

r = greater2(a,b,d);

else

r = greater2(b,c,d);

return(r);
}
static int greater2(int a, int b,int c)
{
int r;
if(a>b)


r= greater3(a,c);

else

r= greater3(b,c);

return(r);
}
 static int greater3(int a,int b)
{

if(a>b)
return(a);
else
return(b);
}

public static void main(String x[])
{

System.out.println("enter a"+x[0]);
System.out.println("enter b"+x[1]);
System.out.println("enter c"+x[2]);
System.out.println("enter d"+x[3]);
int n=Integer.parseInt(x[0]);
int y=Integer.parseInt(x[1]);
int z=Integer.parseInt(x[2]);
int w=Integer.parseInt(x[3]);
neastedfun nf = new neastedfun();

nf.Greater1(n,y,z,w);
}
}

