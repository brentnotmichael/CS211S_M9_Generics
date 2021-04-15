import java.util.ArrayList;
import java.util.List;

public class PairTester {

    public static void main(String[] args) {
        List<Pair> pairList = new ArrayList<>();
        pairList.add(new Pair<Integer>(5, 4));
        pairList.add(new Pair<Integer>(4, 5));
        pairList.add(new Pair<Integer>(5, 1));
        pairList.add(new Pair<Integer>(4, 1));
        pairList.add(new Pair<String>("apple", "banana"));
        pairList.add(new Pair<String>("apple", "banana"));
        pairList.add(new Pair<String>("banana", "apple"));
        pairList.add(new Pair<String>("orange", "banana"));
        pairList.add(new Pair<Boolean>(false, true));
        pairList.add(new Pair<Boolean>(true, false));
        pairList.add(new Pair<Boolean>(true, true));
        pairList.add(new Pair<Boolean>(true, false));
        pairList.add(new Pair<Boolean>(true, false));
        pairList.add(new Pair<Character>('a','b'));
        pairList.add(new Pair<Character>('b', 'a'));
        pairList.add(new Pair<Character>('b', 'b'));
        pairList.add(new Pair<Character>('a', 'b'));

        // loop through list and test all pairs
        for (int p = 0; p < pairList.size() - 1; p++) {
            testPair(pairList.get(p), pairList.get(p+1));
        }
    }

    public static void testPair(Pair pair1, Pair pair2) {
        System.out.print("Pair (" + pair1.getFirst() + ", " + pair1.getSecond() + ") ?= Pair (" +
                          pair2.getFirst() + ", " + pair2.getSecond() + ") --> ");
        System.out.println(pair1.equals(pair2));
    }
}
