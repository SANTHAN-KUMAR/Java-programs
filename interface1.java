class interface1{
    public static void main(String[] args) {
        
    }
}

interface Vehicle{
    int num=0;
    String comp="Hyundai";
    public void start(); //no main logic here
    public void stop();  //no main logic here
}

interface User {
    int num=13;
    String name="Kemsaaavee";
    public void Name(); //no main logic here
    public void Num();  //no main logic here
}

class Manager implements Vehicle, User{
    int num;
    String name;
    @Override
    public void start() {
        System.out.println("Car started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
    public void Name() {
        System.out.println("Kemsavee's");
    }
    public void Num() {
        System.out.println("99XXXXXXX9");
    }
}