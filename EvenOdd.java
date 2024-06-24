import java.util.Scanner;
class EvenOdd
{
int a;
Scanner sc=new Scanner(System.in);

void condition(){
System.out.println("Eneter any Number:"+a);
a=sc.nextInt();
if (a%2==0)
System.out.println(a+" number is an Even Number");
else
System.out.println(a+" number is an Odd Number");
sc.close();
}

public static void main(String[]args)
{
EvenOdd eo=new EvenOdd();
eo.condition();
}
}