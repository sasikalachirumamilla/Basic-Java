import java.util.Scanner;
class Big1{
double a,b,c,d,e;
Scanner sc=new Scanner(System.in);

void print(){
System.out.println("Enter any 5 numbers");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
d=sc.nextDouble();
e=sc.nextDouble();
if (a>b && a>c && a>d && a>e){
System.out.println("a is a biggest number");
}else if (b>a && b>c && b>d && b>e)
{
System.out.println("b is a biggest number");
}else if (c>a && c>b && c>d && c>e){
System.out.println("c is a biggest number");
}else if (d>a && d>b && d>c && d>e){
System.out.println("d is a biggest number");
}else if (e>a && e>b && e>c && e>d){
System.out.println("e is a biggest number");
}else
System.out.println("Invalid Input");

}//method Closing


public static void main(String[]args)
{
Big1 b=new Big1();
b.print();

}
}


