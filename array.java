
import java.util.Scanner;

class array {
    // add, remove, get, getsize functions

    public static int[] add(int[] arr, int index, int value) {
        if (index < arr.length) {
            arr[index] = value;
            return arr;
        } else {
            int[] newArr = new int[index + 1];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            newArr[index] = value;
            return newArr;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the index and value to add");
        int index = sc.nextInt();
        int value = sc.nextInt();

        arr = add(arr, index, value);

        System.out.println("Array after adding the value:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
