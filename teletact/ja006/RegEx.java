package teletact.ja006;

public class RegEx {

    public static void main(String[] args) {
        String regex = "[^0-9]";
        String test = "rgie34sd92A+-$";
        String out = test.replaceAll(regex, "");

        System.out.println(out);
    }
    
}
