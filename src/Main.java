import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intListSorted = new ArrayList<>();

        for (int value : intList) {
            if (value > 0) {
                if (value % 2 == 0) {
                    intListSorted.add(value);
                }
            }
        }

        Collections.sort(intListSorted);
        System.out.println(intListSorted);
    }
}