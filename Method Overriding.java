class first{
    first(){
        System.out.println("This is the parent class constructor");
    }
    void display(){
        System.out.println("This is display method of parent class");
    }
}
class second extends first{
    second(){
        System.out.println("This is subclass constructor");
    }
    void display(){
        System.out.println("This is the overridden method display ");
    }
}
class third extends second{
    void display (){
        System.out.println("the next overridden method");
    }
}
public class Main {
    public static void main(String[] args) {
//        third t = new third();
//        t.display();
        second s = new second();
        s.display();

    }
}
