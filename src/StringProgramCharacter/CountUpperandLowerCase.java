package StringProgramCharacter;

public class CountUpperandLowerCase {

    public static void main(String[] args) {

        String s="I Am Delip";
        int uppercount=0;
        int lowercount=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isUpperCase(c)){
                uppercount++;
            }else
                lowercount++;
        }
        System.out.println("The uppercase count is :"+uppercount);
        System.out.println("The lowecase count is :"+lowercount);

    }
}
