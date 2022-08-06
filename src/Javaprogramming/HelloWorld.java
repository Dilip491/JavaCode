package Javaprogramming;

public class HelloWorld {

    public static void main(String[] args) {

        char[] s1={'h','e','l','l','o'};
        String s2=new String(s1);

        System.out.println(s2);

        String s3=new String();
        s3="Dilip";
        System.out.println(s3);

        String s4="Simply";
        String s5="Coding";
        String s6=s4.concat(s5);
        System.out.println(s6);

    }
}
