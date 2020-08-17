import java.util.*;
class Circle{
    private double radius = 20;
    private String color = "red";
    double area;
    Circle(){

    }
    Circle(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return (3.14*radius*radius);
    }
}
 class assignment4{
    public static void main(String[] args) {
        Circle c = new Circle();
        Circle c1 = new Circle(5.0);
        System.out.println(" Radius:" + c.getRadius());
        System.out.println((" Area:"+ c.getArea()));
        System.out.println("UserRadius:" + c1.getRadius());
        System.out.println("User Area:" + c1.getArea());
    }
}