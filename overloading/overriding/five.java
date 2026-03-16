class bus{
void method(){
System.out.println("Bus has four wheels");
}
}
class motorbike extends bus{
void method(){
System.out.println("Motorbike has two wheels");
}
}
public class five{
public static void main(String[] args){
bus b=new bus();
b.method();
motorbike m=new motorbike();
m.method();
}
}