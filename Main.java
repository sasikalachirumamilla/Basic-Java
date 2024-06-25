import java.util.Scanner;
class One{
double a,b;
Scanner sc=new Scanner(System.in);
void Task1(){
System.out.println("Enter any two numbers for Addition");
a=sc.nextDouble();
b=sc.nextDouble();
System.out.println("Addition of 2 numbers is "+ (a+b));
}//method task1 closing
}//class one closing


class Two{
double a,b;
Scanner sc=new Scanner(System.in);
void Task2(){
System.out.println("---------------------------------------------");
System.out.println("Enter any two numbers for Subtraction");
a=sc.nextDouble();
b=sc.nextDouble();
System.out.println("Subtraction of 2 numbers is "+ (a-b));
}//method task2 closing
}//class two closing


class Three{
double a,b;
Scanner sc=new Scanner(System.in);
void Task3(){
System.out.println("---------------------------------------------");
System.out.println("Enter any two number for Multiplication");
a=sc.nextDouble();
b=sc.nextDouble();
System.out.println("Multiplication of 2 numbers is "+ (a*b));
}//method task3 closing
}//class three closing


class Four{
double a,b;
Scanner sc=new Scanner(System.in);
void Task4(){
System.out.println("---------------------------------------------");
System.out.println("Enter any two number for Division");
a=sc.nextDouble();
b=sc.nextDouble();
System.out.println("Division of 2 numbers is "+ (a/b));
}//method task4 closing
}//class four closing


class Main{
public static void main(String[]args)
{
One o=new One();
Two t=new Two();
Three th=new Three();
Four f=new Four();
o.Task1();
t.Task2();
th.Task3();
f.Task4();
}//main method closing
}//main class closing