
import java.util.HashMap;

class LongestSubstring {
    public static void main(String[] args) {
        String s="abcabcbb";
        int startIndex=0;
        int n=s.length();
        int l=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for (int r=0;r<n;r++) {
            char curr=s.charAt(r);
            if (!map.containsKey(curr)) {
                map.put(curr,r);
            }
            else {
                l=Math.max(l,map.get(curr)+1);
                map.put(curr,r);
            }
            max=Math.max(max,(r-l)+1);
            startIndex = l;
        }
        System.out.println(max);
        System.out.println(map);
        System.out.println(s.substring(startIndex,(startIndex+max)));
    }
}