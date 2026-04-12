class Info {
    private String Name; //Private Variable
    private int Age;     //Private Variable

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public int getAge(){
        return Age;
    }
    public void setAge(int Age){
        if(Age>0){
            this.Age=Age;
        }
        else{
            System.out.println("Invalid age! age cannot be in negative");
        }

    } 
}
public class one{
    public static void main(String[] args) {
        Info obj=new Info();
        obj.setName("Keshav");
        obj.setAge(19);
        System.out.println("Student Name:"+obj.getName());
        System.out.println("Student Age:"+obj.getAge());
        obj.setAge(-19);
    }
}
