package Javaprogramming;

public class StringPositionMethods {

    public static void main(String[] args) {

        //length
        String s1="Hello";
        int len=s1.length();
        System.out.println(len);

        //indexof
        String s2="This is a String";
        int i1=s2.indexOf('i');
        System.out.println(i1);
        int i2=s2.indexOf("is",3);
        System.out.println(i2);

        //lastindex
        String s3="This is a String";
        int i3=s3.lastIndexOf('i');
        System.out.println(i3);


        //compareTo - //returns 0 if it is matches
                      //retruns 32 or -32
        String s4="This is a string";
        String s5="This is a String";
        int i4=s4.compareTo(s5);
        System.out.println(i4);

    }
}
