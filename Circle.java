public class Circle extends Shape {
    private double r;
    String name = "Circle";

    public Circle(double x, double y, double x1, double y1) {
        super(x, y, x1, y1);

    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        r=Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + (Math.pow(p1.getY() - p2.getY(), 2)));
        double square = Math.PI*Math.pow(r,2);
        System.out.println(square);
        return square;
    }
}
