import java.util.Scanner;
public class User {
  public static void main(String[] args) {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter Value:");
  int x=scanner.nextInt();
  scanner.close();
    for (int i = 0; i < x; i++) {
      System.out.println(i);
    }  
  }
}