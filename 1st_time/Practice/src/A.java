import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        int i, cases, cat1_id, cat2_id;
        ArrayList<Integer> cat1_ancestors, cat2_ancestors;
        String noCases;
        String[] line;

        try (Scanner reader = new Scanner(System.in)) {

            noCases = reader.nextLine();
            cases = Integer.parseInt(noCases);

            for (i = 0; i < cases; i++) {

                line = reader.nextLine().split(" ");
                cat1_id = Integer.parseInt(line[0]);
                cat2_id = Integer.parseInt(line[1]);

                cat1_ancestors = getAncestors(cat1_id);
                cat2_ancestors = getAncestors(cat2_id);

                if (shareAncestors(cat1_ancestors, cat2_ancestors))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        } catch (NumberFormatException | NoSuchElementException e) {

            System.out.println("Invalid Input Format");
        }
    }

    public static ArrayList<Integer> getAncestors(int cat_id) {

        int i;
        ArrayList<Integer> ancestors = new ArrayList<>();

        for (i = 2; i < cat_id; i++) {

            if (cat_id % i == 0)
                ancestors.add(i);

        }
        ancestors.add(cat_id);
        Collections.sort(ancestors);

        return ancestors;
    }

    public static boolean shareAncestors(ArrayList<Integer> ancestors1, ArrayList<Integer> ancestors2) {

        for (int ancestor1 : ancestors1) {

            for (int ancestor2 : ancestors2) {
                if (ancestor2 > ancestor1)
                    break;

                if (ancestor1 == ancestor2)
                    return true;
            }
        }
        return false;
    }
}
