public class constructor_overloading{
    public static void main(String[] args){
        add one = new add();
        System.out.println("The sum for default constructor is: "+one.addition());
        add two = new add(3.50,2.50);
        System.out.println("The sum of first constructor is: "+two.addition());
        add three = new add(2,5);
        System.out.println("The sum of second constructor is: "+three.addition());
    }
}
class add{
    double i,j;
    public add(){
         i = 10;
          j= 20;
    }
    public add(double i, double j){
        this.i=i;
        this.j=j;
    }
    public add(int i, int j){
        this.i=i;
        this.j=j;
    }
    public double addition(){
        // double z,e;
        return (i+j);
    }
}
