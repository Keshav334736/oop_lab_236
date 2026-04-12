class Temperature{
    private double celsius;
    Temperature(double celsius){
        this.celsius=celsius;
    }
    public double getCelsius(){
        return celsius;
    }
    public double getFahrenheit(){
        return (celsius*9/5)+32;
    }
}
public class Temp{
    public static void main(String[] args) {
        Temperature t=new Temperature(25);
        System.out.println("Temperature in celsius:"+t.getCelsius());
        System.out.println("Temperature in Fahrenheit:"+t.getFahrenheit());
    }

}