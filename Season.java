import java.util.Scanner;
class Season{
int a;
Scanner sc=new Scanner(System.in);

void print(){
System.out.println("Enter any Season number:");
a=sc.nextInt();
switch(a)
{
case 12:
{
System.out.println("Month is December and Winter Season");
break;
}
case 1:
{
System.out.println("Month is January and Winter Season");
break;
}
case 2:
{
System.out.println("Month is February and Winter Season");
break;
}
case 3:
{
System.out.println("Month is March and Summer Season");
break;
}
case 4:
{
System.out.println("Month is April and Summer Season");
break;
}
case 5:
{
System.out.println("Month is May and Summer Season");
break;
}
case 6:
{
System.out.println("Month is June and Rainy Season");
break;
}
case 7:
{
System.out.println("Month is July and Rainy Season");
break;
}
case 8:
{
System.out.println("Month is August and Rainy Season");
break;
}
case 9:
{
System.out.println("Month is September and Spring Season");
break;
}
case 10:
{
System.out.println("Month is October and Spring Season");
break;
}
case 11:
{
System.out.println("Month is November and Spring Season");
break;
}
}//Switch closing
}//print method closing
public static void main(String[]args)

{

Season s=new Season();
s.print();

}
}