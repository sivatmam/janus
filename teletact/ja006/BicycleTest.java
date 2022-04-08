package teletact.ja006;

public class BicycleTest {

    public static void main(String[] args) {
        Bicycle b1 = new Bicycle(1,5,5);
        Bicycle b2 = new Bicycle(1,10,10);
        Bicycle b3 = new Bicycle(1,15,15);

        System.out.println("b1: "+b1.getId());
        System.out.println("b2: "+b2.getId());
        System.out.println("b3: "+b3.getId());
    }
    
}
