//Multilevel Inheritance
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


class Inheritance2 extends Inheritance1
{
void Task2()
{
System.out.println("class Inheritance2");
}
}

class Execution2
{
public static void main(String[]args)
{
Inheritance2 a=new Inheritance2();
a.Task();
a.Task1();
a.Task2();
}
}