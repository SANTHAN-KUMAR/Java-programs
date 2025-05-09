public class poly2 {
    public static void main(String[] args) {
        kemsavee k=new kemsavee();
        k.sound();
    }
}

class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class kemsavee extends Animal{
    @Override
    public void sound() {
        System.out.println("Machaaaaa");
    }
}
