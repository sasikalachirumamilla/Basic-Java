class Character{
String txt;
  
void print(){
txt = "JVM";
System.out.println(txt+"\t"+"Run\tJava\tProgram");
}
  
public static void main(String[] args) {
Character c=new Character();
c.print();
}
}