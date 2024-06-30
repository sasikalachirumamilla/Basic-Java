//Formal Parameters
class Student
{
int rollnum;
String name;
long pnum;
int aage;
Student(int rn, String n, long pn)
{
rollnum=rn;
name=n;
pnum=pn;
}
Student(int rn,String n,long pn,int age)
{
rollnum=rn;
name=n;
pnum=pn;
aage=age;
}


void Task()
{
System.out.println("Roll Num = "+rollnum);
System.out.println("Name = "+name);
System.out.println("Phone Number = "+pnum);
System.out.println("Age = "+aage);
}
}

class Constructor
{
public static void main(String[]args)
{
Student s=new Student(10,"Ramesh",96405917);
s.Task();
Student s1=new Student(101,"Suresh",866405917,22);
s1.Task();
}
}