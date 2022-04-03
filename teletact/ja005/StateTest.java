package teletact.ja005;

public class StateTest {

    public static void main(String[] args) {
        State NY = new State("New York", "Albany", "New York City", "Rochester", "Buffalo", "Syracuse");
        State OH = new State("Ohio", "Columbus", "Cleveland", "Cincinatti", "Dayton", "Toledo");

        System.out.println(NY);
        System.out.println(OH);
    }
    
}
