public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        if (width >= 1) {
            this.width = width;
        } else {
            System.out.println("input width is negative!");
            this.width = 1;
        }
        if (height >= 1) {
            this.height = height;
        } else {
            System.out.println("input height is negative!");
            this.height = 1;
        }
    }

    public void Visualize() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}