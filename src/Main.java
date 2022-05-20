import java.util.Arrays;
import java.util.Scanner;

class Point{

    private int x = 0;
    private int y = 0;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int newX){
        this.x = newX;
    }

    public void setY(int y) {
        this.y = y;
    }
}


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
        float x = 10.0f;
        float y = 3.0f;
        float result = x / y;
        float rounded = Math.round(result * 100.0f) / 100.0f;
        System.out.println(rounded);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Give me a number");
//        int number = input.nextInt();
//        System.out.println("You entered: " + number);
//        System.out.println("Give me your name");
//        String name = input.next();
//        System.out.println("Your name is: " + name);
//        input.close();

        Point p1 = new Point(100, 100);
        // Point p2 = new Point();
        p1.setX(5);
        p1.setY(4);
        System.out.println("X = " + p1.getX());
        System.out.println("Y = " + p1.getY());

        String str1 = "Hello world";
        String lowerStr1 = str1.toLowerCase();
        if (str1.equals(lowerStr1)){
            System.out.println(str1 + " is all lowercase");
        }else{
            System.out.println(str1 + " is not all lowercase");
        }
    }
}
