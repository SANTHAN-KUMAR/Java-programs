import java.util.Scanner;
public class base{
    public static int add(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int mul(int a, int b){
        return a * b;
    }
    public static int div(int a, int b){
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the operation you need to do: 1 for add, 2 for sub, 3 for mul, 4 for div");
        int op;
        do { 
            op=sc.nextInt();
            switch(op) {
                case 1:
                    System.out.println("Addition: " + add(a, b));
                    break;
                case 2:
                    System.out.println("Subtraction: " + sub(a, b));
                    break;
                case 3:
                    System.out.println("Multiplication: " + mul(a, b));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println("Division: " + div(a, b));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }
        while (op!=5);
        System.out.println("Exiting the program.");
    }
}