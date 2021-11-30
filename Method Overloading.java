public class method_overloading{
    public static void main(String [] args){
        Demo d = new Demo();
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        System.out.println("the sum of two integers is: "+ d.add(2,3));
        System.out.println("The sum of two integers by taking input is: "+d.add(m,n));
        // System.out.println("the sum of two integers is: "+ d.add(2,3.5));
        System.out.println("the sum of two integers is: "+ d.add(2.5,3.5));
        // System.out.println("the sum of two integers is: "+ d.add(2.55,3));
        
    }
}
class Demo{
    public int add(int i, int j){
        return (i+j);
    }
    // public double add(int i, float j){
    //     return(i+j);
    //here this will not work because the return datatype is not as same as the datatypes of variables
    // }
    public double add (double a, double b){
        return(a+b);
    }
    // public float add(double a, int b){
    //  
    // return(a+b);
    // even this will show error 
    // }
}
