//inheritance Example

class Inherit
{
void task()
{
System.out.println("Hello");
}
}
class Inherit1 extends Inherit
{
void task1()
{
System.out.println("Java");
}
}
class Inherited
{
public static void main(String...args)
{
Inherit1 i1=new Inherit1();
//i1.task();
i1.task1();

}
}