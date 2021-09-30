public class ArrayInsertion {
    public static void main(String[] args) {
        int index = 2;
        int value = 3;
        int[] arr;
        arr = new int[] { 1, 2, 4, 5, 6, 7, 8, 9, 0 };
        int len = arr.length;
        for (int i = len - 2; i >= index; i--) {
            try {
                if (i != index) {
                    arr[i + 1] = arr[i];
                } else {
                    arr[i + 1] = arr[i];
                    arr[index] = value;
                }
            } catch (Exception e) {

                System.out.println("Index out of bound");
            }

        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
