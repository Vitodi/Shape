public class Main {
    public static void main(String[] args) {
        Desk desk = new Desk();
        Triangular triangular = new Triangular(1, 2, 2.2, 3.1, 5, 7);
        triangular.getPerimeter();
        System.out.println(triangular.getArea());
        Circle circle = new Circle(1, 2, 8, 7);
        circle.getArea();
        desk.DeskInputP1(triangular);
        desk.DeskInputP2(circle);
        System.out.println("--------");
//desk.info();
        System.out.println(desk.deskP1.get(0).name);
    }


}
