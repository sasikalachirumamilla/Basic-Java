import java.util.Scanner;
class LoginPage
{
String a,b;
String un="Ramesh";
String pwd="Ram@12345";
Scanner sc=new Scanner(System.in);



void print(){
System.out.println("Enter User Name and password:");
a=sc.nextLine();
b=sc.nextLine();
if (un.equals(a) && pwd.equals(b)){

System.out.println("Login Success");
}else{
System.out.println("Try again");
}//else closing
}//method closing

public static void main(String[]args)
{
LoginPage lp=new LoginPage();
lp.print();

}


}