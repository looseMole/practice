import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args){
        DayOne dayOne = new DayOne();
        Day[] days = {dayOne};
        int[] arrayToSearch = createSortedArray(200);
        for(Day day : days){
            testChopMethod(day);
        }
    }

    private static int[] createSortedArray(int size) {
        int[] sortedArray = new int[size];

        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = i + 1;
        }

        return sortedArray;
    }

    @Test
    private static void testChopMethod(Day day){
        int[] emptyArray = new int[0];
        int[] oneArray = {1};
        int[] threeArray = {1, 3, 5};
        int[] fourArray = {1, 3, 5, 7};

        assertEquals(-1, day.chop(3, emptyArray));
        assertEquals(-1, day.chop(3, oneArray));
        assertEquals(0,  day.chop(1, oneArray));

        assertEquals(0,  day.chop(1, threeArray));
        assertEquals(1,  day.chop(3, threeArray));
        assertEquals(2,  day.chop(5, threeArray));
        assertEquals(-1, day.chop(0, threeArray));
        assertEquals(-1, day.chop(2, threeArray));
        assertEquals(-1, day.chop(4, threeArray));
        assertEquals(-1, day.chop(6, threeArray));

        assertEquals(0,  day.chop(1, fourArray));
        assertEquals(1,  day.chop(3, fourArray));
        assertEquals(2,  day.chop(5, fourArray));
        assertEquals(3,  day.chop(7, fourArray));
        assertEquals(-1, day.chop(0, fourArray));
        assertEquals(-1, day.chop(2, fourArray));
        assertEquals(-1, day.chop(4, fourArray));
        assertEquals(-1, day.chop(6, fourArray));
        assertEquals(-1, day.chop(8, fourArray));
    }
}
