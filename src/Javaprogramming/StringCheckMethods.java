package Javaprogramming;

public class StringCheckMethods {

    public static void main(String[] args) {
        //contains method - returns true
        String s1="This is a String";
        boolean b1=s1.contains("is");
        System.out.println(b1);

        //equals
        String s2="This is an Equal method";
        String s3="This is an equal method";
        boolean b2=s2.equals(s3);
        System.out.println(b2);

        //equalsignorecase
        String s4="This is an Equal method";
        String s5="This is an equal method";
        boolean b3=s4.equalsIgnoreCase(s5);
        System.out.println(b3);

        //startswith

        String s6="This is a String";
        boolean b4=s6.startsWith("is");
        System.out.println(b4);
        boolean b5=s6.startsWith("is",2);
        System.out.println(b5);

        //endswith
        String s7="This is a String";
        boolean b6=s7.endsWith("ing");
        System.out.println(b6);

    }
}
