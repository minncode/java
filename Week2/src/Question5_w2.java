public class Question5_w2 {
    public static void main(String[] args) {
        System.out.println("Generate 100 integer in range [0,9] and count each number");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+": "+(int) (Math.random() * 100));
        }
    }
}