public class constructor {
    public static void main(String[] args) {
        kesavudu k=new kesavudu(16,6,"Kesavee",65,2);
        System.out.println(k.age);

        kesavudu k2=new kesavudu(18,6,"Snake",65,2);
        System.out.println(k2.age);
        System.out.println(k2.name);
    }
}

class kesavudu{
    int age;
    int height;
    String name;
    int weight;
    int gb;

    kesavudu(int age,int height, String name, int weight, int gb){
        this.age=age+2;
        this.height=height;
        this.name=name;
        this.weight=weight;
        this.gb=gb;
    }
}
