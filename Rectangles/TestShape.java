public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape("blue", false);
        System.out.println(s1);

        Circle c1 = new Circle(2.0, "yellow", true);
        System.out.println(c1);
        System.out.println("Area=" + c1.getArea() + ", Perimeter=" + c1.getPerimeter());

        Rectangle r1 = new Rectangle(2.0, 4.0, "green", false);
        System.out.println(r1);
        System.out.println("Area=" + r1.getArea() + ", Perimeter=" + r1.getPerimeter());

        Square sq1 = new Square(5.0, "purple", true);
        System.out.println(sq1);
        sq1.setSide(10.0);
        System.out.println("After resizing: " + sq1);
    }
}
