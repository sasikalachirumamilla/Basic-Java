class WhatsApp
{
private double Phonenum;
private String Chat;

WhatsApp(double Phonenum,String Chat)
{
this.Phonenum=Phonenum;
this.Chat=Chat;
}

void Whats()
{
System.out.println("**********************************");
System.out.println("*****Welcome To Whats APP*****");
System.out.println("***********************************");
System.out.println("Your Phone Number :" +Phonenum);
System.out.println("Your Chat Box :" +Chat);
System.out.println("***********************************");
}
void Whats(String status)
{
System.out.println("***********************************");
System.out.println("Today Status : "+status);
System.out.println("***********************************");
}
void Whats(String status,String Voicecall)
{
System.out.println("***********************************");
System.out.println("Today Status : "+status);
System.out.println("call From : "+Voicecall);
System.out.println("***********************************");
}
}

class OverLoadingOriginal
{
public static void main(String[]args)
{
WhatsApp wa=new WhatsApp(964051713,"Hi ,Gud Morning");
wa.Whats();
//wa.Whats("Happy BirthDay Rams");
wa.Whats("Happy BirthDay Rams","samantha");

}
}