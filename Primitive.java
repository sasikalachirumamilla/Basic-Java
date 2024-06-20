import java.util.Scanner;
class Primitive{
byte b;
short s;
int i;
long l;
char c;
float f;
double d;
Scanner sc=new Scanner(System.in);

void print()
{
System.out.println("Enter byte value b:");
b=sc.nextByte();

System.out.println("Enter short value s:");
s=sc.nextShort();

System.out.println("Enter int value i:");
i=sc.nextInt();

System.out.println("Enter long value l:");
l=sc.nextLong();

System.out.println("Enter char value c:");
c=sc.next().charAt(0);

System.out.println("Enter float value f:");
f=sc.nextFloat();

System.out.println("Enter Double value d:");
d=sc.nextDouble();
}
void print1()
{
System.out.println("Total values of primitive datatypes are:"+b+" "+s+" "+i+" "+l+" "+c+" "+f+" "+d);
}
public static void main(String[] args)
{
Primitive p=new Primitive();
p.print();
p.print1();
}
}





 