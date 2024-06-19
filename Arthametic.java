class Arthametic{
int a=10;
int b=20;

void addition()
{
int c=a+b;
System.out.println("Addition is:" + c);
}
void subtraction()
{
int c=a-b;
System.out.println("Subtraction is:" + c);
}
void multiplication()
{
int c=a*b;
System.out.println("Multiplication is:" + c);
}
void division()
{
float c=a/b;
System.out.println("Division is:" + c);
}

public static void main(String[] args)
{
Arthametic a=new Arthametic();
a.addition();
a.subtraction();
a.multiplication();
a.division();
}
}