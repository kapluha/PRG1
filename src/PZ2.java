/**
 * Created by akaplun on 01.04.2015.
 */
public class PZ2 {
    public static void main(String args[]) {

        int[] scores1 = {1, 2, 3, 4, 5, 6};
        int[] scores2 = {0, 0, 0, 0, 0, 0};
        System.arraycopy(scores2, 2, scores1, 3, 2);
        for (int i : scores2) System.out.print(i);
    }
}
