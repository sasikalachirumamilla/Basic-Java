import java.util.Scanner;
class One{
double a,b;
Scanner sc=new Scanner(System.in);


void Task1(){
System.out.println("Enter any two number");
a=sc.nextDouble();
b=sc.nextDouble();
System.out.println("Addition of 2 numbers is"+ (a+b));

}//method task1 closing
}//class one closing


class Two{
void Task2(){



}//method task2 closing
}//class two closing



class Three{
void Task2(){



}//method task3 closing
}//class three closing
class Main
{
public static void main(String[]args)
{
One o=new One();
Two t=new Two();
Three th=new Three();
o.Task1();
t.Task2();
th.Task3();
}//main method closing
}//main class closing