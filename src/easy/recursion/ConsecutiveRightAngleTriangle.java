package easy.recursion;

public class ConsecutiveRightAngleTriangle {
    public static void main(String[] args) {

    }

    public static void printRow(int num) {
        // base case
        if (num == 0) return;
        System.out.print("* ");
        printRow(num - 1);

    }

    public  static void pattern(int n, int num)
    {
        // base case
        if (n == 0) return;
        printRow(num);
        System.out.println();

        // recursively calling pattern()
        pattern(n - 1, num + 1);
    }
    public static void consecutiveTriangle() {
        int k = 1;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
