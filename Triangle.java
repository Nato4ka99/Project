public class Triangle extends Figura {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getPerimetr() {
        return this.a + this.b + this.c;
    }

    double getArea() {
        return Math.sqrt(((this.a + this.b + this.c) / 2) * ((this.a + this.b + this.c) / 2 - this.a) *
                ((this.a + this.b + this.c) / 2 - this.b) * ((this.a + this.b + this.c) / 2 - this.c));
    }

    public String toString() {
        return "Perimetr T is equal to : " + getPerimetr() + "Area T is equal to : " + getArea();
    }

}
