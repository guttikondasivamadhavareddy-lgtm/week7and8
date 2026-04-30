import java.util.Scanner;

public class week7and8 {

    static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int result = calculateHandshakes(n);

        System.out.println("Maximum number of handshakes: " + result);
    }
}