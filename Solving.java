class Solve
{
int a;
int b;
String c;
java.util.Scanner s=new java.util.Scanner(System.in);


//Constructor for Arithmetic Operation 
Solve(int a, int b)
{
this.a=a;
this.b=b;
System.out.println("This is Constructor Actual Parameters");
}

//constructor for string
Solve(int a,int b,String c)
{
this.a=a;
this.b=b;
this.c=c;
System.out.println("This is Another Constructor Actual Parameters");
System.out.println("Enter any String");
this.c=s.nextLine();
System.out.println("Name is:"+this.c);
}

//logic for Arithmetic operation
void logic()
{
System.out.println("Enter any 2 numbers for arithmetic Operations");
a=s.nextInt();
b=s.nextInt();
System.out.println("Addition is:"+(a+b));
System.out.println("Subtraction is:"+(a-b));
System.out.println("Multiplication is:"+(a*b));
System.out.println("Division is:"+(a/b));
System.out.println("Modulos is:"+(a%b));
}
}

//main class
class Solving
{
public static void main(String[]args)
{
int a=0;
int b=0;
String c="java";
Solve s1=new Solve(a,b);
s1.logic();
Solve s2=new Solve(a,b,c);

}//closing main method
}//closing main class