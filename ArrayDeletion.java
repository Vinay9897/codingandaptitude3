public class ArrayDeletion {
    public static void main(String[] args) {
        int index = 2;
        int value = 3;
        int[] arr;
        arr = new int[] { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9 };
        int len = arr.length;
        for (int i = index; i < len - 1; i++) {
            try {
                if (i != len - 1) {
                    arr[i] = arr[i + 1];
                } else {
                    break;
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
