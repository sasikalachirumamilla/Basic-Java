class Tech1
{
String cname="TCS";
void Task(double sal)
{
sal=25000.00;
System.out.println("My Company Name is : "+cname);
System.out.println("My Salary is : "+sal);
}//method closing


void Task(double sal)
{
sal=30000.00;
String cname="Accenture";
System.out.println("My Company Name is : "+cname);
System.out.println("My Salary is : "+sal);
}//method closing
}//Class closing


class OverRide2
{
public static void main(String[]args)
{
Tech1 t1=new Tech1();
t1.Task(60000);
}
}

