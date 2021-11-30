interface A{
void meth1();
void meth2();
}
interface B extends A{
void meth3();
}
interface just{
void just1();
}
class C{
String name;
double roll;
C(){

}
C(String name,double roll){
this.name = name;
this.roll = roll;
}
void display(){
System.out.println("Display method and values of name and roll are: "+name+" "+roll);
}
}
abstract class D{
abstract void dispplay();
abstract void show();
}
class myclass extends C implements B{
myclass(){
super("PALLAVI",100.00);
}
public void meth1(){
System.out.println("meth1 of B");
}
public void meth2(){
System.out.println("meth2 of B");
}
public void meth3(){
System.out.println("meth3 of B");
}
}
class herclass extends D implements just{
public void just1(){
System.out.println("just of just");

}
void dispplay(){
System.out.println("display of D");
}
void show(){
System.out.println("show of D");
}
}
public class inter_1 {
public static void main(String[] args) {
myclass obj1 = new myclass();
obj1.meth1();
obj1.meth2();
obj1.meth3();
obj1.display();
herclass h = new herclass();
h.dispplay();
h.show();
h.just1();

// TODO Auto-generated method stub

}

}
