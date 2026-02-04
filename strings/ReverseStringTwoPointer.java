public class ReverseStringTwoPointer {
    public static void main(String[] args) {

        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        int left = 0, right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println(arr);
    }
}
