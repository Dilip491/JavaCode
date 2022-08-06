package StringProgramCharacter;

import java.util.Scanner;

public class FindNumberofVowels {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int vowels=0,consonants=0;
        System.out.println("Enter a character : ");
        String str=sc.next();

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
                c=Character.toLowerCase(c);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels++;
            }else
                consonants++;
        }
        System.out.println("Vowels :"+vowels);
        System.out.println("consonants :"+consonants);

    }

}
