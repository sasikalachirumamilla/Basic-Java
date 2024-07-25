interface Movie
{
abstract void  SelectMovie();
}

class PVR implements Movie
{
public void  SelectMovie()
{
System.out.println("welecome to PVR");
System.out.println("Ur Select KALKI");
}
}
class INOX implements Movie
{
public void  SelectMovie()
{
System.out.println("welecome to INOX");
System.out.println("Ur Select THE GOAT");
}

}
class AMB implements Movie
{
public void  SelectMovie()
{
System.out.println("welecome to AMB");
System.out.println("Ur Select Darling");


}

}

class ServiceProvider // BookMy Show(Factory Class/SingleTon)
{

public Movie bookmyshow(String select) //Factory Method
{
if(select.equals("PVR"))
{
return new PVR();
}
else if(select.equals("AMB"))
{
return new AMB();
}
else if(select.equals("INOX"))
{
return new INOX();
}
else
{
return null;
}
}
}



class FactoryExe
{
public static void main(String[]args)
{

ServiceProvider sp=new ServiceProvider();

String select;
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Welecome to Book my Show");
System.out.println("-----------------------------------");
System.out.println("1.PVR");
System.out.println("2.AMB");
System.out.println("3.INOX");
System.out.println("-----------------------------------");

System.out.println("Select Theater");
select=sc.next();

Movie m=sp.bookmyshow(select);
m.SelectMovie();

}
}