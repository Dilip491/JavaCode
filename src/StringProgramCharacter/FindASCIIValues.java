package StringProgramCharacter;

public class FindASCIIValues {

    public static void main(String[] args) {

        String s1="ITS SIMPLE";

        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            System.out.println(c+"->"+(int)c);
        }


    }
}
