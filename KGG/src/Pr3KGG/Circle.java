package Pr3KGG;

public class Circle {

    private double r;
    private Point p;
    public Circle(Point point,double r){
        this.p=point;
        this.r=r;
    }

    public double getR() {
        return r;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getPerimetr() {return 2 * Math.PI * this.getR();}
    public String toString(){
        return "Circle{" + "x=" + p.getX() + ", \ny=" + p.getY() + ",\n r=" + r + '}';
    }
}
