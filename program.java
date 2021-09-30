public class program {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String[] arr = { "vinay", "shivam", "priyansh", "utkarsh" };

        for (int i = 0; i < arr.length; i++) {
            char[] c = arr[i].toCharArray();
            int len = c.length;

            for (int j = 0; j < len; j++) {

                for (int k = j + 1; k < len; k++) {
                    if (c[k] < c[j]) {
                        char temp = c[j];
                        c[j] = c[k];
                        c[k] = temp;
                    }
                }
                // System.out.println(c);
            }
            arr[i] = String.valueOf(c);
            System.out.println(arr[i]);

        }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        long stopTime = System.currentTimeMillis();
        float executionTime = (stopTime - startTime) / 1000F;
        System.out.print("Execution Time is nanoseconds: " + executionTime + "seconds");
    }
}
