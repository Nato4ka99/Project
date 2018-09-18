public class Rectangle extends Quadrangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

          double getPerimetr() {
        return (this.a + this.b) * 2;
    }

        double getArea() {
        return this.a * this.b;
    }
    public String toString() {
        return "Perimetr R is equal to : " + getPerimetr() + "Area R is equal to : " + getArea();
    }
}
