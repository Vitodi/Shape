public class Square extends Shape {

    private double A, B, C, D;
    private double square;
    private double perimetr;
    String name = "Square";
    public Square(double x, double y, double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x, y, x1, y1, x2, y2, x3, y3);
    }

    @Override
    public double getPerimeter() {
        A = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + (Math.pow(p1.getY() - p2.getY(), 2)));
        B = Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + (Math.pow(p2.getY() - p3.getY(), 2)));
        C = Math.sqrt(Math.pow(p3.getX() - p4.getX(), 2) + (Math.pow(p3.getY() - p4.getY(), 2)));
        D = Math.sqrt(Math.pow(p4.getX() - p1.getX(), 2) + (Math.pow(p4.getY() - p1.getY(), 2)));
        perimetr = A + B + C+ D;

        return perimetr;
    }

    @Override
    public double getArea() {
        square = A*B;
        return square;
    }
}
