package teletact.ja006;

public class DataStructure {

    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        for (int i=0; i < SIZE; i++){
            arrayOfInts[i] = i;
        }
    }

    public void printEven(){
        DataStructureIterator iterator = this.new EvenIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {}

    // The iterator has direct access to arrayOfInts
    // because it is a non-static inner class
    private class EvenIterator implements DataStructureIterator{
        private int nextIndex=0;
        public boolean hasNext(){
            return (nextIndex <= SIZE -1);
        }
        public Integer next(){
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
    
}
