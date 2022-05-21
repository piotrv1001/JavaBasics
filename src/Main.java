import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Point{

    private int x;
    private int y;

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

class Node{

    public int data;
    public Node left;
    public Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Animal{

    protected String name;
    protected String type;

    Animal(){
        System.out.println("Constructed animal");
    }
    Animal(String type){
        this();
        this.type = type;
        System.out.println("Type: " + this.type);
    }
    public void eat(){
        System.out.println("Animal eat");
    }

    public void displayName(){
        System.out.println("My name is: " + this.name);
    }
}

class Dog extends Animal{

    Dog(){
        super("Animal");
        System.out.println("Constructed dog");
    }
    @Override
    public void eat() {
        //super.eat();
        System.out.println("Dog eat");
    }

    public void setName(String name){
        this.name = name;
    }
}

abstract class Vehicle{

    abstract void brake();
}

class Bike extends Vehicle{

    @Override
    public void brake(){
        System.out.println("Bike braking");
    }
}

class Car extends Vehicle{


    @Override
    public void brake() {
        System.out.println("Car braking");
    }
}

interface Polygon{

    float getArea(int a, int b);

    int getPerimeter(int... args2);
}

class Rectangle implements Polygon{

    @Override
    public float getArea(int a, int b) {
        return a * b;
    }

    @Override
    public int getPerimeter(int... args) {
        if (args.length != 4){
            System.out.println("Provided too many or too little arguments");
            return -1;
        }
        int sum = 0;
        for(int arg : args){
            sum += arg;
        }
        return sum;
    }
}
public class Main {

    static int sum(int a, int b){
        return a + b;
    }

    static void bubbleSort(ArrayList<Integer> list){

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size() - i - 1; j++){
                if(list.get(j) > list.get(j + 1)){
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    static void invertBinaryTree(Node root){

        if(root == null)
            return;

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);

    }

    static void printInOrder(Node root){

        if(root == null)
            return;

        printInOrder(root.left);

        System.out.println(root.data);

        printInOrder(root.right);
    }
    public static void main(String[] args) {

//        int a = 7;
//        int b = 6;
//        int sum = sum(7, 6);
//        System.out.println(a + " + " + b + " = " + (7+6));
//        System.out.println(a + " + " + b + " = " + sum(a, b));
//        char a = 97;
//        System.out.println(a);
        String str = "Another one";
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

        ArrayList<Integer> mList = new ArrayList<>();
        mList.add(6);
        mList.add(5);
        mList.add(3);
        mList.add(9);
        mList.add(7);
        mList.add(2);
        bubbleSort(mList);
        for(int item: mList){
            System.out.print(item + " ");
        }
        System.out.println("");

        Node root = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        root.left = second;
        root.right = third;
        second.left = fourth;
        second.right = fifth;
        System.out.println("Initial binary tree:");
        printInOrder(root);
        invertBinaryTree(root);
        System.out.println("Inverted binary tree:");
        printInOrder(root);

        Dog dog = new Dog();
        dog.eat();
        dog.setName("Rex");
        dog.displayName();

        Car car = new Car();
        Bike bike = new Bike();
        car.brake();
        bike.brake();

        Rectangle rect = new Rectangle();
        System.out.println("Perimeter is: " + rect.getPerimeter(1, 1, 2, 2));
        System.out.println("Perimeter is: " + rect.getPerimeter(1, 2));
    }
}
