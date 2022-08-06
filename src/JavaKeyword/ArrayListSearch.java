package JavaKeyword;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSearch {

    public static void main(String[] args) {
        List<String> list_string=new ArrayList<String>();
        list_string.add("Red");
        list_string.add("white");
        list_string.add("Green");
        list_string.add("Blue");
        if(list_string.contains("Black")){
            System.out.println("Element found");
        }else {
            System.out.println("Element not found");
        }
    }
}
