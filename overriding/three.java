class parent{
void method(){
System.out.println("Parent is speaking");
}
}
class child extends parent{
@Override
void method(){  //overriding
System.out.println("Child is speaking");
}
}
public class three{
public static void main(String[] args){
parent objp=new child();
objp.method();
}
}

