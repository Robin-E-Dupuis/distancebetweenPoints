//author Robin Dupuis

public class MyPoint {
private double x;
private double y;
    public MyPoint() {
        this.x=0.0;
        this.y=0.0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double distance(double x,double y){
        
         MyPoint point = new MyPoint(0,0);
        double distance = 0.0;
       double xDistance= point.x+MyPoint.this.x;
       double yDistance= point.y+MyPoint.this.y;
       
      distance = xDistance+yDistance;

        return distance;
        
    }
    public double distance(MyPoint point, double x, double y){
        double distance = 0.0;
        point.getX();
        point.getY();
        double xDistance = point.getX()+x;
      
        double yDistance = point.getY()+y;
        
        double distancebetweentwopoints= point.getY()-y;
        double dist = distancebetweentwopoints*-1;
          
          
          double distancebetweenx = point.getX()-x;
          double distx = distancebetweenx*-1;
          System.out.println("Distance between the two x's "+distx+" between the two y's "+dist);
          
        distance = distx+dist;
        
        return distance;
    }
    public static void main(String[] args) {
        MyPoint mypoint = new MyPoint(4,5);
       
        System.out.println("Total distance between origin and the point mypoint is "+ mypoint.distance(4, 5));
        System.out.println("Total distance between mypoint and another point "+ mypoint.distance(mypoint, 10,15));
    }

   
}
