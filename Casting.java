class Casting
{
byte b=100;
short s=1000;
long l=10000;
double d=1000000000.0;

int a=123456;
short sh=1234;
char c='A';

void task()
{
int a1=b;
int a2=s;
int a3=(int)l;
System.out.println("Value of byte is: "+a1);
System.out.println("Value of short is: "+a2);
System.out.println("Value of long is: "+a3);
}

void task1()
{
byte b1=(byte)a;
byte b2=(byte)sh;
int b3=(int)c;
int b4=(int)d;
float b5=(float)d;
System.out.println("Value of int is: "+b1);
System.out.println("Value of short is: "+b2);
System.out.println("Value of char is: "+b3);
System.out.println("Value of double is: "+b4);
System.out.println("Value of float is: "+b5);


}

public static void main(String[]args)
{
Casting c=new Casting();
System.out.println("--------Implicit Conversion----------");
c.task();

System.out.println("--------Explicit Conversion----------");
c.task1();
}
}