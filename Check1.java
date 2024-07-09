class Check1
{
int a;
int b;

java.util.Scanner sc=new java.util.Scanner(System.in);
void task()
{
try
{
a=5;
b=0;
int c=a/b;  
System.out.println(c);
}
catch(Exception  e)
{
System.out.println(" / by zero  not possible");
}
}

void task2()
{
try
{
System.out.println("Enter a value");
String a=sc.next();

System.out.println("Enter b Value");
b=sc.nextInt();

  
System.out.println((a/b));
}
catch(Exception ie)
{
System.out.println("Invalid inputs , Plese enter valid int values");
}

}

public static void main(String[]args)
{
Check1 ch=new Check1();
ch.task();
ch.task2();
}
}