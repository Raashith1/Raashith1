package tryout;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupFactor {

     Map<Integer, List<Integer>> factorGroup = new HashMap<Integer,
List<Integer>>();
     int maxNumber = 1000;
     int divNumber = 100;

     public GroupFactor() {

         for (int i = 1; i <= maxNumber; i++) {
             for (int j = 2; j <= divNumber; j++) {
                 List<Integer> factorList = factorGroup.get(j);
                 if (i % j == 0) {

                     if (factorList == null) {
                         factorList = new LinkedList<Integer>();
                     }

                     factorList.add(i);
                 }

                 factorGroup.put(j, factorList);
             }
         }

         for (Integer key : factorGroup.keySet()) {
             System.out.println("NUMBER:" + key);
             System.out.println("-----------------------");
             for (Integer value : factorGroup.get(key)) {
                 System.out.println(value);
             }
             System.out.println("-----------------------");
         }

     }

     public static void main(String[] args) {
         new GroupFactor();
     }
}
