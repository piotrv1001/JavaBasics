import java.util.Arrays;

public class Main {

    static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {

//        int a = 7;
//        int b = 6;
//        int sum = sum(7, 6);
//        System.out.println(a + " + " + b + " = " + (7+6));
//        System.out.println(a + " + " + b + " = " + sum(a, b));
//        char a = 97;
//        System.out.println(a);
        String str = "Hello world";
        String[] strings = str.split(" ");
        for(int i = 0; i < strings.length; i++){
            System.out.println("Word " + (i + 1) + ": " + strings[i]);
        }
        int[] nums = {1, 2, 3, 4, 5};
        for(int num : nums){
            System.out.println(num);
        }
    }
}
