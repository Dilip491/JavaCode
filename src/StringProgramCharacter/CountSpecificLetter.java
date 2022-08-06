package StringProgramCharacter;

public class CountSpecificLetter {

    public static void main(String[] args) {
        int count=0;
        String s1="This is string Program";
        char samechar='o';

        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(c==samechar){
                count++;
            }

        }
        System.out.println(count);
    }

}
