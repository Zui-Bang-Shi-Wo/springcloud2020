public class Test {
    private static final int THREADS_CONUT = 20;
    public static int count = 0;

    public static void increase() {
        count++;
    }

    public static void main(String[] args) {
        System.out.println("学习使我快乐！！");
//        Thread[] threads = new Thread[THREADS_CONUT];
//        for (int i = 0; i < THREADS_CONUT; i++) {
//            threads[i] = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    for (int i = 0; i < 1000; i++) {
//                        increase();
//                    }
//                }
//            });
//            threads[i].start();
//        }
//
//        while (Thread.activeCount() > 1) {
//            Thread.yield();
//        }
//        System.out.println(count);
    }


}
