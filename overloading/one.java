public class one{
int ssr(int a,int b){
return a+b/2;
}
int ssr(int a,int b,int c){ //overloading
return a+b+c/3;
}
public static void main(String[] args){
one obj=new one();
System.out.println("The average of two numbers is:"+obj.ssr(10,20));
System.out.println("The average of three numbers is:"+obj.ssr(10,20,30));
}
}


