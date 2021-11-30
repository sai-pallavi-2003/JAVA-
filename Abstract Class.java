abstract class Shape{
    float i,j;
    abstract void printArea();
}
class Rectangle extends Shape{
    Rectangle(float i, float j){
        this.i = i;
        this.j = j;
    }
    void printArea(){
        System.out.println(i*j);
    }
}
class Triangle extends Shape{
    Triangle(float i,float j){
        this.i = i;
        this.j = j;
    }
    void printArea(){
        System.out.println(0.5*i*j);
    }

}
class Circle extends Shape{
    Circle(float i){
        this.i = i;
    }
    void printArea(){
        System.out.println(3.14*i*i);
    }
}
public class Main {
    public static void main(String[] args) {
        Shape s;
        s = new Rectangle(2,3);
        s.printArea();
        s = new Triangle(2,3);
        s.printArea();
        s = new Circle(2);
        s.printArea();

	// write your code here
    }
}
