package teletact.ja004;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getx(){return x;}
    public int gety(){return y;}

    @Override
    public String toString(){
        return "x: "+String.valueOf(x)+ " y: "+String.valueOf(y);
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof Point){
          Point p = (Point) o;
          if ((this.x == p.getx()) && (this.y == p.gety())) return true;
          else return false;

        } else return false;

    }
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + this.x;
        hash = 23 * hash + this.y;
        return hash;
    }
    
}
