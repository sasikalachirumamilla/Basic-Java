//Constructors are under only class only
//Every class contains no.of constructors with different parameters
//every constructor has only create one object only

class ExampleConstructor
{
java.util.Scanner s=new java.util.Scanner(System.in);
int a;
int b;
int c;
int d;
String st;
ExampleConstructor(int a, int b)
{
this.a=a;
this.b=b;
System.out.println("Enter a value");
a=s.nextInt();
System.out.println("Enter b value");
b=s.nextInt();
System.out.println("A"+a);
System.out.println("B"+b);
}

ExampleConstructor(int c, int d, String st)
{
this.c=c;
this.d=d;
this.st=st;
System.out.println("Enter c value");
c=s.nextInt();
System.out.println("Enter d value");
d=s.nextInt();
System.out.println("Enter st string");
st=s.next();
System.out.println("C"+c);
System.out.println("D"+d);
System.out.println("String"+st);
}
void task()
{
System.out.println("Hai");
System.out.println("This is a task method");
}
}

class ExampleConstructorMain
{
public static void main(String[]args)
{
ExampleConstructor ec=new ExampleConstructor(50,5);
ExampleConstructor ec1=new ExampleConstructor(50,5,"Hai");
ec1.task();
}
}
