import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArr = str.split(" ");


        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.valueOf(strArr[i]);

        }

        if (checkOrdered(arr)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean checkOrdered(int[] arr) {
        if (arr.length < 3) {
            return true;
        }

        int direction = findDirection(arr);
        boolean ordered = true;

        if (direction == 1) { // up
            for (int i = 0; i < arr.length - 2; i++) {
                if (arr[i] > arr[i + 1]) {
                    ordered = false;
                    break;
                }
            }
        } else if (direction == -1) { // down
            for (int i = 0; i < arr.length - 2; i++) {
                if (arr[i] < arr[i + 1]) {
                    ordered = false;
                    break;
                }
            }
        } else {
            ordered = false;
        }

        return ordered;
    }

    private static int findDirection(int[] arr) {
        int direction = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int first = arr[i];
            int second = arr[i + 1];
            if (first > second) {
                direction = -1;
                break;
            } else if (first < second) {
                direction = 1;
                break;
            }
        }
        return direction;
    }
}