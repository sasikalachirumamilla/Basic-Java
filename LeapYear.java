import java.util.Scanner;
class LeapYear{
int a;
Scanner sc=new Scanner(System.in);

void print(){
System.out.println("Enter any year:");
a=sc.nextInt();

if ((a%4==0 && a%100!=0) || (a%400==0)){
System.out.println(a+" is a leap year");

}else{
System.out.println(a+" is not a leap year");
}
}

public static void main(String[]args)
{
LeapYear lp=new LeapYear();
lp.print();

}
}