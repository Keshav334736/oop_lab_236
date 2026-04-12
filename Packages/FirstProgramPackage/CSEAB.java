package FirstProgramPackage;
public class CSEAB {
    int num1,num2;
    public CSEAB(int n,int m) {
        num1=n;
        num2=m;
    }
    public void getmax(){
        if(num1>num2){
            System.out.println("Maximum number is:"+num1);
        }
        else{
            System.out.println("Maximum number is:"+num2);
        }
    }
public static void main(String[] args) {
    CSEAB bright=new CSEAB(5,8);
    bright.getmax();    
}
}