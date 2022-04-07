package teletact.ja005;

public class RangeTest {

    public static void main(String[] args){
      Range r = new Range(2, 4);
      System.out.println("Range: "+r);

      try{
        
        Range r2 = new Range(5, 1);
        System.out.println(r2);

      }catch(Exception e){
          System.err.println("Caught a buggy bug.");
          System.err.println(e);
      }

      
    }
    
}
