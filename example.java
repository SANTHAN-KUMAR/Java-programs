public class example {
    public static void inc(int age) {
        age++;
        System.out.println("Age after increment: " + age);
    }
    public static void main(String[] args) {
        String[] depts={"CSE", "ECE", "EEE"};
        System.out.println("Name before change: " + depts[0]);
        changeName(depts);
        System.out.println("Name after change 2: " + depts[0]);
    }
    public static void changeName(String[] depts) {
        depts[0]= "AIDS";
        System.out.println("Name after change 1: " + depts[0]);
    }
}
