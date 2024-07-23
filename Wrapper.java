class Wrapper
{
byte b=10;
short s=100;
int i=1000;
long l=10000;
float f=50;
double d=50000;

void task()
{
char c='R';

Byte b1=b;
Short s1=s;
Integer i1=i;
long l1=l;
Float f1=f;
Double d1=d;
//Character ch=c;

System.out.println("1.Boxing value for byte is:"+b+"\nUnBoxing value for byte is:"+b1);
System.out.println("2.Boxing value for short is:"+s+"\nUnBoxing value for short is:"+s1);
System.out.println("3.Boxing value for int is:"+i+"\nUnBoxing value for int is:"+i1);
System.out.println("4.Boxing value for long is:"+l+"\nUnBoxing value for long is:"+l1);
System.out.println("5.Boxing value for float is:"+f+"\nUnBoxing value for float is:"+f1);
System.out.println("6.Boxing value for double is:"+d+"\nUnBoxing value for double is:"+d1);
//System.out.println("6.Boxing value for char is:"+c+"\nUnBoxing value for Character is:"+ch);


}
public static void main(String[] args)
{
Wrapper w= new Wrapper();
w.task();
}
}