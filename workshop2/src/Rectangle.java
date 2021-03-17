public class Rectangle {
    private double width, height;
    private int left, top;
    public Rectangle() {
        this.left = 0;
        this.top = 0;
        this.width = 0.0;
        this.height=0.0;
    }

    public Rectangle(int left, int top, double width, double height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle with coordinates ("+this.top+","+this.left+") Width:"+this.width+" Height:"+this.height;
    }

    public boolean equals(Rectangle other) {
        return this.left == ((Rectangle) other).left &&
                this.top == ((Rectangle) other).top &&
                this.width == ((Rectangle) other).width &&
                this.height == ((Rectangle) other).height;
    }


}
