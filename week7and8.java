import java.util.Scanner;

public class week7and8 {

    static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not a natural number");
            return;
        }

        int rSum = recursiveSum(n);
        int fSum = formulaSum(n);

        System.out.println("Recursive Sum: " + rSum);
        System.out.println("Formula Sum: " + fSum);

        if (rSum == fSum) {
            System.out.println("Both results are correct");
        } else {
            System.out.println("Mismatch in results");
        }
    }
}