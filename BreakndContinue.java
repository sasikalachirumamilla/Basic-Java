class Breakndcontinue{

void stmt()
{
int i=1;
while(i<10){
System.out.println(i);
i++;
if(i==6){
break;
}}}

void stmts()
{
int i=1;
while(i<10){
if(i==3){
i++;
continue;
}
System.out.println(i);
i++;

}}

public static void main(String[] args)
{
Breakndcontinue bc= new Breakndcontinue();
bc.stmt();
bc.stmts();
}
}
