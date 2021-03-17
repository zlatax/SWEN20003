public class Circle {
    private double radius;
    private double x,y;

    public Circle() {
        this.radius = 1.0;
        this.x = 0.0;
        this.y = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.x = 0.0;
        this.y = 0.0;
    }

    @Override
    public String toString() {
        return "Circle with radius="+this.radius+",("+this.x+","+this.y+")";
    }

    public boolean equals(Circle other) {
        return this.radius == ((Circle) other).radius &&
                this.x == ((Circle) other).x &&
                this.y == ((Circle) other).y;

        // return this.toString().equals(other.toString())
    }

    public double getRadius() {
        return this.radius;
    }


}
