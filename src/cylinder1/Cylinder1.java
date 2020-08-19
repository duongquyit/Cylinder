package cylinder1;

import static java.lang.Math.pow;

class Circle{
    protected double radius;
    protected String color;
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(int radius){
        this.radius = radius;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public double getAera(){
        return pow(radius,2)*3.14;
    }
    
    @Override
    public String toString(){
        return ("Circle[radius=" + radius + ",Color=" + color);
    }
}

class Cylinder extends Circle{
    private double height;
    public Cylinder(){
        this.height = 1.0;
    }
    
    public Cylinder(double radius){
        this.radius = radius;
    }
    
    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    
    public Cylinder(double radius, double height, String color){
        this.radius = radius;
        this.height = height;
        this.color = color;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getVolume(){
        return height*3.14*pow(radius,2);
    }
}

public class Cylinder1 {

    public static void main(String[] args) {
        Cylinder a = new Cylinder(4.3,3,"red");
        System.out.println(a.toString());
    }

}
