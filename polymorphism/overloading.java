public class overloading {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add(int a, int b, int c, int  d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        overloading obj=new overloading();
        System.out.println("The sum of 2 and 3 is: " + obj.add(2,3));
        System.out.println("The sum of 2, 3 and 4 is: " + obj.add(2,3,4));
        System.out.println("The sum of 2, 3, 4 and 5 is: " + obj.add(2,3,4,5));
    }
}