import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;


public class TestBubbleSort {
    @Test
    public void testBubbleSort() {
        assertTrue(Arrays.equals(BubbleSort.BubbleSort(new int[]{3, 6, 4, 5, 2, 1}), new int[]{1, 2, 3, 4, 5, 6}));
        assertTrue(Arrays.equals(new int[]{2, 2, 5, 7, 9, 34}, BubbleSort.BubbleSort(new int[]{34, 5, 2, 9, 2, 7})));
        assertTrue(Arrays.equals(new int[]{245, 3424, 4856, 4856, 35678},
                BubbleSort.BubbleSort(new int[]{245, 4856, 3424, 435678, 856})));
    }
}
