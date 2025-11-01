class neastedif4
{
public static void main (String x[])
{
System.out.println("enter first "+x[0]);
System.out.println("enter second "+x[1]);
System.out.println("enter third "+x[2]);
System.out.println("enter fourth "+x[3]);
int a=Integer.parseInt(x[0]);
int b=Integer.parseInt(x[1]);
int c=Integer.parseInt(x[2]);
int d=Integer.parseInt(x[3]);
int greater;
if(a>b){
if(a>c){
if(a>d){
greater=a;
}
else{
greater=d;
}
}
else{
if(c>d){
greater =c;
}
else{
greater = d;
}
}
}
else{
if(b>c){
if(b>d){
greater=b;
}
else{
greater = d;
}
}
else{
if(c>d){
greater = c;
}
else{
greater = d;
}
}
}


System.out.println("the greater among 4"+greater);
}
}

