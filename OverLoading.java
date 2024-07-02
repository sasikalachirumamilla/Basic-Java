class WhatsApp
{
public double Phonenum;
public String Chat;

WhatsApp(double Phonenum,String Chat)
{
this.Phonenum=Phonenum;
this.Chat=Chat;
}//constructor closing

void Whats()
{
System.out.println("o");
}//method closing

void Whats(String status)
{
System.out.println("n");
}//method closing

void Whats(String status,String Voicecall)
{
System.out.println("e");
}//method closing
}//class closing

//***********************outside the class****************
//*********Taking Another class with Same Methods*********
class WhatsApp1  extends WhatsApp
{
void Whats()
{
System.out.println("t");
}//method closing

void Whats(String status)
{
System.out.println("w");
}//method closing

void Whats(String status,String Voicecall)
{
System.out.println("o");
}//method closing
}//class closing

class OverLoading
{
public static void main(String[]args)
{
WhatsApp1 wa=new WhatsApp1(98765219,"Hai");
wa.Whats();
wa.Whats("Happy");
wa.Whats("Happy","sam");
}
}