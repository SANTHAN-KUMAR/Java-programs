
import java.util.ArrayList;

public class longPal {
    public static void main(String[] args) {
        String s="maadadaam";
        StringBuilder subString=new StringBuilder();
        for (int i=0;i<s.length();i++) {
            for (int j=i;j<s.length();j++) {
                if ((s.substring(i,j+1)).equals((s.substring(i,j+1)).reverse())) {
                    max=
                }
            }
        }
        int max=0;
        for (int i=0;i<pals.size();i++) {
            String curr=pals.get(i);
            int currLen=curr.length();
            max=Math.max(max,currLen);
        }
        System.out.println(pals);
        System.out.println(max);
    }
}