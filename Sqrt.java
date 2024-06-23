import java.lang.Math;
import java.util.Scanner;
class Sqrt{
int a;
Scanner sc=new Scanner(System.in);

void read(){
System.out.println("Enter any number:");
a=sc.nextInt();
}
void print(){
double sqrtResult = Math.sqrt(a);
System.out.println("Square root number is"+sqrtResult);
}
public static void main(String[] args)
{
Sqrt s=new Sqrt();
s.read();
s.print();
}
}