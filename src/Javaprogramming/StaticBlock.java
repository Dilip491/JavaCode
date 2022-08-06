package Javaprogramming;

public class StaticBlock {

    private static int count=1;
    private static String name;
    private static int age;

    static {
        System.out.println(count);
        name="Dilip";
        age=29;

    }

    public static void main(String[] args){

        System.out.println(name);
        System.out.println(age);
    }


}
