import java.util.Scanner;
class Even{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter number:");
int s=scanner.nextInt();
scanner.close();
for(int i=0;i<s;i+=2)
{
System.out.println(i);
}
}
}