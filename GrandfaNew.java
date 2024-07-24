import java.util.Scanner;
class Gen<T>
{
Scanner sc = new Scanner(System.in);
T name;
Gen(T name)
{
this.name=name;
}
void task()
{
System.out.println("Enter Your Name");
name=(T)sc;
System.out.println("My name is"+name);
}
}

class Ten<T>
{
Scanner sc = new Scanner(System.in);
T company;
Ten(T company)
{
this.company=company;
}
void task2()
{
System.out.println("Enter Your Company");
company=(T)sc;
System.out.println("Your campany name is: "+company);
}
}

class GrandfaNew
{
public static void main(String[]args)
{
Gen<String> g=new Gen<String>("ram");
g.task();
Ten<String> t=new Ten<String>("rams");
t.task2();
}
}