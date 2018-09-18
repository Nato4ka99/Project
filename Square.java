public class Square extends Figura {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    double getPerimetr() {

        return this.a * 4;
    }

    double getArea() {
        return this.a * this.a;
    }
    public String toString() {
        return "Perimetr S is equal to : " + getPerimetr() + "Area S is equal to : " + getArea();
    }
}
