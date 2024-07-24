class Ben<T>
{
T uid; //variable
Ben(T uid)
{
this.uid=uid;
}
void task()
{
System.out.println("User Id is : "+uid);
}
}

class Kelvin<T,E,K,V>
{
T empid;
E name;
K pnum;
V age;

Kelvin(T empid,E name,K pnum,V age)
{
this.empid=empid;
this.name=name;
this.pnum=pnum;
this.age=age;
}
void task2()
{
System.out.println("Employee is : "+empid);
System.out.println("Employee Name : "+name);
System.out.println("Employee Phone Number : "+pnum);
System.out.println("Employee Age : "+age);
}
}

class Grandfa
{
public static void main(String[]args)
{
Ben<Integer> b=new Ben<Integer>(1256);
b.task();
Kelvin<Integer,String,String,Integer> k=new Kelvin<Integer,String,String,Integer>(256,"ramesh","9640591713",25);
k.task2();

}
}