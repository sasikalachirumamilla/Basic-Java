import java.util.Scanner;
class OverRide{
byte b;
short s;
int i;
Scanner sc=new Scanner(System.in);

void print()
{
System.out.println("Enter byte value b:");
b=sc.nextByte();

System.out.println("Enter short value s:");
s=sc.nextShort();

System.out.println("Enter int value i:");
i=sc.nextInt();
}

void print1()
{
System.out.println("Total values of primitive datatypes are:"+b+" "+s+" "+i);
}

public static void main(String...args)
{
OverRide p=new OverRide();
p.print();
p.print1();
}

/*
public static void main1(String...args)
{
OverRide p=new OverRide();
p.print1();
}*/
}
 