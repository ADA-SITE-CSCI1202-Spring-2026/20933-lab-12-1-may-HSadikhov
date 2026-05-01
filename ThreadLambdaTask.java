public class ThreadLambdaTask {
    public static void main(String[] args) {

        
        Thread myThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
        });

        
        myThread.start();

        System.out.println("Main method finished.");
    }
}