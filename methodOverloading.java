/*This code represents the Method Overloading concept in Java
 Method Overloding is the concept where we can define multiple methods with the same name but they differ in:
 1. Number of rguments
 2. Data type of arguments
 3. Order of arguments */
class overloading{
    int a,b,c;
    double d,e,f;
    overloading(int a, int b, int c, double d, double e, double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    double sum(double d, double e){
        return d+e;
    }
    double sum(double d, double e, double f){
        return d+e+f;
    }

}
public class methodOverloading {
    public static void main(String[] args) {
        overloading obj1= new overloading(10,20,30,10.5,20.5,30.5);
        System.out.println(obj1.sum(10,20));
        System.out.println(obj1.sum(10,20,30));
        System.out.println(obj1.sum(10.5,20.5));
        System.out.println(obj1.sum(10.5, 20.5, 30.5));

    }
}
