abstract class Quadrangle extends Figura {

    private String nameFigura = "Shape";

        public String toString() {
        return "Area of " + nameFigura + " =: " +
                getArea() + " and Perimetr =:  " + getPerimetr();
    }
}
