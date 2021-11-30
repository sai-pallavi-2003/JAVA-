class A{
    private int x = 10;
    int w =40;
    String name ="a";
    A(){
        System.out.println("The value of x from constructor is: "+x);
        System.out.println("The value of name is:  "+name);
    }
    A(int i, int j){
        System.out.println("value of i and j are: "+i+" "+j);
    }
    void display(){
        System.out.println("this is display method of parent class A");
        System.out.println("The value of x from method display is: "+x);
    }
}
class B extends A{
    private int y =20;
    int z =30;
    String nameb = "b";
    B(){
        super(10,20);
        System.out.println("this is constructor of class B");
        System.out.println("the value of nameb is: "+nameb);
        System.out.println("value of y is :"+y);
        System.out.println("value of w is :"+w);
    }
    B(float a, float b){
        System.out.println("value of a and b are: "+a+" "+b);
    }
    void display(){
        System.out.println("this is display method of class B");
    }
}
class D extends A{
    D() {
        super(10, 20);
        System.out.println("this is constructor of class D");
        System.out.println("value of w is :" + w);
//        System.out.println("value of p is :"+p);
    }
        void showw(){
            System.out.println("method of D");
        }
}
class C extends B{
    int p = 50;
    C() {
        super(10,20);
        System.out.println("this is constructor of class C");
        System.out.println("value of w is :" + w);
        System.out.println("value of z is :" + z);
    }
    C(int i){
        System.out.println("Value of i is: "+i);
    }
}
public class Main {
    public static void main(String[] args) {
        A obja = new A();
        obja.display();
//        obja.showw();
        B objb = new B();
        objb.display();
        D objd = new D();
        objd.display();
        C objc = new C(5);
//        objc.(5);
        objc.display();
	// write your code here
    }
}
