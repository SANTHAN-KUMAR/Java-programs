public class strings {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        // // String name="Kemsaavee";

        // String emp="Kemsaavee";
    
        // System.out.println(name == emp);
        
        String name2 = new String("Kemsaavee");   // shallow compare.. only compares the memory addresses
        // System.out.println(name2 == emp);

        // System.out.println(name2.equals(emp)); // deep compare.. compares the values of the strings

        StringBuilder builder=new StringBuilder("Numbers are : ");
        builder.append(1);
        builder.append(2);
        builder.append(3);
        System.out.println(builder);
    }
}
