public class divs {
    int ssr(int a, int b){
        return a/b;
    }
    int ssr(int a, int b, int c){
        return (a+b)/c;
    }  
public static void main(String[] args) {
    divs d=new divs();
    System.out.println("The division of 10 and 5 is:"+d.ssr(10,5));
    System.out.println("The sum of 10 and 5 divided by 3 is :"+d.ssr(10,5,3));
}
}