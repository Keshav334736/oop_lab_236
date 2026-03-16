class car{
void method(){
System.out.println("car has speed");
}
}
class sportscar extends car{
void method(){
System.out.println("Sports car has more speed");
}
}
public class four{
public static void main(String[] args){
car s=new car();
s.method();
sportscar sb=new sportscar();
sb.method();
}
}
