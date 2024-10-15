public class Point{
  private double x,y;

  public String toString(){
    return "(" + getX() + ", " + getY() + ")";
  }

  //Initialize this Point to have the same values as the other Point.
  public Point(Point other){
    this.x = other.getX();
    this.y = other.getY();
  }

  //Initialize this Point to have the provided values
  public Point(double x, double y){
    this.x=x;
    this.y=y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other){
    return Math.sqrt(Math.pow((x - other.getX()), 2) + Math.pow((y - other.getY()), 2));
  }

  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
  }
}
