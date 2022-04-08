package teletact.ja006;

public class DataArtist {

    private int a;

    public DataArtist(){
        this.a = 5;
    }
    public DataArtist(int a){
        this.a = a;
    }


    // Examples of an overloaded method
    // Each has a different signature
    public void draw(String s){

    }
    public void draw(int i){

    }
    public void draw(double f){

    }
    public void draw(int i, double f){

    }
    
}
