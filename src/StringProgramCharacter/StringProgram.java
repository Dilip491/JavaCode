package StringProgramCharacter;
import java.lang.Character;


public class StringProgram {

    public static void main(String[] args) {
        String str = "Delip Automation Testing";
        String[] s = str.split(" ");
        String rev="";

        System.out.println(s[0]);


        for(String node:s){
            System.out.println(node);
            for(int j=node.length()-1;j>0;j--){
                System.out.print(node.charAt(j));
                node="";
            }
        }
        System.out.println();

    }


    }

