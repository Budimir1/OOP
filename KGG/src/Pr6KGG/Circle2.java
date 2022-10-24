package Pr6KGG;



public class Circle2 {
    private double r;
    private Point p;
    public void Circle2(double r) {
        Point p = new Point(2.2,2.2);
        this.p = p;
        this.r = r;
    }
    public Point getP() {
        return p;
    }
    public void setP(Point p) {
        this.p = p;
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double getLength() {
        return 2 * Math.PI * this.getR();
    }
    public double getSquare(){
        return Math.PI * Math.pow(this.getR(),2);
    }
    public String toString() {
        return "Circle{" +  ",\n r=" + r + "\nlength = " + getLength() + "\nsquare = " + getSquare() + '}';
    }
}

