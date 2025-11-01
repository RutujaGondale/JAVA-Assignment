/*neasted if: writing if statement inside the another if statement used when we want to check multiple condition one after other*/

class neastedif
{
public static void main(String x[])
{
System.out.println("enter firat number"+x[0]);
System.out.println("enter second number"+x[1]);
System.out.println("enter third number"+x[2]);
System.out.println("enter fourth number"+x[3]);
System.out.println("enter fifth number"+x[4]);
if(x.length<5)
{
return;}

int a=Integer.parseInt(x[0]);
int b=Integer.parseInt(x[1]);
int c=Integer.parseInt(x[2]);
int d=Integer.parseInt(x[3]);
int e=Integer.parseInt(x[4]);
int greater;
if(a>b){
if(a>c){
if(a>d){
if(a>e){
greater = a;
}
else{
greater= e;
}}
else{
if(d>e)
{
greater= d;
}
else
{
greater= e;
}
}
}
else
{
if(c>d){
if(c>e){
greater =c;
}
else{
greater =e;
}
}
else
{
if(d>e){
greater =d;
}
else {
greater =e;
}
}
}
}
else
{
if(b>c){
if(b>d){
if(b>e){
greater= b;
}
else {
greater= e;
}
}
else{
if(d>e){
greater= d;
}
else{
greater= e;
}
}
}
else{
if(c>d){
if(c>e){
greater =c;
}
else{
greater= e;
}}
else
{
if(d>e)
{
greater= d;
}
else{
greater= e;
}
}
}
}
System.out.println(+greater);
System.out.println("the greatest number is"+greater);
}
}


