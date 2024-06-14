import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        String[] line;
        ArrayList<Integer> array;
        int arraySize, quries, i, min, max, j, subArrayResult, outSubArrayResult;
        boolean emptyOutSubArray = false;

        try (Scanner reader = new Scanner(System.in)) {

            arraySize = Integer.parseInt(reader.nextLine());
            line = reader.nextLine().split(" ");

            array = stringToIntegerArray(line, arraySize);
            quries = Integer.parseInt(reader.nextLine());

            for (i = 0; i < quries; i++) {

                subArrayResult = -1;
                outSubArrayResult = -1;

                line = reader.nextLine().split(" ");
                min = Integer.parseInt(line[0]);
                max = Integer.parseInt(line[1]);

                if (arraySize == max - min + 1) {
                    outSubArrayResult = 0;
                    emptyOutSubArray = true;
                }

                for (j = 0; j < arraySize; j++) {

                    if (j >= min - 1 && j <= max - 1) {
                        subArrayResult &= array.get(j);
                    } else if (!emptyOutSubArray) {
                        outSubArrayResult &= array.get(j);
                    }
                }

                if (subArrayResult == outSubArrayResult)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        } catch (NumberFormatException | NoSuchElementException e) {

            System.out.println("Invalid Input Format");
        }
    }

    public static ArrayList<Integer> stringToIntegerArray(String[] str, int size) {

        ArrayList<Integer> arr = new ArrayList<>();
        int i, num;

        for (i = 0; i < size; i++) {
            num = Integer.parseInt(str[i]);
            arr.add(num);
        }
        return arr;
    }
}
