import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

//        int[] numList = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
//        int[] numbers = new int[10];
//        int count = 0;
//        for (int i = 0; i < numList.length; i++) {
//            if (numList[i] > 0 && numList[i] % 2 == 0) {
//                numbers[count] = numList[i];
//                count++;
//            }
//        }


        //System.out.println(Arrays.toString(numbers));

//        int[] newNumArray = new int[count];
//        for (int i = 0; i < count; i++) {
//            newNumArray[i] = numbers[i];
//        }
//        System.out.println(Arrays.toString(newNumArray));
//        Arrays.sort(newNumArray);
//        System.out.println(Arrays.toString(newNumArray));

          List<Integer> numList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
          List<Integer> newNumList = new ArrayList<>();
          for (Integer num : numList) {
              if (num > 0 && num % 2 == 0) {
                  newNumList.add(num);
              }
          }
          Collections.sort(newNumList);
          System.out.println(newNumList);

    }
}