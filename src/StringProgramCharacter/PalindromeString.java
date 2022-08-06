package StringProgramCharacter;

public class PalindromeString {

    public static void main(String[] args) {
        String s="welcome";
        String rev="";

        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            rev=rev+c;
        }if(s.equalsIgnoreCase(rev)){
            System.out.println(rev+": is a palindrome string");
        }else {
            System.out.println(rev+": is not a palindrome string");
        }
    }
}
