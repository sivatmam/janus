package teletact.ja004;

public class PointTest {

    public static void main(String[] args){

        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 6);
        Point p3 = new Point(3, 4);

        System.out.println("p1: "+p1);
        System.out.println("p2: "+p2);
        System.out.println("p3: "+p3);

        System.out.print("Does p1 equal p2? ");
        System.out.println(p1.equals(p2));

        System.out.print("Does p1 equal p3? ");
        System.out.println(p1.equals(p3));

    }
    
}
