class Student
{
int rollnum;
String name;
long pnum;

Student(int rollnum,String name,long pnum)
{
this.rollnum=rollnum;
this.name=name;
this.pnum=pnum;
}

void Task()
{
System.out.println("Roll Num = "+rollnum);
System.out.println("Name = "+name);
System.out.println("Phone Number = "+pnum);
}
}


class Constructor2
{
public static void main(String[]args)
{
int a;
String b;
long c;
int n;
java.util.Scanner sc=new java.util.Scanner(System.in);

System.out.println("How many members do you want to Enter");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println("Enter Roll Number");
a=sc.nextInt();
System.out.println("Enter Name");
b=sc.next();
System.out.println("Enter Phone Number");
c=sc.nextLong();
Student s=new Student(a,b,c);
s.Task();
}
}
}