package isp.lab3.exercise4;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint point = new MyPoint(1,2,3);
        MyPoint mypoint = new MyPoint();
        System.out.println("First point: "+mypoint);
        System.out.println("Second point: "+point);
        point.setX(2);
        System.out.println("x = "+point.getX());
        point.setY(4);
        System.out.println("y = "+point.getY());
        point.setZ(6);
        System.out.println("z = "+point.getZ());
        mypoint.setXYZ(5,6,7);
        System.out.println(mypoint.toString());
        System.out.println("Distance: " +point.distance(4,4,4));
        System.out.println("Distance from first to second point: "+point.distance(mypoint));
    }
}
