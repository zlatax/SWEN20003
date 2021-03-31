// Q2 Using the principle of delegation, create a Point class and replace the attributes of Rectangle with instances of Point.


public class Point {
    
  private double x;
  private double y;

  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double getX() {
      return this.x;
  }

  public double getY() {
    return this.y;
  }

  public void setX(double x){
    this.x = x;
  }

  public void setY(double y){
    this.y = y;
  } 

  public double distanceTo(Point other) {
    return Math.sqrt(Math.pow(this.x - other.getX(),2) + Math.pow((this.y - other.getY()) ,2));
  }

  public Point getDirection (Point other) {
    double xd = (other.getX()-this.getX())/distanceTo(other);
    double yd = (other.getY()-this.getY())/distanceTo(other);

    return new Point(xd,yd);
  }

}