public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return base * height / 2.0;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "color=" + this.getColor() +
                ", base=" + base +
                ", height=" + height + ']';
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
