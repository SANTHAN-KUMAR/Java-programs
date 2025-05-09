import java.util.HashMap;
import java.util.Scanner;

public class numToWords {
    public static void main(String[] args) {
        HashMap<Integer,String> map1=new HashMap<>();
        map1.put(1,"One");
        map1.put(2,"Two");
        map1.put(3,"Three");
        map1.put(4,"four");
        map1.put(5,"Five");
        map1.put(6,"Six");
        map1.put(7,"Seven");
        map1.put(8,"Eight");
        map1.put(9,"Nine");
        HashMap<Integer,String> map2=new HashMap<>();
        map2.put(2,"Twenty");
        map2.put(3,"Thirty");
        map2.put(4,"forty");
        map2.put(5,"Fifty");
        map2.put(6,"Sixty");
        map2.put(7,"Seventy");
        map2.put(8,"Eighty");
        map2.put(9,"Ninety");
        HashMap<Integer,String> map3=new HashMap<>();
        map3.put(11,"Eleven");
        map3.put(12,"Twelve");
        map3.put(13,"Thirteen");
        map3.put(14,"Fourteen");
        map3.put(15,"Fifteen");
        map3.put(16,"Sixteen");
        map3.put(17,"Seventeen");
        map3.put(18,"Eighteen");
        map3.put(19,"Nineteen");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
    }
}
