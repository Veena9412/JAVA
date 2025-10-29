abstract class abst{
    abstract void compute(int n);
    abstract void display();
    void statement(){
        System.out.println("This class is a abstract class used for mathematical computation");

    }
}
class fact extends abst{
    int res=1;
    int num=0;
    void compute(int n){
        num=n;
        for(int i=n;i>=1;i--){
            res*=i;
        }
    }
    void display(){
        System.out.println("Factorial of a number "+num+ " is:"+res);
    }
    

}
class power3 extends abst{
    int res=1;
    int num=0;
    void compute(int n){
        num=n;
        for(int i=3;i>=1;i--){
            res*=n;
        }
    }
    void display(){
        System.out.println(num+" power 3 is:"+res);
    }
    

}
public class abstractclass{
    public static void main(String[] args) {
        abst fact1 = new fact();
        fact1.compute(5);
        fact1.display();
        abst power3_1 = new power3();
        power3_1.compute(5);
        power3_1.display();
    }
}