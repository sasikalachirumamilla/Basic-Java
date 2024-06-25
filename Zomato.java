import java.util.Scanner;
class Zomato
{
int select;
int s;
int s1;
int s2;
int s3;
int s4;
Scanner sc=new Scanner(System.in);

void Order()
{
System.out.println("____________________________________");
System.out.println("Welecome To Zomato");
System.out.println("____________________________________");
System.out.println("____________________________________");
System.out.println("MY RESTARUNTS");
System.out.println("1.SriKanya");
System.out.println("2.Paradise");
System.out.println("3.Kruthunga");
System.out.println("4.Bawarchei");
System.out.println("5.Merideian");
System.out.println("____________________________________");
select=sc.nextInt();

switch(select)
{
case 1:
{
System.out.println("_____________________________________");
System.out.println("Welcome To SriKanya RESTARUNT");
System.out.println("_____________________________________");
System.out.println("_____________________________________");
System.out.println("****************OUR MENU************");
System.out.println("_____________________________________");
System.out.println("1.Veg Biriyani");
System.out.println("2.Chicken Fry Biriyani");
System.out.println("3.Mutton Fry Biriyani");
System.out.println("_____________________________________");
System.out.println("*Select Your FAV ITEM");

s=sc.nextInt();
switch(s)
{
case 1:
{
System.out.println("_______________________________________");
System.out.println("Your Selected Veg Biriyani");
System.out.println("________________________________________");
System.out.println("How Many U Want ? ");
System.out.println("----------------------------------------");
int q=sc.nextInt();  
int vbc=100;    
int bc=q*vbc;  
int discount=10*bc/100; 
int afterdiscount=bc-discount; 
int gst=18*bc/100; 
int tax=20;
int finalcost=afterdiscount+gst+tax;
System.out.println("");
System.out.println("");
System.out.println("VegBiriyani Cost = "+vbc+ " * "+q+ " = "+bc+"/-Rupees");
System.out.println("GST  = "+gst);
System.out.println("TAX = "+tax);
System.out.println("Your Discount is 10 % = "+discount+"/- Rupees");
System.out.println("After  Discount  Your  Bill is ="+afterdiscount+"/- Rupees");
System.out.println("Your Final Bill is = " +finalcost+ "/-Rupees");
System.out.println("");
System.out.println("Thank You For  Ordering");
System.out.println("");
break;

}//Internal case1 closing
case 2:
{
System.out.println("");
System.out.println("Your  Selected Chicken Fry Biriyani");
System.out.println("");
System.out.println("How Many U Want ? ");
System.out.println("----------------------------------------");
int q1=sc.nextInt();  
int vbc1=250;    
int bc1=q1*vbc1;  
int discount1=10*bc1/100; 
int afterdiscount1=bc1-discount1; 
int gst1=18*bc1/100; 
int tax1=20;
int finalcost1=afterdiscount1+gst1+tax1;
System.out.println("___________________________________");
System.out.println("___________________________________");
System.out.println("VegBiriyani Cost = "+vbc1+ " * "+q1+ " = "+bc1+"/- Rupees");
System.out.println("GST = "+gst1);
System.out.println("TAX = "+tax1);
System.out.println("Your Discount is 10 % = "+discount1+"/- Rupees");
System.out.println("After  Discount  Your  Bill is ="+afterdiscount1+"/- Rupees");
System.out.println("Your Final Bill is = " +finalcost1+"/- Rupees");
System.out.println("_____________________________________");
System.out.println("Thank You For  Ordering");
System.out.println("______________________________________");

break;
}//Internal case2 Closing
case 3:
{
System.out.println("________________________________");
System.out.println("Your  Selected Mutton Fry Biriyani");
System.out.println("___________________________________");
System.out.println("How Many U Want ? ");
System.out.println("----------------------------------------");
int q2=sc.nextInt();  
int vbc2=300;    
int bc2=q2*vbc2;  
int discount2=10*bc2/100; 
int afterdiscount2=bc2-discount2; 
int gst2=18*bc2/100; 
int tax2=20;
int finalcost2=afterdiscount2+gst2+tax2;
System.out.println("___________________________________");
System.out.println("___________________________________");
System.out.println("VegBiriyani Cost = "+vbc2+ " * "+q2+ " = "+bc2+"/- Rupees");
System.out.println("GST = "+gst2);
System.out.println("TAX = "+tax2);
System.out.println("Your Discount is 10 % = "+discount2+"/- Rupees");
System.out.println("After  Discount  Your  Bill is ="+afterdiscount2+"/- Rupees");
System.out.println("Your Final Bill is = " +finalcost2+"/- Rupees");
System.out.println("_____________________________________");
System.out.println("Thank You For  Ordering");
System.out.println("______________________________________");
break;
}//Internal case3 Closing
default:
{
System.out.println("Invalid Option");
}
}//internal switch close
break;
}// main case1 closeing




case 2:
{
System.out.println("____________________________________");
System.out.println("Welcome To Paradise RESTARUNT");
System.out.println("____________________________________");
System.out.println("_____________________________________");
System.out.println("_____________________________________");
System.out.println("****************OUR MENU************");
System.out.println("_____________________________________");
System.out.println("1.Egg Biryani");
System.out.println("2.Chicken Biriyani");
System.out.println("_____________________________________");
System.out.println("*Select Your FAV ITEM");
s1=sc.nextInt();
switch(s1)
{
case 1:
{
System.out.println("_______________________________");
System.out.println("Your Selected Veg Biriyani");
System.out.println("_______________________________");
System.out.println("How Many U Want ? ");
System.out.println("----------------------------------------");
int q3=sc.nextInt();  
int vbc3=120;    
int bc3=q3*vbc3;  
int discount3=20*bc3/100; 
int afterdiscount3=bc3-discount3; 
int gst3=18*bc3/100; 
int tax3=20;
int finalcost3=afterdiscount3+gst3+tax3;
System.out.println("");
System.out.println("");
System.out.println("VegBiriyani Cost = "+vbc3+ " * "+q3+ " = "+bc3+"/-Rupees");
System.out.println("GST  = "+gst3);
System.out.println("TAX = "+tax3);
System.out.println("Your Discount is 20 % = "+discount3+"/- Rupees");
System.out.println("After  Discount  Your  Bill is ="+afterdiscount3+"/- Rupees");
System.out.println("Your Final Bill is = " +finalcost3+ "/-Rupees");
System.out.println("________________________________________");
System.out.println("Thank You For  Ordering");
System.out.println("____________________________________");
break;

}//Internal case1 Closing
case 2:
{
System.out.println("__________________________________________");
System.out.println("Your  Selected Chicken Biriyani");
System.out.println("");
System.out.println("How Many U Want ? ");
System.out.println("----------------------------------------");
int q4=sc.nextInt();  
int vbc4=180;    
int bc4=q4*vbc4;  
int discount4=20*bc4/100; 
int afterdiscount4=bc4-discount4; 
int gst4=18*bc4/100; 
int tax4=20;
int finalcost4=afterdiscount4+gst4+tax4;
System.out.println("___________________________________");
System.out.println("___________________________________");
System.out.println("Chicken Biriyani Cost = "+vbc4+ " * "+q4+ " = "+bc4+"/- Rupees");
System.out.println("GST = "+gst4);
System.out.println("TAX = "+tax4);
System.out.println("Your Discount is 20 % = "+discount4+"/- Rupees");
System.out.println("After  Discount  Your  Bill is ="+afterdiscount4+"/- Rupees");
System.out.println("Your Final Bill is = " +finalcost4+"/- Rupees");
System.out.println("_____________________________________");
System.out.println("Thank You For  Ordering");
System.out.println("______________________________________");
break;
}//Internal case2 Closing

}
break;
}//main case2 switch


case 3:
{
System.out.println("____________________________________");
System.out.println("Welcome To Kruthunga RESTARUNT");
System.out.println("____________________________________");
System.out.println("_____________________________________");
System.out.println("_____________________________________");
System.out.println("****************OUR MENU************");
System.out.println("_____________________________________");
System.out.println("1.Egg Noodles");
System.out.println("2.Chicken Noodles");
System.out.println("3.Double Egg Noodles");
System.out.println("_____________________________________");
System.out.println("Select Your FAV ITEM");
s2=sc.nextInt();
switch(s2)
{
case 1:
{
System.out.println("_______________________________________");
System.out.println("Your Selected Egg Noodles");
System.out.println("_______________________________________");
System.out.println("How Many U Want ? ");
System.out.println("----------------------------------------");
int q6=sc.nextInt();  
int vbc6=60;    
int bc6=q6*vbc6;  
int discount6=5*bc6/100; 
int afterdiscount6=bc6-discount6; 
int gst6=18*bc6/100; 
int tax6=20;
int finalcost6=afterdiscount6+gst6+tax6;

System.out.println("____________________");
System.out.println("____________________");
System.out.println("Egg Noodles Cost = "+vbc6+ " * "+q6+ " = "+bc6+"/-Rupees");
System.out.println("GST  = "+gst6);
System.out.println("TAX = "+tax6);
System.out.println("Your Discount is 5 % = "+discount6+"/- Rupees");
System.out.println("After  Discount  Your  Bill is ="+afterdiscount6+"/- Rupees");
System.out.println("Your Final Bill is = " +finalcost6+ "/-Rupees");
System.out.println("_________________");
System.out.println("Thank You For  Ordering");
System.out.println("___________________________");
break;

}
case 2:
{
System.out.println("________________________________________");
System.out.println("Your  Selected Chicken Noodles");
System.out.println("________________________________________");
System.out.println("How Many U Want ? ");
System.out.println("----------------------------------------");
int q7=sc.nextInt();  
int vbc7=120;    
int bc7=q7*vbc7;  
int discount7=5*bc7/100; 
int afterdiscount7=bc7-discount7; 
int gst7=18*bc7/100; 
int tax7=20;
int finalcost7=afterdiscount7+gst7+tax7;
System.out.println("___________________________________");
System.out.println("___________________________________");
System.out.println("Chicken Noodles Cost = "+vbc7+ " * "+q7+ " = "+bc7+"/- Rupees");
System.out.println("GST = "+gst7);
System.out.println("TAX = "+tax7);
System.out.println("Your Discount is 5 % = "+discount7+"/- Rupees");
System.out.println("After  Discount  Your  Bill is ="+afterdiscount7+"/- Rupees");
System.out.println("Your Final Bill is = " +finalcost7+"/- Rupees");
System.out.println("_____________________________________");
System.out.println("Thank You For  Ordering");
System.out.println("______________________________________");

break;
}
case 3:
{
System.out.println("_______________________________________");
System.out.println("Your  Selected Double Egg Noodles");
System.out.println("_______________________________________");
System.out.println("How Many U Want ? ");
System.out.println("----------------------------------------");
int q8=sc.nextInt();  
int vbc8=100;    
int bc8=q8*vbc8;  
int discount8=5*bc8/100; 
int afterdiscount8=bc8-discount8; 
int gst8=18*bc8/100; 
int tax8=20;
int finalcost8=afterdiscount8+gst8+tax8;
System.out.println("___________________________________");
System.out.println("___________________________________");
System.out.println("Double Egg Noodles Cost = "+vbc8+ " * "+q8+ " = "+bc8+"/- Rupees");
System.out.println("GST = "+gst8);
System.out.println("TAX = "+tax8);
System.out.println("Your Discount is 5 % = "+discount8+"/- Rupees");
System.out.println("After  Discount  Your  Bill is ="+afterdiscount8+"/- Rupees");
System.out.println("Your Final Bill is = " +finalcost8+"/- Rupees");
System.out.println("_____________________________________");
System.out.println("Thank You For  Ordering");
System.out.println("______________________________________");
break;
}
default:
{
System.out.println("Invalid Option");
sc.close();
}//internal switch close
break;
}

}





case 4:
{
System.out.println("____________________________________");
System.out.println("Welcome To Bawarchei RESTARUNT");
System.out.println("_______________________________");
System.out.println("_____________________________________");
System.out.println("****************OUR MENU************");
System.out.println("_____________________________________");
System.out.println("1.Mixed Biryani");
System.out.println("2.Fry Biriyani");
System.out.println("3.Prawn Biriyani");
System.out.println("_____________________________________");
System.out.println("*Select Your FAV ITEM");

s3=sc.nextInt();
switch(s3)
{
case 1:
{
System.out.println("________________________________");
System.out.println("Your Selected Mixed Biriyani");
System.out.println("________________________________");
System.out.println("How Many U Want ? ");
System.out.println("----------------------------------------");
int q9=sc.nextInt();  
int vbc9=200;    
int bc9=q9*vbc9;  
int discount9=10*bc9/100; 
int afterdiscount9=bc9-discount9; 
int gst9=18*bc9/100; 
int tax9=20;
int finalcost9=afterdiscount9+gst9+tax9;
System.out.println("_________________________________");
System.out.println("_____________________________________");
System.out.println("Mixed Biriyani Cost = "+vbc9+ " * "+q9+ " = "+bc9+"/-Rupees");
System.out.println("GST  = "+gst9);
System.out.println("TAX = "+tax9);
System.out.println("Your Discount is 10 % = "+discount9+"/- Rupees");
System.out.println("After  Discount  Your  Bill is ="+afterdiscount9+"/- Rupees");
System.out.println("Your Final Bill is = " +finalcost9+ "/-Rupees");
System.out.println("____________________________________");
System.out.println("Thank You For  Ordering");
System.out.println("___________________________________");
break;

}
case 2:
{
System.out.println("___________________________________");
System.out.println("Your  Selected Fry Biriyani");
System.out.println("___________________________________");
System.out.println("How Many U Want ? ");
System.out.println("----------------------------------------");
int q10=sc.nextInt();  
int vbc10=250;    
int bc10=q10*vbc10;  
int discount10=10*bc10/100; 
int afterdiscount10=bc10-discount10; 
int gst10=18*bc10/100; 
int tax10=20;
int finalcost10=afterdiscount10+gst10+tax10;
System.out.println("___________________________________");
System.out.println("___________________________________");
System.out.println("Fry Biriyani Cost = "+vbc10+ " * "+q10+ " = "+bc10+"/- Rupees");
System.out.println("GST = "+gst10);
System.out.println("TAX = "+tax10);
System.out.println("Your Discount is 10 % = "+discount10+"/- Rupees");
System.out.println("After  Discount  Your  Bill is ="+afterdiscount10+"/- Rupees");
System.out.println("Your Final Bill is = " +finalcost10+"/- Rupees");
System.out.println("_____________________________________");
System.out.println("Thank You For  Ordering");
System.out.println("______________________________________");

break;
}
case 3:
{
System.out.println("______________________________");
System.out.println("Your  Selected Prawn Fry Biriyani");
System.out.println("_________________________________");
System.out.println("How Many U Want ? ");
System.out.println("----------------------------------------");
int q11=sc.nextInt();  
int vbc11=300;    
int bc11=q11*vbc11;  
int discount11=10*bc11/100; 
int afterdiscount11=bc11-discount11; 
int gst11=18*bc11/100; 
int tax11=20;
int finalcost11=afterdiscount11+gst11+tax11;
System.out.println("___________________________________");
System.out.println("___________________________________");
System.out.println("Prawn Biriyani Cost = "+vbc11+ " * "+q11+ " = "+bc11+"/- Rupees");
System.out.println("GST = "+gst11);
System.out.println("TAX = "+tax11);
System.out.println("Your Discount is 10 % = "+discount11+"/- Rupees");
System.out.println("After  Discount  Your  Bill is ="+afterdiscount11+"/- Rupees");
System.out.println("Your Final Bill is = " +finalcost11+"/- Rupees");
System.out.println("_____________________________________");
System.out.println("Thank You For  Ordering");
System.out.println("______________________________________");
break;
}
default:
{
System.out.println("Invalid Option");
}
}//internal switch close
break;
}// main case closeing




case 5:
{
System.out.println("____________________________________");
System.out.println("Welcome To Merideian RESTARUNT");
System.out.println("_____________________________________");
System.out.println("_____________________________________");
System.out.println("****************OUR MENU************");
System.out.println("_____________________________________");
System.out.println("1.Manchurya");
System.out.println("2.Salad");
System.out.println("3.Chicken Biryani");
System.out.println("_____________________________________");
System.out.println("*Select Your FAV ITEM");

s4=sc.nextInt();
switch(s4)
{
case 1:
{
System.out.println("________________________");
System.out.println("Your Selected Manchurya");
System.out.println("___________________________");
System.out.println("How Many U Want ? ");
System.out.println("----------------------------------------");
int q12=sc.nextInt();  
int vbc12=200;    
int bc12=q12*vbc12;  
int discount12=10*bc12/100; 
int afterdiscount12=bc12-discount12; 
int gst12=18*bc12/100; 
int tax12=20;
int finalcost12=afterdiscount12+gst12+tax12;
System.out.println("____________________________________");
System.out.println("____________________________________");
System.out.println("Manchurya Cost = "+vbc12+ " * "+q12+ " = "+bc12+"/-Rupees");
System.out.println("GST  = "+gst12);
System.out.println("TAX = "+tax12);
System.out.println("Your Discount is 10 % = "+discount12+"/- Rupees");
System.out.println("After  Discount  Your  Bill is ="+afterdiscount12+"/- Rupees");
System.out.println("Your Final Bill is = " +finalcost12+ "/-Rupees");
System.out.println("_____________________________________");
System.out.println("Thank You For  Ordering");
System.out.println("___________________________________");
break;

}
case 2:
{
System.out.println("__________________________________");
System.out.println("Your  Selected Salad");
System.out.println("____________________________________");
System.out.println("How Many U Want ? ");
System.out.println("----------------------------------------");
int q13=sc.nextInt();  
int vbc13=250;    
int bc13=q13*vbc13;  
int discount13=10*bc13/100; 
int afterdiscount13=bc13-discount13; 
int gst13=18*bc13/100; 
int tax13=20;
int finalcost13=afterdiscount13+gst13+tax13;
System.out.println("___________________________________");
System.out.println("___________________________________");
System.out.println("Salad Cost = "+vbc13+ " * "+q13+ " = "+bc13+"/- Rupees");
System.out.println("GST = "+gst13);
System.out.println("TAX = "+tax13);
System.out.println("Your Discount is 10 % = "+discount13+"/- Rupees");
System.out.println("After  Discount  Your  Bill is ="+afterdiscount13+"/- Rupees");
System.out.println("Your Final Bill is = " +finalcost13+"/- Rupees");
System.out.println("_____________________________________");
System.out.println("Thank You For  Ordering");
System.out.println("______________________________________");

break;
}
case 3:
{
System.out.println("_________________________________");
System.out.println("Your  Selected Chicken Biryani");
System.out.println("_________________________________");
System.out.println("How Many U Want ? ");
System.out.println("----------------------------------------");
int q14=sc.nextInt();  
int vbc14=300;    
int bc14=q14*vbc14;  
int discount14=10*bc14/100; 
int afterdiscount14=bc14-discount14; 
int gst14=18*bc14/100; 
int tax14=20;
int finalcost14=afterdiscount14+gst14+tax14;
System.out.println("___________________________________");
System.out.println("___________________________________");
System.out.println("Chicken Biriyani Cost = "+vbc14+ " * "+q14+ " = "+bc14+"/- Rupees");
System.out.println("GST = "+gst14);
System.out.println("TAX = "+tax14);
System.out.println("Your Discount is 10 % = "+discount14+"/- Rupees");
System.out.println("After  Discount  Your  Bill is ="+afterdiscount14+"/- Rupees");
System.out.println("Your Final Bill is = " +finalcost14+"/- Rupees");
System.out.println("_____________________________________");
System.out.println("Thank You For  Ordering");
System.out.println("______________________________________");
break;
}
default:
{
System.out.println("Invalid Option");
}
}//internal switch close
break;
}// main closeing

default:
{
System.out.println("Invalid Selection");
}
}
}


public static void main(String[]args)
{
Zomato z=new Zomato();
z.Order();
}


}
