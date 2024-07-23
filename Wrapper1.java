
class Wrapper1
{

void task()
{
char c='R';

Character ch=Character.valueOf(c);

System.out.println("6.Boxing value for char is:"+c+"\nUnBoxing value for Character is:"+ch);


}
public static void main(String[] args)
{
Wrapper1 w= new Wrapper1();
w.task();
}
}