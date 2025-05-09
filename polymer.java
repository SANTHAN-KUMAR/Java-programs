public class polymer {
    public static int calc(int n1,int n2) {
        return n1+n2;
    }
    public static void main(String[] args) {
        int n1 = 5;
        int n2=5;
        System.out.println("Sum is "+calc(n1,n2));
        System.out.println("Sqaure is "+calc(n1));
    }

    public static int calc(int a) { //method overlaoding
        return a*a;
    }

    //public static String calc(int a, int b) {
      //  int res=a*b;
       // return "Mul is "+res;
    //}
}
// output of the function depends on the no of parameters given