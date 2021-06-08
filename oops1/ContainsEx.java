package oops1;

import java.util.ArrayList;
import java.util.List;

public class ContainsEx {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();

        items.add("coin");
        items.add("pen");
        items.add("cup");
        items.add("notebook");
        items.add("class");
        

        items.set(3, "watch");
        items.add("bowl");
        items.remove(0);
        items.remove("pen");
        
        for (Object el : items) {

            System.out.println(el);
        }
        
        items.clear();

        if (items.isEmpty()) {

            System.out.println("The list is empty");
        } 
        else {
            System.out.println("The list is not empty");
        }
    
        List<String> colours = new ArrayList<>();

        colours.add(0, "blue");
        colours.add(1, "orange");
        colours.add(2, "red");
        colours.add(3, "green");
        colours.add(4, "orange");

        int idx1 = colours.indexOf("orange");
        System.out.println(idx1);

        int idx2 = colours.lastIndexOf("orange");
        System.out.println(idx2);

        
        
    }
}

