package teletact.ja005;

public class StateTest {

    public static void main(String[] args) {
        State NY = new State("New York", "Albany", "New York City", "Rochester", "Buffalo", "Syracuse");
        State OH = new State("Ohio", "Columbus", "Cleveland", "Cincinatti", "Dayton", "Toledo");
        State IN = new State("Indiana", "Indianopolis");
        System.out.println(NY);
        System.out.println(OH);
	System.out.println(IN);
    }
    
}
