package Javaprogramming;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int x=10,y=20;
        int temp=0;

        temp=x;
        x=y;
        y=temp;

        System.out.println(x+" "+y);
    }
}
