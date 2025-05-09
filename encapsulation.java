public class encapsulation {
    public static void main(String[] args) {
        Macha kes=new Macha();
        kes.setAge(18);
        kes.setName("Macha kesava");
        System.out.println(kes.getName());
        System.out.println(kes.getAge());
    }
}

class Macha{
    private int age; // private is set to fully encapsulate
    private String name;
    private int id;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

}
