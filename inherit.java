public class inherit {
    public static void main(String[] args) {
        Driver d = new Driver();
        d.id = 1;
        d.name = "Abbu";
        User u=new User();
        u.name="Kemsaave";
        u.welcome(u.name);
        d.acceptBooking(d.name);
    }
}

class wooberUser {
    int id;
    String name;
    int age;
    String address;
    String PhNo;

    public static void welcome(String name) {
        System.out.println("Welcome !" + name);
    }
}
class User extends wooberUser {
    String PetName;
}
class Driver extends wooberUser {
    String VehicleName;
    String VehicleNo;

    public void acceptBooking(String name) {
        System.out.println(name+" accepted your booking!!");
    }
}
