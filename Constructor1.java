//Actual Parameters
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
class Constructor1
{
public static void main(String[]args)
{
Student s=new Student(10,"Ramesh",96405917);
s.Task();
Student s1=new Student(20,"Naresh",99405917);
s1.Task();

}
}