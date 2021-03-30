import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridges = scanner.nextInt();
        int[] bridgesHeight = new int[bridges];
        for (int i = 0; i < bridgesHeight.length; i++) {
            bridgesHeight[i] = scanner.nextInt();
        }
        willCrash();

    }
        public static void willCrash (int busHeight, int[] bridgesHeight) {

            for (int i = 0; i < bridgesHeight.length; i++) {

                if (bridgesHeight[i] <= busHeight) {
                    System.out.println("will crash on bridge " + (i + 1));
                    continue;

                } else {
                    System.out.println("Will not crash");
                    continue;
                }
            }
        }
}