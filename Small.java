import java.util.Scanner;
class Small{
int a,b;
Scanner sc=new Scanner(System.in);


void print()
{
System.out.println("Enter any 2 Numbers:");
a=sc.nextInt();
b=sc.nextInt();
if (a<b)
{
System.out.println("a is a Smallest  number");
if (a%2==0)
{
System.out.println("a is an Even Number");
}else{
System.out.println("a is an Odd Number");
}//Else closing
}//Inner if closing
else
{
System.out.println("b is a Smallest number");
if (b%2==0)
{
System.out.println("b is an Even Number");
}
else{
System.out.println("b is an Odd Number");
}//inner else closing
}
}//final if closing


public static void main(String[]args)
{
Small s=new Small();
s.print();

}
}