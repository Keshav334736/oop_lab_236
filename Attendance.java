import java.util.Scanner;
public class Attendance{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int workingdays;
int totalworkingdays=100;
int attendance;
int i;
for(i=1; i<=2; i++){
if(i==1){
System.out.println("Enter the working days of student a:");
}
else{
System.out.println("Enter the working days of student b:");
}
workingdays=input.nextInt();
attendance=(workingdays*100)/totalworkingdays;
if(attendance>=75){
System.out.println("Eligible for giving exam");
}
else{
System.out.println("Not Eligible for giving exam");
}
}
}
}
