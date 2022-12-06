import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args){
        int[] arrayToSearch = createSortedArray(200);



    }

    private static int[] createSortedArray(int size) {
        int[] sortedArray = new int[size];

        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = i + 1;
        }

        return sortedArray;
    }

    @Test
    private void testChopMethod(Day day){
        assertEquals(-1, day.chop(3, []));
        assertEquals(-1, day.chop(3, [1]));
        assertEquals(0,  day.chop(1, [1]));

        assertEquals(0,  day.chop(1, [1, 3, 5]));
        assertEquals(1,  day.chop(3, [1, 3, 5]));
        assertEquals(2,  day.chop(5, [1, 3, 5]));
        assertEquals(-1, day.chop(0, [1, 3, 5]));
        assertEquals(-1, day.chop(2, [1, 3, 5]));
        assertEquals(-1, day.chop(4, [1, 3, 5]));
        assertEquals(-1, day.chop(6, [1, 3, 5]));

        assertEquals(0,  day.chop(1, [1, 3, 5, 7]));
        assertEquals(1,  day.chop(3, [1, 3, 5, 7]));
        assertEquals(2,  day.chop(5, [1, 3, 5, 7]));
        assertEquals(3,  day.chop(7, [1, 3, 5, 7]));
        assertEquals(-1, day.chop(0, [1, 3, 5, 7]));
        assertEquals(-1, day.chop(2, [1, 3, 5, 7]));
        assertEquals(-1, day.chop(4, [1, 3, 5, 7]));
        assertEquals(-1, day.chop(6, [1, 3, 5, 7]));
        assertEquals(-1, day.chop(8, [1, 3, 5, 7]));
    }
}
