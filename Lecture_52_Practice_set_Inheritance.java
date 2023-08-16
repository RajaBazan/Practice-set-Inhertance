package hello.com;
class Circle{
    public int radius;
    Circle(){
        System.out.println("I'm not parameter of circle");
    }
    Circle(int r){
        System.out.println("I'm a perameter of circle");
        this.radius = r;
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h){
        super(r);
        System.out.println("I'm cylinder parameter");
        this.height = h;
    }

    public double volume(){
        return Math.PI * this.radius * this.radius *this.height;
    }
}
public class Lecture_52_Practice_set_Inheritance {
    public static void main(String[] args) {
        // Problem#1:
        Circle cir = new Circle(12);
        Cylinder cy = new Cylinder(12, 13);
        cy.volume();
        System.out.println(cy.volume());
        System.out.println(cir.area());
    }
}
