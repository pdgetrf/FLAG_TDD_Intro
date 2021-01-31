import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WETTest {
    @Test
    public void myAwesomeTests() {
        int[] input1 = {3};
        int answer1 = BinarySearch.search(input1, 3);
        assertEquals(0, answer1);

        int[] input2 = {1, 2, 3};
        int answer2 = BinarySearch.search(input2, 1);
        assertEquals(0, answer2);

        int answer3 = BinarySearch.search(input2, 3);
        assertEquals(2, answer3);

        int[] input3 = {3, 5, 7, 9, 20};
        int answer4 = BinarySearch.search(input3, 9);
        assertEquals(3, answer4);
    }
}
