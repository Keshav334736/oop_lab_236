package SecondProgramPackage;
import FirstProgramPackage.CSEAB;
public class Demo {
    public static void main(String[] args) {
        int n=10,m=10;
        CSEAB bright=new CSEAB(n,m);
        if(n!=m){
            bright.getmax();
        }
        else{
            System.out.println("Both numbers are same ");
        }
    }
    
}
