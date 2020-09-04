package isp.lab3.exercise4;

public class MyPoint {
    private int x, y, z;

    public MyPoint() {
    }

    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public double distance(int x, int y, int z) {
        double distance = Math.pow((Math.pow(x - this.x, 2) +
                Math.pow(y - this.y, 2) +
                Math.pow(z - this.z, 2) * 1.0), 0.5);
        return distance;
    }

    public double distance (MyPoint another){
        double distance = Math.pow((Math.pow(x - another.x, 2) +
                Math.pow(y - another.y, 2) +
                Math.pow(z - another.z, 2) * 1.0), 0.5);
        return distance;
    }
}
