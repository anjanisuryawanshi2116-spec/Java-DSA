public class RangeSumQuery {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int left = 1;
        int right = 3;

        int rangeSum = left == 0 ? prefix[right] : prefix[right] - prefix[left - 1];
        System.out.println("Range sum: " + rangeSum);
    }
}
