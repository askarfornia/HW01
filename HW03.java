public class HW03 {
    public static void main(String[] args) {
        int[] numbers = {3, 9, 1, 8, 4, 8, 5};
        System.out.println(arrayMin(numbers));

    }

    public static int arrayMin(int[] a) {
        int min = a[0];
        for (int v : a) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }
}







