import java.util.ArrayList;


public class Desk {

    ArrayList<Shape> deskP1 = new ArrayList();
    ArrayList deskP2 = new ArrayList();
    ArrayList deskP3 = new ArrayList();
    ArrayList deskP4 = new ArrayList();

    public Desk (){
    }

    public void DeskInputP1(Shape shape){
        deskP1.add(shape);
    }
    public void DeskInputP2(Shape shape){
        deskP2.add(shape);
    } public void DeskInputP3(Shape shape){
        deskP3.add(shape);
    } public void DeskInputP4(Shape shape){
        deskP4.add(shape);
    }

    public void DeskDeleteP1(){
        deskP1.remove(0);
    }
    public void DeskDeleteP2(){
        deskP2.remove(0);
    }
    public void DeskDeleteP3(){
        deskP3.remove(0);
    }
    public void DeskDeleteP4(){
        deskP4.remove(0);
    }

    @Override
    public String toString() {
        return "Desk{" +
                "deskP1=" + deskP1 +
                '}';
    }

    public void info(){
        "Desk{" +
                "deskP1=" + deskP1 +'}';

    }
}
