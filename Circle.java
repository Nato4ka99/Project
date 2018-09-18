public class Circle extends Figura {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    double getPerimetr() {
        return 2 * this.r * P;
    }

    double getArea() {
               return this.r * this.r * P;
    }
    public String toString() {
        return "Length C is equal to : " + getPerimetr() + "Area C is equal to : " + getArea();
    }

}
