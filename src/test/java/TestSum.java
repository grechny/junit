import by.grechny.junit.Sum;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestSum {

    @Test
    public void testNull () {
        Sum sum = new Sum();
        int expected = 0;
        int actual = sum.getSum(new ArrayList<Integer>());
        assertEquals("failure - should be equal",expected,actual);
    }

    @Test
    public void testInt () {
        Sum sum = new Sum();
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(1);
        aList.add(100);
        aList.add(1000);
        int expected = 0;
        for (int num : aList){
            expected += num;
        }
        int actual = sum.getSum(aList);
        assertEquals("failure - should be 0",expected,actual);
    }

    @Test
    public void testLong () {
        Sum sum = new Sum();
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(Integer.MAX_VALUE);
        aList.add(Integer.MAX_VALUE);
        aList.add(Integer.MAX_VALUE);
        long expected = 0;
        for (long num : aList){
            expected += num;
        }
        long actual = sum.getSum(aList);
        assertEquals("long numbers sum failure",expected,actual);
    }
}
