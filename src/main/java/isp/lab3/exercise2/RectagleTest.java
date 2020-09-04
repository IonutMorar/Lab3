package isp.lab3.exercise2;

public class RectagleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        Rectangle rectangle1 = new Rectangle(5,6,"green");
        System.out.println("Length is: "+rectangle1.getLength());
        System.out.println("Width is: "+rectangle1.getWidth());
        System.out.println("Color is: "+rectangle1.getColor());
        System.out.println("Perimeter is: "+rectangle1.getPerimeter());
        System.out.println("Area is: "+rectangle1.getArea());
        System.out.println("Length is: "+rectangle.getLength());
        System.out.println("Width is: "+rectangle.getWidth());
        System.out.println("Color is: "+rectangle.getColor());
        System.out.println("Perimeter is: "+rectangle.getPerimeter());
        System.out.println("Area is: "+rectangle.getArea());
    }
}
