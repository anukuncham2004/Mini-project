import java.util.Scanner;
public class UtopianTree {
    public static int utopianTree(int n) {
        int height = 1;
        if (n == 0) {
            return height;
        }
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0) {
                height *= 2;
            } 
            else {
                height += 1;
            }
        }
        return height;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int j = 0; j < testCases; j++) {
            int cycles = scanner.nextInt();
            System.out.println(utopianTree(cycles));
        }
        scanner.close();
    }
}