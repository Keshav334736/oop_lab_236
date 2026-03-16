public class two{
public int ssr(int a,int b){
return a+b;
}
public int ssr(int a,int b,int c){  //overloading
return a+b+c;
}
public static void main(String[] args){
two obj=new two();
System.out.println("The sum of two numbers is:"+obj.ssr(10,20));
System.out.println("The sum of three numbers is:"+obj.ssr(10,20,30));
}
}
