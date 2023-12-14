public class SearchInsert {
    public static void main(String[] args) {
        int n[] = new int[] {1,3,5,6};
        System.out.println(searchInsert(n, 6));
        
    }
    private static int searchInsert(int[] n, int target) {
        int start = 0;
        int end = n.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (n[mid] == target) {
                return mid;  // Target found at mid index
            } else if (n[mid] < target) {
                start = mid + 1;  // Search in the right half
            } else {
                end = mid - 1;  // Search in the left half
            }
        }
        return start;
    }
}
