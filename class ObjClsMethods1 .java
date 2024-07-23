class ObjClsMethods1 
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
ObjClsMethods1 r=new ObjClsMethods1();
r.task();
}


}
}