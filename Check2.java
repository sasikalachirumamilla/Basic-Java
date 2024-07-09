class Check2
{
java.util.Scanner sc = new java.util.Scanner(System.in);
String uid = "JAVA";
int pwd = 1234;

String UserID;
int Password;
Check2(String UserID, int Password)
{
UserID = this.UserID;
Password = this.Password;
}

void task()
{
try
{
System.out.println("Enter user id");
UserID = sc.next();
System.out.println("Enter Password");
Password = sc.nextInt();

if (uid.equals(UserID) && pwd == Password)
System.out.println("Login Success");
else
System.out.println("Try Again");
}
catch(Exception e)
{
System.out.println("Something went wrong");
}
}

public static void main(String[]args)
{
Check2 ch=new Check2("java",1234);
ch.task();
}
}