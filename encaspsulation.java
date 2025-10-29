 /*Encapsulation refers to binding the similar data together and restricting the data access directly*/
 class encaps{
    private int bankid;
    private float balamount;
    private float salary;
    public void setbankid(int bankid){
        this.bankid=bankid;

    }
    public void setbalamount(float balamount){
        this.balamount=balamount;

    }
    public void setsalary(float salary){
        this.salary=salary;

    }
    public int getbankid(){
        return bankid;

    }
    public float getbalamount(){
        return balamount;

    }
    public float getsalary(){
        return salary;

    }
    public boolean loaneligibility(float salary, float bal, int period){
        if(salary*bal*period>salary*period){
            return true;
        }
        return false;

    }


}
public class encaspsulation {
    public static void main(String[] args) {
        encaps obj1 = new encaps();
        obj1.setbankid(1);
        obj1.setsalary(5000);
        obj1.setbalamount((10000));
        int bid=obj1.getbankid();
        float sal=obj1.getsalary();
        float bal=obj1.getbalamount();
        System.out.println(obj1.loaneligibility(sal,bal,10));
    }
}
