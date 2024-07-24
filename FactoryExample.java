// To Create a Object  for Unknown class at Rutime.
class gmail
{
void task1()
{
System.out.println("This is gmail");
}
}
class facebook
{
void task2()
{
System.out.println("This is facebook");
}
}
class instagram
{
void task3()
{

System.out.println("This is instagram");
}
}
class whatsapp
{
void task4()
{
System.out.println("This is whatsapp");
}
}

class FactoryExample
{
public static void main(String[]args)
{
try
{
String req;
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Enter Class Name");
req=sc.next();

Object o=Class.forName(req).getDeclaredConstructor().newInstance();
//getDeclaredConstructor()--This method returns the loaded class
//newInstance()--object must be created to the previous class

Class c=o.getClass();
//String s=c.getName();
System.out.println("Class Name : "+c);
}
catch(Exception e)
{
System.out.println("Class Not Found");
}
}

}