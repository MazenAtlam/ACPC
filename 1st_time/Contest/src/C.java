import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class C {

    public static void main(String[] args) {

        String[] line;
        ArrayList<Integer> array, subArray;
        int arraySize, subArraySize, sum, i, num, j, k;

        try (Scanner reader = new Scanner(System.in)) {

            line = reader.nextLine().split(" ");
            arraySize = Integer.parseInt(line[0]);
            subArraySize = Integer.parseInt(line[1]);

            array = new ArrayList<>();
            line = reader.nextLine().split(" ");
            for (i = 0; i < arraySize; i++) {
                num = Integer.parseInt(line[i]);
                array.add(num);
            }

            // subArray = new ArrayList<>();
            // for (i = 0; i < arraySize; i++) {
            //     for (j = i; j < subArraySize - 1; j++) {
            //         subArray.add(array.get(j));
            //     }
            //     for (j = subArraySize - 1; j < arraySize; j++) {
            //         subArray.add(array.get(j));

            //         subArray.remove(j);
            //     }
            // }
            // for (i = 0; i < arraySize; i++) {
            //     subArray = generateSubArray(array, i, subArraySize);
            // }
            // for (i = 0; i < arraySize; i++) {
            //     subArray.add(array.get(i));
            //     for (j = 1; j < subArraySize; j++) {
            //         subArray.add(array.get(i + j));
            //         for (k = i + j;)
            //     }
            // }
            // for (i = 0; i < arraySize; i++) {
            //     subArray.add(array.get(i));
            //     for (j = i + 1; j < arraySize; j++) {
            //         subArray.add(array.get(j));
            //         for (k = j + 1; k < arraySize; k++) {
            //             subArray.add(array.get(k));

            //             subArray.remove(k);
            //         }
            //     }
            //     subArray.clear();
            // }
        } catch (NumberFormatException | NoSuchElementException e) {
            System.out.println("Invalid Input Format");
        }
    }

    public static ArrayList<Integer> getFactors(int num) {

        int i;
        ArrayList<Integer> factors = new ArrayList<>();

        for (i = 2; i < num; i++) {

            if (num % i == 0)
                factors.add(i);

        }
        factors.add(num);
        Collections.sort(factors);

        return factors;
    }

    // public static boolean isCoprime(ArrayList<Integer> factors1, ArrayList<Integer> factors2, ArrayList<Integer> factors3) {

    //     for (int factor1 : factors1) {

    //         for (int factor2 : factors2) {

    //             if (factor2 > factor1)
    //                 break;

    //             for (int factor3 : factors3) {

    //                 if (factor3 > factor2)
    //                     break;

    //                 if (factor1 == factor2 && factor1 == factor3)
    //                     return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    // public static ArrayList<Integer> generateSubArray(ArrayList<Integer> arr, int startIndex, int subArrSize) {

    //     ArrayList<Integer> subArr = new ArrayList<>();

    //     if (startIndex == subArrSize - 1) {
    //         subArr.add(arr.get(subArrSize - 1));
    //     } else {
    //         subArr.add(arr.get(startIndex));
    //         subArr.addAll(generateSubArray(arr, startIndex + 1, subArrSize));
    //     }
    //     return subArr;
    // }
}
