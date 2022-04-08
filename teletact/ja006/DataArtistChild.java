package teletact.ja006;

public class DataArtistChild extends DataArtist{
    
    

    private class Point{
        int x;
        int y;
        public Point(int x, int y){ this.x=x; this.y=y;}
    }
    private class Polygon{
        Point[] points;
        public Polygon(Point... points){
            this.points = points;
        }
        public String toString(){
            String out = "";
            for (Point point : points){
                out = out + "x: "+point.x+" y: "+point.y+" ";
            }
            return out;
        }
    }

    public static void main(String[] args){
        
        
        DataArtistChild dac = new DataArtistChild();
        Polygon mypoly = dac.new Polygon(dac.new Point(3,4), dac.new Point(0,0), dac.new Point(0,4));
        System.out.println(mypoly);
    }
}
