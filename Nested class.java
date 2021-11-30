class outerclass{
    int x =10;
    outerclass(){
        innerclass obj = new innerclass();
        obj.display();
        nested_class obj2 = new nested_class();
        obj2.showw();
    }
    void display(){
        System.out.println("This is the display method of outerclass");
//        System.out.println("Value of y is: "+y); we cannot access innerclass variables from outerclass methods
//        this.display();
    }
    class innerclass{
        int y =20;
        void display(){
            System.out.println("This is display method of innerclass");
            System.out.println("The value of outer class variable x is: "+x);
            //but we can access outerclass variables from innerclass
            System.out.println("Value of y is: "+y);
        }
    }
    static int z =30;
    int p =400;
    static class nested_class{
        static void show(){
            System.out.println("The value of static integer z from static nested class is: "+z);
        }
        static void showw(){
            System.out.println("this is to test static from outer");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        outerclass obj1 = new outerclass();
        obj1.display();
        //creating object for outerclass
        //the mainclass constructors are called first that is whenever we create an object in main for any class its
        //constructor is called first
        outerclass.nested_class.show();
        //not creating object for  static nested class
    }
}
