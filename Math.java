import java.util.Scanner;
class Math{
int a,b;
Scanner sc=new Scanner(System.in);

void mathFunc(){
System.out.println("Enter a value:");
a=sc.nextInt();
System.out.println("Enter b value:");
b=sc.nextInt();
}
void call(){
System.out.println("Minimum value is:"+java.lang.Math.min(a,b));
System.out.println("Maximum value is:"+java.lang.Math.max(a,b));
}
public static void main(String[] args)
{
Math m=new Math();
m.mathFunc();
m.call();
}
}
