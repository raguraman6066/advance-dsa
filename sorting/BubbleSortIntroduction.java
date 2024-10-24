import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * BubbleSortIntroduction
 */
public class BubbleSortIntroduction {
    public static void main(String[] args) {
        List l = new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(1);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);

    }
}