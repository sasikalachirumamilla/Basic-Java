import java.util.Scanner;
class MethodOverLoading{
Scanner sc=new Scanner(System.in);

void old(int a,int b){
System.out.println("Enter a and b value:");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Addition of int values are:"+(a+b));
}

void old(double a,double b){
System.out.println("Enter a and b values:");
a=sc.nextDouble();
b=sc.nextDouble();
System.out.println("Addition of double values are:"+(a+b));
}

public static void main(String[] args){
MethodOverLoading ml=new MethodOverLoading();
ml.old(int A,int B);
ml.old(double A,double B);
}
}

