import java.util.Scanner;
class UserName{
String a,b,c;
Scanner sc=new Scanner(System.in);

void read(){
System.out.println("Enter your first name:");
a=sc.nextLine();
System.out.println("Enter your Middle name:");
b=sc.nextLine();
System.out.println("Enter your Last name:");
c=sc.nextLine();
}

void print(){
System.out.println("Your full name is:"+a+" "+b+" "+c+".");
}

public static void main(String[] args){
UserName us=new UserName();
us.read();
us.print();
}
}

