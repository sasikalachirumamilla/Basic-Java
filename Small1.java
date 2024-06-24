import java.util.Scanner;
class Small1{
double a,b,c,d,e;
Scanner sc=new Scanner(System.in);

void print(){
System.out.println("Enter any 5 numbers");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
d=sc.nextDouble();
e=sc.nextDouble();
if (a<b && a<c && a<d && a<e){
System.out.println("a is a smallest number");
}else if (b<a && b<c && b<d && b<e)
{
System.out.println("b is a smallest number");
}else if (c<a && c<b && c<d && c<e){
System.out.println("c is a smallest number");
}else if (d<a && d<b && d<c && d<e){
System.out.println("d is a smallest number");
}else if (e<a && e<b && e<c && e<d){
System.out.println("e is a smallest number");
}else
System.out.println("Invalid Input");

}//method Closing


public static void main(String[]args)
{
Small1 s=new Small1();
s.print();

}
}


