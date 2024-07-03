class ExampleConstructor
{
java.util.Scanner s=new java.util.Scanner(System.in);
int a;
int b;
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
}

class ExampleConstructor1
{
ExampleConstructor1(int c, int d, String st)
{
this.c=c;
this.d=d;
this.st=st;
System.out.println("Enter c value");
c=s.nextInt();
System.out.println("Enter d value");
d=s.nextInt();
System.out.println("Enter st string");
c=s.nextLine();
System.out.println("C"+c);
System.out.println("D"+d);
System.out.println("String"+st.this);
}

void task()
{
System.out.println("Hai");
System.out.println("This is a task method");
}
}
public static void main(String[]args)
{
ExampleConstructor ec=new ExampleConstructor(50,5);
ExampleConstructor1 ec1=new ExampleConstructor(50,5);
ec.task();
}
