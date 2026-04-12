class EncapsulationDemo {
    private int ssn;   // declaring the private variable
    private int empage;
    private String empname;

    public int getEmpSSN(){
        return ssn;
    }
    public int getEmpAge(){
        return empage;
    }
    public String getEmpName(){
        return empname;
    }
    public void setEmpSSN(int newValue){
        ssn=newValue;
    }
    public void setEmpAge(int newValue){
        empage=newValue;
    }
    public void setEmpName(String newValue){
        empname=newValue;
    }
}
public class EncapsTest{
    public static void main(String[] args) {
        EncapsulationDemo obj=new EncapsulationDemo();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setEmpSSN(112211);
        System.out.println("Employee Name:"+obj.getEmpName());
        System.out.println("Employee Age:"+obj.getEmpAge());
        System.out.println("Employee SSN ID:"+obj.getEmpSSN());
    }
}
