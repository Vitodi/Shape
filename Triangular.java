public class Triangular extends Shape {


    private double A, B, C;
    private double square;
    private double perimetr;
    String name = "Triangle";


    public Triangular(double x, double y, double x1, double y1, double x2, double y2) {
        super(x, y, x1, y1, x2, y2);
    }

    @Override
    public double getPerimeter() {

        A = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + (Math.pow(p1.getY() - p2.getY(), 2)));
        B = Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + (Math.pow(p2.getY() - p3.getY(), 2)));
        C = Math.sqrt(Math.pow(p3.getX() - p1.getX(), 2) + (Math.pow(p3.getY() - p1.getY(), 2)));
        perimetr = (A + B + C) / 2;
        return perimetr;
    }

    @Override
    public double getArea() {
        square = Math.sqrt(perimetr * (perimetr - A) * (perimetr - B) * (perimetr - C));
        return square;
    }


    /*double a1 = getA()[0];
    double a2 = getA()[1];
    double b1 = getB()[0];
    double b2 = getB()[1];
    double c1 = getC()[0];
    double c2 = getC()[1];*/
}
