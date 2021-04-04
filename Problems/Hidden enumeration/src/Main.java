public class Main {

    public static void main(String[] args) {
        Secret[] array = Secret.values();
        int counter = 0;
        for (Secret status : array) {
            if (status.name().startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

/* sample enum for inspiration
   enum Secret {
    STAR, CRASH, START, // ...
}
*/