import java.util.*;
class longestNum {
    public String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
        
        if (strNums[0].equals("0")) {
            return "0";
        }
        
        StringBuilder result = new StringBuilder();
        for (String str : strNums) {
            result.append(str);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        longestNum ln = new longestNum();
        int[] nums = {3, 30, 34, 5, 9};
        String result = ln.largestNumber(nums);
        System.out.println(result); // Output: "9534330"
    }
}