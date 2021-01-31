import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrameworkTest {

    @Test
    public void testBinarySearch() {
        int[][] inputs = {
                {},
                {3},
                {3},
                {1, 3},
                {1, 3},
                {4, 6, 8},
                {4, 6, 8},
                {4, 6, 8},
                {3, 5, 7, 9, 20},
                {3, 5, 7, 9, 20},
        };
        int[] targets = {9, 1, 3, 1, 3, 4, 6, 8, 3, 9};
        int[] answer = {-1, -1, 0, 0, 1, 0, 1, 2, 0, 3};

        assertEquals(inputs.length, targets.length);
        assertEquals(inputs.length, answer.length);

        for (int i = 0; i < inputs.length; i++) {
            int actual = BinarySearch.search(inputs[i], targets[i]);
            int expected = answer[i];
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testLinearSearch() {
        int[][] inputs = {
                {},
                {3},
                {3},
                {1, 3},
                {1, 3},
                {4, 6, 8},
                {4, 6, 8},
                {4, 6, 8},
                {3, 5, 7, 9, 20},
                {3, 5, 7, 9, 20},
        };
        int[] targets = {9, 1, 3, 1, 3, 4, 6, 8, 3, 9};
        int[] answer = {-1, -1, 0, 0, 1, 0, 1, 2, 0, 3};

        assertEquals(inputs.length, targets.length);
        assertEquals(inputs.length, answer.length);

        for (int i = 0; i < inputs.length; i++) {
            int actual = LinearSearch.search(inputs[i], targets[i]);
            int expected = answer[i];
            assertEquals(expected, actual);
        }
    }
}
