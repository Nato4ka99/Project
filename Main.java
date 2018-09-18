public class Main {

    public static void main(String[] args) {

        Figura square = new Square(4);
        System.out.println(square.toString());

        Figura triangle = new Triangle(5, 6, 7);
        System.out.println(triangle.toString());

        Figura rectangle = new Rectangle(7, 13);
        System.out.println(rectangle.toString());

        Figura circle = new Circle(8);
        System.out.println(circle.toString());



    }

}
