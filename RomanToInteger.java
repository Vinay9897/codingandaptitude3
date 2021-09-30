import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman Numbers:");
        String str = sc.nextLine();
        System.out.println(romanToInt(str));
        sc.close();
    }

    public static int temp(char c) {

        int a = 0;
        if (c == 'I') {
            a = 1;
        } else if (c == 'V') {
            a = 5;
        } else if (c == 'X') {
            a = 10;
        } else if (c == 'L') {
            a = 50;
        } else if (c == 'C') {
            a = 100;
        } else if (c == 'D') {
            a = 500;
        } else if (c == 'M') {
            a = 1000;
        }
        return a;
    }

    private static int romanToInt(String str) {
        int ans = 0;
        boolean b = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (temp(str.charAt(i)) < temp(str.charAt(i + 1))) {
                ans += temp(str.charAt(i + 1)) - temp(str.charAt(i));
                System.out.println(ans);
                i++;
                b = true;
                if (i == str.length() - 2) {
                    b = false;
                }
            } else {
                ans += temp(str.charAt(i));
                System.out.println(ans);
                b = false;
            }
        }
        if (!b) {
            ans += temp(str.charAt(str.length() - 1));
            System.out.println(ans);
        }

        return ans;
    }
}