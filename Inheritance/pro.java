 class Shape
{
void area()
{
System.out.println("area");
}
}
class Rectangle extends Shape
{
double l;
double b;
Rectangle(double l,double b)
{
this.l=l;
this.b=b;
}
void area()
{
double result= l*b;
System.out.println("Rectangle" + result);
}
}
class Circle extends Shape
{
double r;
Circle(double r)
{
this.r=r;
}
void area()
{
double result =3.14*r*r;
System.out.println("Circle " + result);
}
}
class Triangle extends Shape
{
double b,h;
Triangle(double b,double h)
{
this.b=b;
this.h=h;
}
void area()
{
double result =0.5*b*h;
System.out.println("Triangle" +result);
}
}
public class pro
{
      public static void main(String[] args)
    {
       Rectangle r = new Rectangle(5, 4);
        r.area();
        Circle c = new Circle(5);
        c.area();

        Triangle t = new Triangle(6, 3);
        t.area();

    } 
} 

