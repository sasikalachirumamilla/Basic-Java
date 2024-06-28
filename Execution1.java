//Single Inheritance
class Inheritance
{
java.util.Scanner s=new java.util.Scanner(System.in); 
void Task()
{
System.out.println("Class Inheritance");
System.out.println("Enter a and b values:");
int a=s.nextInt();
int b=s.nextInt();
System.out.println("a value :"+a);
System.out.println("b value :"+b);
}
}

class Inheritance1 extends Inheritance
{
void Task1()
{
System.out.println("class Inheritance1");
}
}
class Execution1
{
public static void main(String[]args)
{
Inheritance1 a=new Inheritance1();
a.Task();
a.Task1();
}
}