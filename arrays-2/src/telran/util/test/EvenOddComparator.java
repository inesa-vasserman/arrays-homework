package telran.util.test;

import java.util.Comparator;

public class EvenOddComparator implements Comparator<Integer> {

	
	@Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 == 0 && o2 % 2 == 0) {
            return o1.compareTo(o2);
        } else if (o1 % 2 != 0 && o2 % 2 != 0) {
            return o2.compareTo(o1);
        } else {
            return o1 % 2 == 0 ? -1 : 1;
        }
    }

}
