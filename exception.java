public class exception {
    public static void main(String[] args) {
            int a = 5;
            int b = 0;
            try {
                int c=a/b;
            } catch (ArithmeticException e) {
                System.out.println("Error!!\n");
                e.printStackTrace();
            }
            finally {
                System.out.println("Program exited with error code");
            }
    }
}
