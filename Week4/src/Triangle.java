public class Triangle {
    int x;
    int y;
    int z;

    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String Verify() {
        if (x < y + z && y < x + z && z < x + y) {
            if (this.x == this.y && this.y == this.z) {
                return "Equilateral Triangle";
            } else if (this.x == this.y || this.x==this.z || this.y==this.z) {
                return "Isosceles Triangle";
            } else {
                return "Scalene Triangle";
            }
        }
        else {
            return "Not Triangle";
        }
    }
}
