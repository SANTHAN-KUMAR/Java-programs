
import java.util.*;

public class arrayOperations {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
        System.out.println("Array before adding 1: " + arr);
        arr.add(1);
        System.out.println("Array after adding 1: ");
        Collections.sort(arr);
        System.out.println(arr);
    }
}
