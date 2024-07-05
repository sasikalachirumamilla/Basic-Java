interface ProjectManager1
{
String TeamName="Alpha";
void Task1();
void Task2();
}

interface ProjectManager2
{
String TeamName="Beta";
void Task3();
void Task4();
}

class Manager implements ProjectManager1,ProjectManager2
{

public void Task1() //addition
{
System.out.println("I'm From"+ProjectManager1.TeamName+"Team");
int a=10,b=20;
int c=a+b;
System.out.println("A & B Addition= "+c);
System.out.println("Task1 is Completed");

}
public void Task2()
{
System.out.println("I'm From"+ProjectManager1.TeamName+"Team");
int a=10,b=20;
int c=b-a;
System.out.println("A & B Subtraction= "+c);
System.out.println("Task2 is Completed");

}
public void Task3()
{
System.out.println("I'm From "+ProjectManager2.TeamName+" Team");
int a=10,b=20;
int c=a*b;
System.out.println("A & B Multiplication= "+c);
System.out.println("Task3 is Completed");

}
public void Task4()
{
System.out.println("I'm  From"+ProjectManager2.TeamName+"Team");
int a=10,b=20;
int c=b/a;
System.out.println("A & B Division is= "+c);
System.out.println("Task4 is Completed");

}

}
class  InterfaceExample
{
public static void main(String[]args)
{
ProjectManager1 m1=new Manager();
m1.Task1();
m1.Task2();

ProjectManager2 m2=new Manager();
m2.Task3();
m2.Task4();

}

}