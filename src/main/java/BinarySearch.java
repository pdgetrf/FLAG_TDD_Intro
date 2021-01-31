public class BinarySearch {

    public static int search(int[] data, int target) {
        int start = 0;
        int end = data.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (data[mid] == target) {
                return mid;
            }
            if (target > data[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
