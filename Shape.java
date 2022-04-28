
public abstract class Shape {
    Point p1, p2, p3, p4, p5, p6;
    String name;

    // Конструкторы

    public Shape(double x, double y, double x1, double y1) {
        p1 = new Point(x, y);
        p2 = new Point(x1, y1);


    }
    public Shape(double x, double y, double x1, double y1, double x2, double y2) {
        p1 = new Point(x, y);
        p2 = new Point(x1, y1);
        p3 = new Point(x2, y2);

    }
    public Shape(double x, double y, double x1, double y1, double x2, double y2, double x3, double y3) {
        p1 = new Point(x, y);
        p2 = new Point(x1, y1);
        p3 = new Point(x2, y2);
        p4 = new Point(x3,y3);

    }




    public abstract double getPerimeter();
     public abstract double getArea();

}
