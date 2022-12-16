public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat("kitty");
        Dog dog = new Dog("chichi");
        Dog dog1 = new Dog("kiki");

        System.out.println(cat.toString());
        System.out.println(dog.toString());
        System.out.println(dog1.toString());

        cat.greets();
        dog.greets();
        dog.greets(dog1);
    }
}
