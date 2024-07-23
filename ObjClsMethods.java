class ObjClsMethods implements Cloneable
{
int a=20;
int b=30;

void task()
{
boolean res=a.equals(b);
System.out.println("This is the object class");
System.out.println("3."+ res);

}
public static void main(String[]args)
{
try
{
ObjClsMethods r=new ObjClsMethods();
r.task();
System.out.println("1."+r.getClass());
System.out.println("2."+r.hashCode());
ObjClsMethods r1=(ObjClsMethods)r.clone();// Copy of the Object.
System.out.println("4.Cloned to r1 "+ r1);
System.out.println("5."+r.toString());
}

catch(CloneNotSupportedException e)
{
System.out.println(e);
}

}
}