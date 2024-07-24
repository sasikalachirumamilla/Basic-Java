import java.util.Scanner;

class Gen<T>
{
Scanner sc = new Scanner(System.in);
T name;

Gen(T name)
{
this.name = name;
}

void task()
{
System.out.println("Enter Your Name");
name = (T) sc.nextLine();
System.out.println("My name is " + name);
}
}

@SuppressWarnings("unchecked")
class Ten<T>
{
Scanner sc = new Scanner(System.in);
T company;

Ten(T company)
{
this.company = company;
}

@SuppressWarnings("unchecked")
void task2()
{
System.out.println("Enter Your Company");
company = (T) sc.nextLine(); // Read input as a string and cast to T
System.out.println("Your company name is: " + company);
}
}

public class GrandfaNeww
{
public static void main(String[] args)
{
Gen<String> g = new Gen<>("ram");
g.task();
        
Ten<String> t = new Ten<>("rams");
t.task2();
}
}
