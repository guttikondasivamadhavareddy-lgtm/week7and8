import java.util.Random;

public class week7and8 {

    static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    static int shortest(int[] arr) {
        int min = arr[0];
        for (int x : arr) {
            if (x < min) min = x;
        }
        return min;
    }

    static int tallest(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
        }
        return max;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];
        Random rand = new Random();

        // Generate random heights (150–250 cm)
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");

        System.out.println("\nMean height: " + mean(heights));
        System.out.println("Shortest height: " + shortest(heights));
        System.out.println("Tallest height: " + tallest(heights));
    }
}